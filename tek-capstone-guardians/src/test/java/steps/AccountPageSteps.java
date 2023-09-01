package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AccountPageSteps {
//	Background:
//	    @Given ("User is on retail Web site")
	@When("User click on Sign in option")
	public static void hiw() {

	}

	@And("User enter email 'EmailValue' and password 'PasswordValue'")
	public static void hi2() {

	}

	@And("User click on login button")
	public static void h2i() {

	}

	@And("User should be logged in into Account")
	public static void jis() {

	}

//	Scenario: Verify User can update Profile Information
	@When("User click on Account option")
	public static void hi() {

	}

	@And("User update Name ‘NameValue’ and Phone ‘PhoneValue’")
	public static void shi() {

	}

	@Then("user profile information should be updated")
	public static void hs() {

	}

//	Scenario: Verify User can add a payment method
	@When("User click on Account option")
	public static void hds() {

	}

	@And("User click on Add a payment method link")
	public static void hsdd() {

	}

	// |cardNumber|nameOnCard|expirationMonth|expirationYear|securityCode||value|value|value|value|value|
	@And("User click on Add your card button")
	public static void hsd() {

	}

	@Then("a message should be displayed‘Payment Method added successfully’​")
	public static void hsdddd() {

	}

//	Scenario: Verify User can edit Debit or Credit card
	@When("User click on Account option")
	public static void hsd3() {

	}

	@And("User click on Edit option of card section")
	public static void ehs() {

	}

	@And("user edit information with below data")
	public static void hs33() {

	}

	// |cardNumber|nameOnCard|expirationMonth|expirationYear|securityCode||value|value|value|value|value|
	@And("user click on Update Your Card button")
	public static void h2s() {

	}

	@Then("a message should be displayed‘Payment Method updated Successfully’​")
	public static void hsq() {

	}

//	Scenario: Verify User can remove Debit or Credit card
	@When("User click on Account option")
	public static void qwhs() {

	}

	@And("User click on remove option of card section")
	public static void hees() {

	}

	@Then("payment details should be removed ")
	public static void hqqs() {

	}

//	Scenario: Verify User can add an Address
	@When("User click on Account option")
	public static void rhs() {

	}

	@And("User click on Add address option")
	public static void hps() {

	}

	@And("user fill new address form with below information")
	public static void ths() {

	}

//	    |country|fullName|phoneNumber|streetAddress|apt       |city     | state |zipCode   |
//	    |value  | value  | value     | value       |  value   | value   | value | value    |
	@And("User click Add Your Address button")
	public static void hyys() {

	}

	@Then("a message should be displayed ‘Address Added Successfully’")
	public static void hsss() {

	}

//	Scenario: Verify User can edit an Address added on account
	@When("User click on Account option")
	public static void has() {

	}

	@And("User click on edit address option")
	public static void haas() {

	}

	@And("user fill new address form with below information ")
	public static void hsqq() {

	}

	// |country|fullName|phoneNumber|streetAddress|apt|city|state|zipCode||value|value|value|value|value|value|value|value|
	@And("User click update Your Address button")
	@Then("a message should be displayed ‘Address Updated Successfully’")

//	Scenario: Verify User can remove Address from Account
	@When("User click on Account option")
	public static void hxxs() {

	}

	@And("User click on remove option of Address section ")
	public static void hpps() {

	}

	@Then("Address detail should be removed ")
	public static void hwws() {

	}

}
