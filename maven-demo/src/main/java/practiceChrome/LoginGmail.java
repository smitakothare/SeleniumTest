package practiceChrome;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LoginGmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		
		//Instantiating WebDriver object
		WebDriver driver = new ChromeDriver();
		
		//Open Gmail
		driver.get("http://www.gmail.com");
		driver.manage().window().maximize();
		
		//Login to gmail
        //UserName  	
		driver.findElement(By.xpath(".//*[@id='Email']")).sendKeys("glasstest18");
		
		driver.findElement(By.xpath(".//*[@id='next']")).sendKeys(Keys.ENTER);
		
		//Password
		WebElement element = (new WebDriverWait(driver,10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='Passwd']")));
		driver.findElement(By.id("Passwd")).sendKeys("glass_18");
		
		//Checkbox - Uncheck
		boolean x = driver.findElement(By.xpath(".//*[@id='PersistentCookie']")).isSelected();
		if (x==true){
			driver.findElement(By.xpath(".//*[@id='PersistentCookie']")).click();
		}
		
		driver.findElement(By.xpath(".//*[@id='signIn']")).click();
		
		//Get title
		System.out.println(driver.getTitle());
		
		//Gmail Inbox
		//driver.findElement(By.xpath(".//*[@id='gb']/div[1]/div[1]/div[2]/div[4]/div[1]/a/span")).click();
		
		
		//Assert.assertEquals("Login Successful", arg1, arg2);
		
		
		}

}
