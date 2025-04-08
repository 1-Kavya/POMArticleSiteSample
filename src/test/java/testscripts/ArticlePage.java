package testscripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BasePage;
import pages.SiteLogin;


public class ArticlePage {
	
  	WebDriver driver;
	SiteLogin siteLogin;
	
	public ArticlePage() {
		BasePage.initDriver();
		driver = BasePage.getDriver();
		siteLogin = new SiteLogin(driver);
	}
	
	@BeforeTest
	public void setup() {
		BasePage.openUrl("https://conduit-realworld-example-app.fly.dev/#/");
		
	}
	
	
	@Test
	public void validLogiTest() {
		siteLogin.LoginLink();
		siteLogin.loginIntoSite("sample.demotest@gmail.com", "P@ssword");
		siteLogin.LoginButn();
	
	}
	

}
