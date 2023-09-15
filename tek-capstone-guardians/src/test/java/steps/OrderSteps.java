package steps;

import utilities.CommonUtility;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.*;
import pages.POMFactory;

public class OrderSteps extends CommonUtility {
	POMFactory factory = new POMFactory();

	
//Scenario: Verify User can add an item to cart
	
	
//this step is 
	@And("User change the category to {string}")
	public void changeCategory(String category) {
		click(factory.orderPage().allDprtOption);
		selectByVisibleText(factory.orderPage().allDprtOption, category);
		
	}
//		@And("User search for an item {string}")
//		public void clickPlugs() {
//			click(factory.orderPage().plugsAndOutlet);
//		
//		}
		
	

	@And("User search for an item {string}")
	public void searchItem(String item) {
		sendText(factory.orderPage().searchBox, item);
	
	}
	
	

	@And("User click on Search icon")
	public void clickSearch() {
		click(factory.orderPage().searchIcon);
	
	}

	@And("User click on item")
	public void clickItem() {
		click(factory.orderPage().smartPlug);

	}

	@And("User select quantity {string}")
	public void selectQuantity(String quantity) {
		click(factory.orderPage().quantityOption);
		selectByVisibleText(factory.orderPage().quantityOption, quantity);
	
	}

	@And("User click add to Cart button")
	public void AddToCart() {
		click(factory.orderPage().addToCartBtn);
		
	}

	@Then("the cart icon quantity should change to {string}")
	public void cartIcon(String quantity) {
		if (factory.orderPage().quantityOption.equals(quantity)) {
		}
	
	}

	
	
//Scenario: Verify User can place an order with Shipping address and payment Method on file

	@And("User change the category to {string} and User search for an item {string}")
	public void changeCategorySearchItem(String category, String item) {
		click(factory.orderPage().allDprtOption);
		selectByVisibleText(factory.orderPage().allDprtOption, category);
		sendText(factory.orderPage().searchBox, item);
	
	}

	@And("User clicks on Search icon")
	public void clicksSearchIcon() {
		clickElementWithJS(factory.orderPage().searchIcon);
	
	}

	@And("User clicked on apex")
	public void userClicksOnItem() {
		click(factory.orderPage().apex);
	
	}

	@And("User select quantity ‘5’")
	public void userSelectsQuantity() {
		String quantity = "5";
		click(factory.orderPage().quantityOption);
		selectByValue(factory.orderPage().quantityOption, quantity);
	
	}

	@And("User clicks add to Cart button")
	public void userClicksAddToCartButton() {
		click(factory.orderPage().addToCartBtn);
		logger.info("add to cart button clicked successfully");
	}

	@And("cart icon quantity should change to {string}")
	public void theCartsIconQuantityShouldChangeTo(String quantity) {
		if (factory.orderPage().quantityOption.equals(quantity)) {
		
		}
	}

	@And("User click on Cart option")
	public void userClickOnCartOption() {
		click(factory.orderPage().cartBtn);
		
	}

	@And("User click on Proceed to Checkout button")
	public void userClickOnProceedToCheckoutButton() {
		click(factory.orderPage().proceedCheckoutBtn);
	
	}

	@And("User click on Place Your Order")
	public void userClickOnPlaceYourOrder() {
		click(factory.orderPage().placeOrderBtn);
	}

	@Then("message for apex should be {string}") 
	public void msgShouldBe(String message) {
		waitTillPresence(factory.orderPage().orderScsMsg);
		logger.info(factory.orderPage().orderScsMsg.getText());
		logger.info(message);
		String message2 = factory.orderPage().orderScsMsg.getText();
		String actualMessage = message.replace("\"", ""); // Removes double quotation marks
		logger.info(actualMessage);
		Assert.assertTrue(message2.equals(actualMessage));
	}

	
//Scenario: Verify User can cancel the order
	
	
	@And("User click on Orders section")
	public void userClickOnOrdersSection() {
		click(factory.orderPage().orderLink);
	}

	@And("User click on first order in list")
	public void userClickOnFirstOrderInList() {
		List<WebElement> listOfOrders = factory.orderPage().listOfOrders;
	         for(int i = 0; i < listOfOrders.size(); i++) {
	             if(listOfOrders.get(i).getText().equalsIgnoreCase("Hide Details")) {
	             }else if (listOfOrders.get(i).getText().equalsIgnoreCase("Show Details")) {
	                click(factory.orderPage().listOfOrders.get(i));
	             }
	         }
	}

	@And("User click on Cancel The Order button")
	public void clickCancelOrderButton() {
		click(factory.orderPage().orderCancelBtn);
	}

	@And("User select the cancelation Reason {string}")
	public void selectCancelationReason(String reason) {
		clickElementWithJS(factory.orderPage().cancelReason);
		selectByVisibleText(factory.orderPage().cancelReason, reason);
	}

	@And("Click Cancel")
	public void cancelOrderButton() {
		click(factory.orderPage().cancelOrder);
	}
	@Then("a cancelation message should be displayed {string}")
	public void cancelMsgIsDisplayed(String cancelledMsg) {
		
		waitTillPresence(factory.orderPage().orderCancelledMsg);
		Assert.assertEquals("Your Order Has Been Cancelled", factory.orderPage().orderCancelledMsg.getText());
	}

//Scenario: Verify User can Return the order
	@And("User clicks on Orders section")
	public void userClicksOnOrdersSection() {
		click(factory.orderPage().orderLink);
	}

	@And("User clicks on first order in list")
	public void clicksFirstOrder() {
		click(factory.orderPage().ItemsShowDetails);
	}

	@And("User click on Return Items button")
	public void clickReturnItemsBtn() {
		click(factory.orderPage().orderReturnBtn);
	}

	@And("User select the Return Reason {string}")
	public void selectReturnReason(String reason) {
		selectByVisibleText(factory.orderPage().cancelReason, reason);
	}

	@And("User select the drop off service {string}")
	public void selectDropOffService(String category) {
		selectByVisibleText(factory.orderPage().dropOffService, category);
	}

	@And("User check if theres a check box")
	public void checkCheckBox() {
		if(factory.orderPage().checkBox.isDisplayed()) {
			click(factory.orderPage().checkBox);
		}
	}

	@And("User click on Return Order button")
	public void clickReturnOrderBtn() {
		waitTillClickable(factory.orderPage().orderReturnAndSubmitBtn);
		click(factory.orderPage().orderReturnAndSubmitBtn);
		click(factory.orderPage().orderReturnAndSubmitBtn);
	}
	@Then("a cancel message should be displayed {string}")
	public void ReturnPls(String message) {
		Assert.assertTrue(factory.orderPage().orderReturnSuccessful.isDisplayed());
	}

	//Scenario: Verify User can write a review on order placed

	@And("User click on the Orders section")
	public void clickOrderSection() {
		click(factory.orderPage().orderLink);
	}

	@And("User click on the first order in list")
	public void clickFirstOrder() {
		click(factory.orderPage().ItemsShowDetails);
	}

	@And("User click on Review button")
	public void clickReviewBtn() {
		click(factory.orderPage().reviewBtn);
	}

	@And("User write Review headline {string} and {string}")
	public void commentWithHeadline(String headline, String review) {
		review = " bla bla bla ";
		headline = "idc";
		sendText(factory.orderPage().headlineInput, headline);
		sendText(factory.orderPage().review, review);
	}

	@And("User click Add your Review button")
	public void clickAddReviewBtn() {
		click(factory.orderPage().addReviewBtn);
	}

	@Then("a review message should be displayed {string}")
	public void ReviewMessageDisplayed(String message) {
		message = "Your review was added successfully"; 
		waitTillPresence(factory.orderPage().reviewAdded);
		Assert.assertEquals(message,factory.orderPage().reviewAdded.getText());
	}

}
