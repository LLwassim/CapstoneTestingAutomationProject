package steps;

import org.junit.Assert;
import io.cucumber.java.en.Given;
import pages.POMFactory;
import utilities.CommonUtility;

public class HomePageSteps extends CommonUtility{
	
	//We will create object of POMFactory class to access the page objects in page object classes
	//using the get method we create in the POMFactory class
	
	POMFactory pomFactory = new POMFactory();
	
	@Given("User is on retail home page")
	public void userIsOnRetailHomePage() {
		Assert.assertTrue(pomFactory.homePage().tekschoolLogo.isDisplayed());
		logger.info("Tekschool logo is displayed");
	}
}

