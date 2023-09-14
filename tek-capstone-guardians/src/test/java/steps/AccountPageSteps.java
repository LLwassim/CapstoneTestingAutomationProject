package steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.POMFactory;
import utilities.CommonUtility;
import utilities.RandomDataGenerator;

public class AccountPageSteps extends CommonUtility {

	private String name;
	POMFactory factory = new POMFactory();

//	Scenario: Verify User can update Profile Information
	@When("User click on Account option")
	public void clickAccount() {
		click(factory.signInPage().accountLink);
	}

	@And("User update Name ‘NameValue’ and Phone ‘PhoneValue’")
	public void sendUpdateData() {
		factory.signInPage().nameInput.sendKeys(Keys.COMMAND + "a");
		factory.signInPage().nameInput.sendKeys(Keys.DELETE);
		clearTextUsingSendKeys(factory.accountPage().phoneInput);
		String name = RandomDataGenerator.generateRandomName();
		this.name = name;
		sendText(factory.signInPage().nameInput, name);
		sendText(factory.accountPage().phoneInput, RandomDataGenerator.generateRandomPhoneNumber());
	}

	@And("User click on Update button")
	public void clickUpdate() {
		click(factory.accountPage().personalBtn);
	}

	@Then("user profile information should be updated")
	public void accountUpdated() {
		Assert.assertEquals(factory.accountPage().accountName.getText(), name);
	}

	// Scenario: Verify User can add a payment method

//
	@And("User click on Add a payment method link")
	public void clickAddPayment() {
		click(factory.accountPage().paymentMethodLink);
	}

	@And("User fill Debit or credit card information")
	public void fillInfo() {
		sendText(factory.accountPage().cardNumberInput, RandomDataGenerator.generateRandomCardNumber());
		sendText(factory.accountPage().cvvInput, "293");
		sendText(factory.accountPage().nameOnCard, RandomDataGenerator.generateRandomName());

		for (int i = 0; i < 0; i++) {
			selectByIndex(factory.accountPage().expInp, i);
			logger.info(i);
		}
	}

// |cardNumber|nameOnCard|expirationMonth|expirationYear|securityCode||value|value|value|value|value|
//	
	@And("User click on Add your card button")
	public void clickAddCardBtn() {
		click(factory.accountPage().paymentSubmitBtn);
	}

	@Then("a message should be displayed ‘Payment Method added successfully’")
	public void hsdddd() {
		Assert.assertTrue(isElementDisplayed(factory.accountPage().paymentEditBtn));
	}

//	Scenario: Verify User can edit Debit or Credit card

	@And("User click on Edit option of card section")
	public void clickAccount4() {
		click(factory.accountPage().cardHolderDiv);
		click(factory.accountPage().paymentEditBtn);
	}

	@And("user edit information with below data")
	// Access the datatable in cucumber and use as a paramater
	public void userEditInformationWithBelowData(DataTable dataTable) {
		// make a map list to create a list of key pairs
		List<Map<String, String>> cardInfo = dataTable.asMaps(String.class, String.class);
		for (int i = 0; i < cardInfo.size(); i++) {
			factory.accountPage().cardNumberInput.clear();
			sendText(factory.accountPage().cardNumberInput, RandomDataGenerator.generateRandomCardNumber());
			factory.accountPage().nameOnCard.clear();
			sendText(factory.accountPage().nameOnCard, RandomDataGenerator.generateRandomName());
			sendText(factory.accountPage().expInp, cardInfo.get(0).get("expirationMonth"));
			sendText(factory.accountPage().expInp, cardInfo.get(0).get("expirationYear"));
			factory.accountPage().cvvInput.clear();
			sendText(factory.accountPage().cvvInput, cardInfo.get(0).get("securityCode"));
		}
	}

	// |cardNumber|nameOnCard|expirationMonth|expirationYear|securityCode||value|value|value|value|value|
	@And("user click on Update Your Card button")
	public void clickUpdateCard() {
		click(factory.accountPage().paymentSubmitBtn);
	}

	@Then("a message should be displayed ‘Payment Method updated Successfully’")
	public void isMessDisplayed() {
		String payUpMsg = factory.accountPage().payUpdateMsg.getText();
		if (payUpMsg == "Payment Method updated Successfully") {
			Assert.assertTrue(factory.accountPage().paymentEditBtn.isDisplayed());
		}

	}

//	Scenario: Verify User can remove Debit or Credit card

	@And("User click on remove option of card section")
	public void userClickOnRemoveOptionOfCardSection() {
		click(factory.accountPage().paymentList);
		click(factory.accountPage().cardRemoveBtn);
	}

	@Then("payment details should be removed")
	public void paymentDetailsShouldBeRemoved() {
		Assert.assertTrue(factory.accountPage().addCardHeader.isDisplayed());
	}

//Scenario: Verify User can add an Address
	@And("User click on Add address option")
	public void userClickOnAddAddressOption() {
		scrollPageDownWithJS();
		click(factory.accountPage().addAddress);
	}

	@And("user fill new address form with below information")
	public void fillAdressInfo(DataTable dataTable) {
		List<Map<String, String>> address = dataTable.asMaps(String.class, String.class);
		for (int i = 0; i < address.size(); i++) {
			sendText(factory.accountPage().fullNameInput, RandomDataGenerator.generateRandomName());
			sendText(factory.accountPage().phoneNumberInput, RandomDataGenerator.generateRandomPhoneNumber());
			sendText(factory.accountPage().streetInput, address.get(0).get("streetAddress"));
			sendText(factory.accountPage().apartmentInput, address.get(0).get("apt"));
			sendText(factory.accountPage().cityInput, address.get(0).get("city"));
			selectByVisibleText(factory.accountPage().stateInput, address.get(0).get("state"));
			sendText(factory.accountPage().zipCodeInput, RandomDataGenerator.generateRandomZIPCode());

		}

	}

	@And("User click Add Your Address button")
	public void clickAddAddressBton() {
		click(factory.accountPage().addressBtn);
	}

	@Then("a message should be displayed ‘Address Added Successfully’")
	public void addressMsgShown() {
		String message = "Payment Method added successfully";
		waitTillPresence(factory.accountPage().addMsg);
		Assert.assertTrue(message, factory.accountPage().addMsg.isDisplayed());
	}

//	Scenario: Verify User can edit an Address added on account

	@And("User click on edit address option")
	public void clickEditAddress() {
		clickElementWithJS(factory.accountPage().editAddress);

	}

	@And("user can update new address form with below information")
	public void userFillsInInfo(DataTable dataTable) {
		
		
		List<Map<String, String>> addressInfo = dataTable.asMaps(String.class, String.class);
		factory.accountPage().fullNameInput.sendKeys(Keys.COMMAND + "a");
		factory.accountPage().fullNameInput.sendKeys(Keys.DELETE);
		sendText(factory.accountPage().fullNameInput,RandomDataGenerator.generateRandomName());
		factory.accountPage().phoneNumberInput.sendKeys(Keys.COMMAND + "a");
		factory.accountPage().phoneNumberInput.sendKeys(Keys.DELETE);
		sendText(factory.accountPage().phoneNumberInput, RandomDataGenerator.generateRandomPhoneNumber());
		clearTextUsingSendKeys(factory.accountPage().streetInput);
		sendText(factory.accountPage().streetInput, addressInfo.get(0).get("streetAddress"));
		clearTextUsingSendKeys(factory.accountPage().apartmentInput);
		sendText(factory.accountPage().apartmentInput, addressInfo.get(0).get("apt"));
		clearTextUsingSendKeys(factory.accountPage().cityInput);
		sendText(factory.accountPage().cityInput, addressInfo.get(0).get("city"));
		selectByVisibleText(factory.accountPage().stateInput, addressInfo.get(0).get("state"));
		factory.accountPage().zipCodeInput.sendKeys(Keys.COMMAND + "a");
		factory.accountPage().zipCodeInput.sendKeys(Keys.DELETE);
		sendText(factory.accountPage().zipCodeInput, RandomDataGenerator.generateRandomZIPCode());
	}

	
	
	@And("User click update Your Address button")
	public void clickUpdateAddyBtn() {
			click(factory.accountPage().upAdressBtn);
	}

	@Then("a message should be displayed {string}")
	public void updateAddyMsgDisplayed(String msg) {
		waitTillPresence(factory.accountPage().adressUpMsg);
		Assert.assertTrue(msg, factory.accountPage().adressUpMsg.isDisplayed());
	}

	
	
	
	
	
//remove address
	@And("User click on remove option of Address section")
	public void clickRemove() {
		scrollPageDownWithJS();
		click(factory.accountPage().RemoveAddressBtn);
	}

	@Then("Address details should be removed")
	public void addressDetailRemoved() {
		Assert.assertNotNull(factory.accountPage().addressBox1);
	}
}
