package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FireFoxBrowser implements Browser{

	@Override
	public WebDriver openBrowser(String url) {
		WebDriverManager.firefoxdriver().setup();
		

		FirefoxOptions options = new FirefoxOptions();
		options.setHeadless(true);
		    WebDriver driver = new FirefoxDriver(options);
		    driver.get(url);
		    return driver;

	}

}
