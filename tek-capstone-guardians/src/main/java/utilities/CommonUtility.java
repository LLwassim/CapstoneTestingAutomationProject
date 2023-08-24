package utilities;

import base.BaseSetup;
import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonUtility extends BaseSetup {

	//35 Methods
	
	//6 waits
	public WebDriverWait getWait() {
        return new WebDriverWait(getDriver(), Duration.ofSeconds(20));
    }
    public WebElement waitTillClickable(WebElement element) {
        return this.getWait().until(ExpectedConditions.elementToBeClickable(element));
    }
    public WebElement waitTillClickable(By by) {
        return this.getWait().until(ExpectedConditions.elementToBeClickable(by));
    }
    public WebElement waitTillPresence(WebElement element) {
        return this.getWait().until(ExpectedConditions.visibilityOf(element));
    }
    public WebElement waitTillPresence(By by) {
        return this.getWait().until(ExpectedConditions.visibilityOfElementLocated(by));
    }
    
	//6 Selects
    public void selectByIndex(WebElement ele, int index) {
        Select select = new Select(ele);
        select.selectByIndex(index);
    }
    public void selectByValue(WebElement ele, String value) {
        Select select = new Select(ele);
        select.selectByValue(value);
    }
    public void selectByVisibleText(WebElement ele, String visibleText) {
        Select select = new Select(ele);
        select.selectByVisibleText(visibleText);
    }
    public  void deselectByIndex(WebElement ele, int index) {
        Select deselect = new Select(ele);
        deselect.deselectByIndex(index);
    }
    public  void deselectByValue(WebElement ele, String value) {
        Select deselect = new Select(ele);
        deselect.deselectByValue(value);
    }
    public  void deselectByVisibleText(WebElement ele, String visibleText) {
        Select deselect = new Select(ele);
        deselect.deselectByVisibleText(visibleText);
    }
    
	//6 Gets
    
    public String getElementText(By by) {
        return this.waitTillPresence(by).getText();
    }
    public String getTitle() {
        String title = getDriver().getTitle();
        return title;
    }
    public String getAttribute(WebElement ele, String value) {
        String attribute = ele.getAttribute(value);
        return attribute;
    }
    public  String getTagname(WebElement ele) {
        return ele.getTagName();
    }
    public  String getText(WebElement ele) {
        String text = ele.getText();
        return text;
    }
    public String getElementText(WebElement element) {
        return this.waitTillPresence(element).getText();
    }
  
	
	//5 Shortcut
	
	//4 JS Executor
	
	//4 isBoolean?
	
	//2 Send 
	
	//2 Click
}
