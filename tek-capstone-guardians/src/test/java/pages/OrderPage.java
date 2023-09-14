package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;
import base.BaseSetup;

public class OrderPage extends BaseSetup{

	public OrderPage() {
		PageFactory.initElements(getDriver(), this);
	}
	@FindBy(xpath="//select[@id='search']") public WebElement allDprtOption;
	@FindBy(xpath="//span[contains(text(),'Plugs and Outlets')]") public WebElement plugsAndOutlet;
	@FindBy(xpath="//input[@id='searchInput']") public WebElement searchBox;
	@FindBy(xpath = "//button[@class='search__btn']") public WebElement searchIcon;
	@FindBy(xpath="//p[contains(text(),'Kasa Outdoor Smart Plug')]")public WebElement smartPlug;
	@FindBy (xpath ="//select[@class='product__select']") public WebElement quantityOption;
	@FindBy(xpath="//button[@id='addToCartBtn']") public WebElement addToCartBtn;

//add address on order
	@FindBy(tagName="img") public WebElement apex;
	@FindBy(id="cartBtn") public WebElement cartBtn;
	@FindBy (id="proceedBtn") public WebElement proceedCheckoutBtn;
	@FindBy(xpath="//div[text()='Order Placed Successfully']") public WebElement orderScsMsg;
	@FindBy(id="placeOrderBtn") public WebElement placeOrderBtn;
	@FindBy (xpath="//div[@class='shadow md:w-3/4 bg-white p-4']") public WebElement orderConfirmationNumber;
	@FindBy(id="cancelBtn") public WebElement orderCancelBtn;
	@FindBy(id="buyAgainBtn") public WebElement orderBuyAgainBtn;
	
//order cancellation
	@FindBy (xpath="//a[@id='orderLink']") public WebElement orderLink;
	@FindBy(xpath ="//div[@class='order']") public WebElement firstOrderPlaced;
	@FindBy(xpath="//select[@id='reasonInput']") public WebElement cancelReason;
	@FindBy(xpath="//select[@id='reasonInput']//option[@value='damage']") public WebElement itemDamageOption;
	@FindBy(xpath="//button[@id='orderSubmitBtn']") public WebElement cancelOrder;
	@FindBy(xpath="//div[@class='cancel__confirm-message']") public WebElement orderCancelledMsg;
	
	//list of orders
	@FindBy(xpath = "//div[@class='order']//descendant::p[7]") public List<WebElement> listOfOrders;
	
//return order	
	@FindBy (xpath="//p[@class='order__header-btn' and text()='Show Details']") public WebElement ItemsShowDetails;
	@FindBy(id="returnBtn") public WebElement orderReturnBtn;
	@FindBy(xpath="//select[@id='dropOffInput']") public WebElement dropOffService;
	@FindBy(xpath="//select[@id='dropOffInput']//option[text()='FedEx']") public WebElement fedExDropoffOption;
	@FindBy(xpath="//button[@id='orderSubmitBtn']") public WebElement orderReturnAndSubmitBtn;
	
	
	@FindBy(xpath="//p[contains(text(),'Return was successfull')]") public WebElement orderReturnSuccessful;
	
	@FindBy(xpath="//p[contains(text(),'Return was successfull')]") public WebElement multipleItems;
	
	@FindBy(xpath="//input[@type='checkbox']") public WebElement checkBox;
	
	
	
	@FindBy(xpath="//button[@id='reviewBtn']") public WebElement reviewBtn;
	@FindBy(xpath="//input[@id='headlineInput']") public WebElement headlineInput;
	@FindBy(xpath="//textarea[@name='comment']") public WebElement review;
	@FindBy(xpath="//button[@id='reviewSubmitBtn']") public WebElement addReviewBtn;
	@FindBy(xpath="//div[text()='Your review was added successfully']") public WebElement reviewAdded;
	@FindBy(xpath="//span[text()='Delete']") public WebElement deleteOrderList;
}