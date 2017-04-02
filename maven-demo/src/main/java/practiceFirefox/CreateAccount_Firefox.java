package practiceFirefox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CreateAccount_Firefox {

	public static void main(String[] args) {
				
				String baseUrl="http://www.gmail.com";
				
				System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");
				
				//Instatiating the WebDriver object
				WebDriver driver = new FirefoxDriver();
				
				//Opening gmail
				driver.get(baseUrl);
				
				//finding the element
				driver.findElement(By.linkText("Create account")).click();

			
		}


	

}
