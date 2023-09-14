package pages;

import base.BaseSetup;

public class POMFactory extends BaseSetup{
	
	private HomePage homePage;
	private SignInPage signInPage;
	private AccountPage accountPage;
	private OrderPage orderPage;
	
	public POMFactory() {
		this.homePage = new HomePage();
		this.signInPage = new SignInPage();
		this.accountPage = new AccountPage();
		this.orderPage = new OrderPage();
	}
	
	public HomePage homePage() {
		return this.homePage;
	}
	public OrderPage orderPage() {
		return this.orderPage;
	}
	public SignInPage signInPage() {
		return this.signInPage;
	}
	public AccountPage accountPage() {
		return this.accountPage;
	}
}