package practiceFirefox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenGmailOnFirefox {

	public static void main(String[] args) {
		    // TODO Auto-generated method stub
	        //Using Firefox    
			System.setProperty("webdriver.gecko.driver","C:/geckodriver.exe");		
			WebDriver driver = new FirefoxDriver();

			
			//Opening Gmail on Firefox
			driver.get("http://www.gmail.com");


	}

}
