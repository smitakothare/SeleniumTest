package practiceChrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewAccount_Chrome {

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
		
		
		//********On Create account page***********
		
		//Entering the data in first name
		WebElement firstName = driver.findElement(By.id("FirstName"));
		firstName.sendKeys("John");
		
		//Entering the data in Last name
		WebElement lastName = driver.findElement(By.id("LastName"));
		lastName.sendKeys("Bush");

		
	}
}