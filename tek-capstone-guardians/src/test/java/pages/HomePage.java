package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import base.BaseSetup;

public class HomePage extends BaseSetup{
	
	public HomePage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	//hamburger button 
	@FindBy(id = "hamburgerBtn")
	public WebElement hamburger;	
		
	//tek school logo 
	@FindBy(linkText = "TEKSCHOOL")
	public WebElement tekschool;

	//the div that contains the hamburger drop down 
	@FindBy(xpath = "//div[@class='modal__content h-screen w-80 ']//span")
	public List<WebElement> options;
	
	//the div that says "Shop by Dept"
	@FindBy(id = "contentHeader")
	public WebElement contentHeader;
	
	//the div that contains the contains side bar contents under "Shop by Dept"
	@FindBy(className = "sidebar__content")
	public WebElement sideBarContent;


}
	
