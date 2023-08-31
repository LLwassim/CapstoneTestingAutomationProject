package pages;

import base.BaseSetup;

public class POMFactory extends BaseSetup{
	
	private HomePage homePage;
	private SignInPage signInPage;
	
	public POMFactory() {
		this.homePage = new HomePage();
		this.signInPage = new SignInPage();
	}
	
	public HomePage homePage() {
		return this.homePage;
	}
	
	public SignInPage signInPage() {
		return this.signInPage;
	}
}