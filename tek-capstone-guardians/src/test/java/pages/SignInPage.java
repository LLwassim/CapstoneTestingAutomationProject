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
	
	//sign in first time email
	@FindBy(id = "email")
	public WebElement emailsign;
	
	@FindBy(id = "password")
	public WebElement passwordsign;
	
	//NEW ACCOUNT
	//log in name input 
	@FindBy(id = "nameInput")
	public WebElement nameInput;
	
	//log in email input 
	@FindBy(id = "emailInput")
	public WebElement email;
	
	//log in password input 
	@FindBy(id = "passwordInput")
	public WebElement password;
	
	//confirm password input 
	@FindBy(id = "confirmPasswordInput")
	public WebElement confirmPassword;
	
	//Sign Up Button
	@FindBy(id = "signupBtn")
	public WebElement signUpBtn;
	//log in button
	@FindBy(id = "loginBtn")
	public WebElement logInBtn;
	
	//Account Link Button
	@FindBy(id = "accountLink")
	public WebElement accountLink;
	
	//Create New Account Button
	@FindBy(id = "newAccountBtn")
	public WebElement newAccountBtn;
}
