package steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.POMFactory;
import utilities.CommonUtility;

public class HomePageSteps extends CommonUtility {
	POMFactory factory = new POMFactory();


	@When("User clicks on all")
	public void userClicksAll() {
		// click on the hamburgerBtn
		click(factory.homePage().hamburger);
		//log that the hamburgerBtn has been successfully clicked 
		logger.info("Hamburger Dropdown Clicked.");
	}

	@Then("options are shown in hamburger dropdown")
	public void optionsInDropDown(DataTable dataTable) {
		//make a list of the Elements in drop down 
		List<List<String>> dropdown = dataTable.asLists(String.class);
		//loop thru the list 
		for (int i = 0; i < dropdown.get(0).size(); i++) {
			//check to see if the elements are displayed
			Assert.assertTrue(isElementDisplayed(
					getDriver().findElement(By.xpath("//div[@class='modal__content h-screen w-80 ']//span[text()='"
							+ dropdown.get(0).get(i) + "']"))));
			
			//log each element in the console 
			logger.info("Option " + dropdown.get(0).get(i) + " is displayed");
		}
	}

	@And("User on {string}")
	// using the parameter of a string check if the user is on the correct department 
	public void userOnDepartment(String department) {
		//make a list of the department elements
		List<WebElement> departmentDropdown = factory.homePage().options;
		//iterate thru the department list elements
		for (int i = 0; i < departmentDropdown.size(); i++) {
			//check if the element is equal to the string and if it is click on it 
			if (departmentDropdown.get(i).getText().equalsIgnoreCase(department)) {
				departmentDropdown.get(i).click();
				//log the element in console 
				logger.info("User is on " + department);
				break;
			}
			
		}

	}

	@Then("options in department")
	//using the parameters in the data table in features
	public void optionsInDept(DataTable dataTable) {
		//Converts Data Table into a list of maps, 
		//Each map in the list is a row in the DataTable, where keys are columns and values are the cell values.
		List<Map<String, String>> options = dataTable.asMaps(String.class, String.class);
		//iterate thru the rows in the map list 
		for (int i = 0; i < options.size(); i++) {
			//verify the side bar content exists
			Assert.assertTrue(factory.homePage().sideBarContent.isDisplayed());
			//log the options in the side bar in console 
			logger.info(i+" are in Department");
		}
		
	}

}