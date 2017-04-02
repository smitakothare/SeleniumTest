package practiceChrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogleOnChrome {

	public static void main(String[] args) {
		
		//Using Chrome Browser
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
		
        //Opening Gmail on Chrome
		driver.get("http://www.gmail.com");

	}

}
