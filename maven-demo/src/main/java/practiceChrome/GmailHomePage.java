package practiceChrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GmailHomePage extends BasePage{
	
	@FindBy(xpath=".//*[@id='Email']")
	private WebElement EmailPhone;
	
	@FindBy(xpath=".//*[@id='next']")
	private WebElement nextButton;
	
	@FindBy(xpath=".//*[@id='gaia_firstform']/div/a")
	private WebElement findMyAccountLink;
	
	@FindBy(xpath=".//*[@id='link-signup']/a")
	private WebElement CreateMyAccountLink;
	
	@FindBy(xpath="html/body/div[1]/div[2]/div[2]/div[2]/div/div[1]/a")
	private WebElement learnMoreLink;
	
	
	//Constructor
	public GmailHomePage(WebDriver driver) {		
		super(driver); 
		driver.get("http://www.gmail.com");
		driver.manage().window().maximize();
	}



	public void EnterEmailId(String emailId){
				
		//EmailPhone = driver.findElement(By.xpath(".//*[@id='Email']"));
		EmailPhone.sendKeys(emailId);
		
	}
	
	public GmailPasswordPage nextButtonClick(){
		nextButton.click();
		return new GmailPasswordPage(getDriver());
		
	}
	
	public GmailPasswordPage EnterLoginIdAndClickNext(String Name){

		this.EnterEmailId(Name);
		GmailPasswordPage password = this.nextButtonClick();	
		
		return password;
	}
	
	
	

	
	
		
	
	
	
	
}
