package practiceChrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String baseUrl="http://www.gmail.com";
		
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		
		//Instatiating the WebDriver object
		WebDriver driver = new ChromeDriver();
		
		//Opening gmail
		driver.get(baseUrl);
		
		//finding the element
		driver.findElement(By.linkText("Create account")).click();

	}
}


