package steps;

import org.junit.Assert;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.POMFactory;
import utilities.CommonUtility;
import utilities.RandomDataGenerator;

public class SignInSteps extends CommonUtility {
	POMFactory factory = new POMFactory();

	// click on sign in button
	@When("user clicks on sign in")
	public void clickSignIn() {
		click(factory.signInPage().signInBtn);
	}

	// checks to see if log in form exists
	@Then("user is on sign in page")
	public void verifySignInPage() {
		Assert.assertTrue(isElementDisplayed(factory.signInPage().logInForm));
	}

	// enter email and password
	@And("User enter email {string} and password {string}")
	public void userEnterEmailAndPassword(String email, String password) {
		sendText(factory.signInPage().emailsign, email);
		sendText(factory.signInPage().passwordsign, password);
	}

	// click on log in button
	@And("User click on login button")
	public void clickLogin() {
		click(factory.signInPage().logInBtn);
	}

	// check to see if account is on nav bar
	@Then("User should be logged in into Account")
	public void loggedIn() {
		Assert.assertTrue(isElementDisplayed(factory.signInPage().accountLink));
	}

	
	// NEW ACCOUNT CREATION 
	@When("User click on Sign in option")
	public void clickSignIn2() {
		click(factory.signInPage().signInBtn);
	}

	@And("User click on Create New Account button")
	public void clickNewAcctBtn() {
		click(factory.signInPage().newAccountBtn);
	}

	@And("User fill the signUp information with below data")
	public void fillUpInfo() {
		
		String Pass = RandomDataGenerator.generateRandomPassword(22);
		sendText(factory.signInPage().nameInput, "bobby");
		sendText(factory.signInPage().email, RandomDataGenerator.generateRandomEmail());
		sendText(factory.signInPage().password, Pass);
		sendText(factory.signInPage().confirmPassword, Pass);
	}
//	    | name | email | password | confirmPassword |
//	    | student| newStudent@tekschool.us | Tek@12345 | Tek@12345 |

	//click on the sign up button 
	@And("User click on SignUp button")
	public void clickSignUp() {
		click(factory.signInPage().signUpBtn);
	}
	
	//Check to see if user is logged in  
	@Then("User should be logged into account page")
	public void loggedIn2() {
		Assert.assertTrue(isElementDisplayed(factory.signInPage().accountLink));
	}
}
