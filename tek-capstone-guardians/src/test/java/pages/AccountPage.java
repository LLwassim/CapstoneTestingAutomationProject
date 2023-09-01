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
	//update button on account page
	@FindBy(id = "personalUpdateBtn")
	public WebElement personalBtn;
	//name on account page
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/h1[1]")
	public WebElement accountName;
	
	//Debit card stuff 
	
	//payment method link 
	@FindBy(xpath = "//p[contains(text(),'Add a payment method')]")
	public WebElement paymentMethodLink;
	//Card number input 
	@FindBy(id = "cardNumberInput")
	public WebElement cardNumberInput;
	//Name on Card input
	@FindBy(xpath = "nameOnCardInput")
	public WebElement nameOnCard;
	//CVV input
	@FindBy(xpath = "securityCodeInput")
	public WebElement cvvInput;
}
