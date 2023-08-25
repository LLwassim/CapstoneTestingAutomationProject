package pages;

import base.BaseSetup;

public class POMFactory extends BaseSetup{
	
	private HomePage homePage;
	
	public POMFactory() {
		this.homePage = new HomePage();
	}
	
	public HomePage homePage() {
		return this.homePage;
	}

	
}