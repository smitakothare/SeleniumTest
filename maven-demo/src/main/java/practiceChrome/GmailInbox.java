package practiceChrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GmailInbox extends BasePage{
	
	@FindBy(xpath = ".//*[@id='gb']/div[1]/div[1]/div[2]/div[4]/div[2]")
	private WebElement AccountInformation;
	
	
	
	public GmailInbox(WebDriver driver) {
		super(driver);
	}



	public String GmailTitle() throws InterruptedException{
		String s;
		Thread.sleep(3000);
		s = driver.getTitle();
		s = s.substring(0, 5);
		return s;
	}
	
	

}
