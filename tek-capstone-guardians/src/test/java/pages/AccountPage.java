package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseSetup;

public class AccountPage extends BaseSetup {

	public AccountPage() {
		PageFactory.initElements(getDriver(), this);
	}

	// phone input on account page
	@FindBy(id = "personalPhoneInput")
	public WebElement phoneInput;
	// update button on account page
	@FindBy(id = "personalUpdateBtn")
	public WebElement personalBtn;
	// name on account page
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/h1[1]")
	public WebElement accountName;

	// Debit card stuff

	// payment method link
	@FindBy(xpath = "//p[contains(text(),'Add a payment method')]")
	public WebElement paymentMethodLink;
	// Card number input
	@FindBy(id = "cardNumberInput")
	public WebElement cardNumberInput;
	// Name on Card input
	@FindBy(id = "nameOnCardInput")
	public WebElement nameOnCard;
	// CVV input
	@FindBy(id = "securityCodeInput")
	public WebElement cvvInput;
	// exp month
	@FindBy(id = "expirationMonthInput")
	public WebElement expInp;
	// payment submit button
	@FindBy(id = "paymentSubmitBtn")
	public WebElement paymentSubmitBtn;

	// edit button
	@FindBy(xpath = "//button[contains(text(),'Edit')]")
	public WebElement paymentEditBtn;

	// payment added message
	@FindBy(xpath = "//body/div[@id='root']/div[2]/div[1]/div[1]/button[1]")
	public WebElement payUpdateMsg;

	// Card Holder Div
	@FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]")
	public WebElement cardHolderDiv;

	// remove card
	@FindBy(xpath = "//button[text()='remove']")
	public WebElement cardRemoveBtn;
	@FindBy(xpath = "//h1[@class='account__payment-new-title']")
	public WebElement addCardHeader;
	@FindBy(xpath = "//p[@class='account__payment-sub-title']")
	public WebElement paymentList;

	// add address
	@FindBy(xpath = "//p[text()='Add Address']")
	public WebElement addAddress;
	
	//why are you like this
	@FindBy(id = "fullNameInput")
	public WebElement fullNameInput;
	
	
	@FindBy(id = "phoneNumberInput")
	public WebElement phoneNumberInput;
	@FindBy(id = "streetInput")
	public WebElement streetInput;
	@FindBy(id = "apartmentInput")
	public WebElement apartmentInput;
	@FindBy(id = "cityInput")
	public WebElement cityInput;
	@FindBy(name = "state")
	public WebElement stateInput;
	@FindBy(id = "zipCodeInput")
	public WebElement zipCodeInput;
	@FindBy(id = "addressBtn")
	public WebElement addressBtn;
	@FindBy(xpath = "//div[contains(text(),'Address Added Successfully')]")
	public WebElement addMsg;

	// edit address

	@FindBy(xpath = "//button[@class='account__address-btn' and text()='Edit']")
	public WebElement editAddress;
	@FindBy(xpath = "//button[@id='addressBtn']")
	public WebElement upAdressBtn;
	@FindBy(xpath = "//div[contains(text(),'Address Updated Successfully')]")
	public WebElement adressUpMsg;

	// remove address
	@FindBy(xpath = "//div[@class='account__address-single']")
	public WebElement addressBox1;
	@FindBy(xpath = "//div//button[@class='account__address-btn' and text()='Remove']")
	public WebElement RemoveAddressBtn;
}
