package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SiteLogin {
	
	@FindBy(css = "a[href='#/login']")
	WebElement loginLink;
	
	@FindBy(css = "[name='email']")
	WebElement userName;
	
	@FindBy(css = "[name='password']")
	WebElement pwsd;
	
	@FindBy(css = "//button['Login']")
	WebElement loginButn;
	
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
}
