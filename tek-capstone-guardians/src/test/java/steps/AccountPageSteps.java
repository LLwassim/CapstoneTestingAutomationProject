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
		logger.info("text is cleared");
		String name = RandomDataGenerator.generateRandomName();
		this.name = name;
		sendText(factory.signInPage().nameInput, name );
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

	//Scenario: Verify User can add a payment method

//
	@And("User click on Add a payment method link")
	public void clickAddPayment() {
		click(factory.accountPage().paymentMethodLink);
	}
	 @And ("User fill Debit or credit card information")
	 public void fillInfo() {
		 sendText(factory.accountPage().cardNumberInput, RandomDataGenerator.generateRandomCardNumber());
		 sendText(factory.accountPage().cvvInput, "293");
		 sendText(factory.accountPage().nameOnCard, RandomDataGenerator.generateRandomName());

		 for(int i = 0; i < 0; i++) {
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
	//Access the datatable in cucumber and use as a paramater
	public void userEditInformationWithBelowData(DataTable dataTable) {
		//make a map list to create a list of key pairs
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
		if(payUpMsg == "Payment Method updated Successfully") {
			Assert.assertTrue(factory.accountPage().paymentEditBtn.isDisplayed());
					}
		
	}
}
//
////	Scenario: Verify User can remove Debit or Credit card

//
//	@And("User click on remove option of card section")
//	public void hees() {
//
//	}
//
//	@Then("payment details should be removed ")
//	public void hqqs() {
//
//	}
//
////	Scenario: Verify User can add an Address
//	@When("User click on Account option")
//	public void rhs() {
//		int a = 0;
//	}
//
//	@And("User click on Add address option")
//	public void hps() {
//
//	}
//
//	@And("user fill new address form with below information")
//	public void ths() {
//
//	}
//
////	    |country|fullName|phoneNumber|streetAddress|apt       |city     | state |zipCode   |
////	    |value  | value  | value     | value       |  value   | value   | value | value    |
//	@And("User click Add Your Address button")
//	public void hyys() {
//
//	}
//
//	@Then("a message should be displayed ‘Address Added Successfully’")
//	public void hsss() {
//
//	}
//
////	Scenario: Verify User can edit an Address added on account
//	@When("User click on Account option")
//	public void has() {
//		int a = 0;
//	}
//
//	@And("User click on edit address option")
//	public void haas() {
//
//	}
//
//	@And("user fill new address form with below information ")
//	public void hsqq() {
//
//	}
//
//	// |country|fullName|phoneNumber|streetAddress|apt|city|state|zipCode||value|value|value|value|value|value|value|value|
//	@And("User click update Your Address button")
//	public void hxssxs() {
//
//	}
//
//	@Then("a message should be displayed ‘Address Updated Successfully’")
//	public void hxsxs() {
//
//	}
//
////	Scenario: Verify User can remove Address from Account
//	@When("User click on Account option")
//	public void hxxs() {
//
//	}
//
//	@And("User click on remove option of Address section ")
//	public void hpps() {
//
//	}
//
//	@Then("Address detail should be removed ")
//	public void hwws() {
//
//	}


