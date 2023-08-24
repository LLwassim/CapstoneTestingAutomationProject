package steps;

import org.junit.Assert;
import io.cucumber.java.en.Given;
import pages.POMFactory;
import utilities.CommonUtility;

public class HomePageSteps extends CommonUtility {
	POMFactory pomFactory = new POMFactory();

	@Given("User is on retail home page")
	public void userIsOnRetailHomePage() {
		Assert.assertTrue(pomFactory.homePage().heroImage.isDisplayed());
		logger.info("Tekschool logo is displayed");
	}
}
