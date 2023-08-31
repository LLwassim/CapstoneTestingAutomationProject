package steps;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.POMFactory;
import utilities.CommonUtility;

public class SignInSteps extends CommonUtility {
	POMFactory factory = new POMFactory();
	
	//click on sign in button
	@When("user clicks on sign in")
	public void clickSignIn () {
		click(factory.signInPage().signInBtn);
	}
	
	//checks to see if log in form exists
	@Then("user is on sign in page")
	public void verifySignInPage() {
		Assert.assertTrue(isElementDisplayed(factory.signInPage().logInForm));
	}
	
	//enter email and password
	 @And("User enter email 'bro@gmail.com' and password 'Boomer@2023'")
	 public void submitSignInText() {
		  sendText(factory.signInPage().email, "bro@gmail.com");
		  sendText(factory.signInPage().password, "Boomer@2023");
	 }
	 
	 //click on log in button
	 @And("User click on login button")
	 public void clickLogin() {
		 click(factory.signInPage().logInBtn);
	 }
	 
	 //check to see if account is on nav bar
	 @Then("User should be logged in into Account")
	public void loggedIn() {
		 Assert.assertTrue(isElementDisplayed(factory.signInPage().accountLink));
	 }
}
