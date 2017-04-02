package practiceChromeTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import practiceChrome.GmailHomePage;
import practiceChrome.GmailInbox;
import practiceChrome.GmailPasswordPage;


public class GmailTests {
	


	@Test
	public void VerifyLoginTest() throws InterruptedException{
		//Login
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		GmailHomePage loginId = new GmailHomePage(driver);
		GmailPasswordPage password = loginId.EnterLoginIdAndClickNext("glasstest18");
		GmailInbox title =password.enterPasswordAndSubmit("glass_18");		
		
		System.out.println(title.GmailTitle());
		
		//Assertion for login
		Assert.assertEquals(title.GmailTitle(), "Inbox", "Test is Pass");
		
	    title.getDriver().close();
		

		
		
		
		
	}
	
	
	
	

}
