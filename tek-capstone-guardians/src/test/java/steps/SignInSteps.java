package steps;

import org.junit.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.POMFactory;
import utilities.CommonUtility;

public class SignInSteps extends CommonUtility {
	POMFactory factory = new POMFactory();
	
	@When("user clicks on sign in")
	public void clickSignIn () {
		click(factory.signInPage().signInBtn);
	}
	
	@Then("user is on sign in page")
	public void verifySignInPage() {
		Assert.assertTrue(isElementDisplayed(factory.signInPage().logInForm));
	}
}
