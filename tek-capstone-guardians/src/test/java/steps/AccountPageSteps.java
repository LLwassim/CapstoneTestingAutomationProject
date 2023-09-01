package steps;

import org.junit.Assert;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.POMFactory;
import utilities.CommonUtility;

public class AccountPageSteps extends CommonUtility {

	POMFactory factory = new POMFactory();

//	Scenario: Verify User can update Profile Information
	@When("User click on Account option")
	public void clickAccount() {
		click(factory.signInPage().accountLink);
	}

	@And("User update Name ‘NameValue’ and Phone ‘PhoneValue’")
	public void sendUpdateData() {
		sendText(factory.signInPage().nameInput, generateRandomName());
		sendText(factory.accountPage().phoneInput, generateRandomPhoneNumber());
	}
	@And("User click on Update button")
	public void clickUpdate() {
	click(factory.accountPage().personalBtn);
	}
	@Then("user profile information should be updated")
	public void accountUpdated() {
		Assert.assertTrue(isElementDisplayed(factory.accountPage().updateMessage));
	}

//	Scenario: Verify User can add a payment method
//	@When("User click on Account option")
//	public void hds() {
//int a = 0;
//	}
//
//	@And("User click on Add a payment method link")
//	public void hsdd() {
//		int a = 0;
//	}
//
//	// |cardNumber|nameOnCard|expirationMonth|expirationYear|securityCode||value|value|value|value|value|
//	
//	@And("User click on Add your card button")
//	public void hsd() {
//		int a = 0;
//	}
//
//	@Then("a message should be displayed‘Payment Method added successfully’​")
//	public void hsdddd() {
//		int a = 0;
//	}
//
////	Scenario: Verify User can edit Debit or Credit card
//	@When("User click on Account option")
//	public void hsd3() {
//		int a = 0;
//	}
//
//	@And("User click on Edit option of card section")
//	public void ehs() {
//		int a = 0;
//	}
//
//	@And("user edit information with below data")
//	public void hs33() {
//
//	}
//
//	// |cardNumber|nameOnCard|expirationMonth|expirationYear|securityCode||value|value|value|value|value|
//	@And("user click on Update Your Card button")
//	public void h2s() {
//
//	}
//
//	@Then("a message should be displayed‘Payment Method updated Successfully’​")
//	public void hsq() {
//
//	}
//
////	Scenario: Verify User can remove Debit or Credit card
//	@When("User click on Account option")
//	public void qwhs() {
//
//	}
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

}
