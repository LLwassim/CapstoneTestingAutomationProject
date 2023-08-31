package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseSetup;

public class SignInPage extends BaseSetup {
	
	public SignInPage() {
		PageFactory.initElements(getDriver(), this);
	}

	//sign in button 
	@FindBy(id = "signinLink")
	public WebElement signInBtn;
	
	//log in form 
	@FindBy(id = "loginForm")
	public WebElement logInForm;
	
	//log in email input 
	@FindBy(id = "email")
	public WebElement email;
	//log in password input 
	@FindBy(id = "password")
	public WebElement password;
	
	//log in button
	@FindBy(id = "loginBtn")
	public WebElement logInBtn;
	
	//Account Link Button
	@FindBy(id = "accountLink")
	public WebElement accountLink;
}
