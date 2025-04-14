package pages;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SiteLogin {
	
	@FindBy(css = "a[href='#/login']")
	WebElement loginLink;
	
	@FindBy(css = "[name='email']")
	WebElement userName;
	
	@FindBy(css = "[name='password']")
	WebElement pwsd;
	
	@FindBy(xpath = "//button[contains(text(),'Login')]")
	WebElement loginButn;
	
	@FindBy(xpath = "//a[@class='nav-link ' and	contains(., 'New Article')]")
	WebElement newArticle;

	
	public SiteLogin(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void LoginLink() {
		loginLink.click();
	}
	
	public void loginIntoSite(String strUser, String strPwd) {
		userName.sendKeys(strUser);
		pwsd.sendKeys(strPwd);
	}
	
	public void LoginButn() {
		loginButn.click();
	}
	
	public void NewArticle() {
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		newArticle.click();
	}
	
}
