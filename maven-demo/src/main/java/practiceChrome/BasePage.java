package practiceChrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	
	protected WebDriver driver;
	
	public BasePage(WebDriver driver){
	
	this.setDriver(driver);
	init(driver);
	
	}
	
	public void init(final WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

}
