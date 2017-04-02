package practiceChrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GmailPasswordPage extends BasePage {

	@FindBy(xpath = ".//*[@id='back-arrow']/img")
	private WebElement arrowKey;

	@FindBy(xpath = "//input[@id='Passwd']")
	private WebElement password;

	@FindBy(xpath = "//input[@id='signIn']")
	private WebElement signInButton;

	@FindBy(xpath = "//input[@id='PersistentCookie']")
	private WebElement staySignInCheckBox;

	@FindBy(xpath = "//a[contains(text(),'Forgot password?')]")
	private WebElement forgotPwdLink;

	@FindBy(xpath = "(//a[contains(text(),'Learn more')])[2]")
	private WebElement learnMoreLink;

	@FindBy(xpath = "//a[contains(text(),'Sign in with a different account')]")
	private WebElement loginWithDiffAccLink;

	public GmailPasswordPage(WebDriver driver) {

		super(driver);

	}

	public void EnterPassword(String pwd) throws InterruptedException {
		Thread.sleep(1000);
		password.sendKeys(pwd);
	}

	public void staySignInCheckBoxCheck() {
		if (!staySignInCheckBox.isSelected()) {
			staySignInCheckBox.click();
		}
	}

	public void SignInButtonClick() {
		signInButton.click();

	}

	public GmailInbox enterPasswordAndSubmit(String password) throws InterruptedException {
		this.EnterPassword(password);
		this.staySignInCheckBoxCheck();
		this.SignInButtonClick();
		
		return new GmailInbox(getDriver());
	}

}
