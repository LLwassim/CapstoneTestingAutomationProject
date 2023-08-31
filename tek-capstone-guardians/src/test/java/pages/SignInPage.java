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
}
