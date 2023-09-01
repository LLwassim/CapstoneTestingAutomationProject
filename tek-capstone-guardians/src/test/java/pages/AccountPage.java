package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseSetup;

public class AccountPage extends BaseSetup {

	public AccountPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(id = "personalPhoneInput")
	public WebElement phoneInput;
	
	@FindBy(id = "personalUpdateBtn")
	public WebElement personalBtn;
	
	@FindBy(xpath = "//div[contains(text(),'Personal Information Updated Successfully')]")
	public WebElement updateMessage;
	
}
