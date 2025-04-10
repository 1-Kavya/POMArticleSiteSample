package testscripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BasePage;
import pages.CreateArticle;
import pages.EditArticle;
import pages.SiteLogin;


public class ArticlePage {
	
  	WebDriver driver;
	SiteLogin siteLogin;
	CreateArticle createArticle;
	EditArticle editArticle;
	
	public ArticlePage() {
		BasePage.initDriver();
		driver = BasePage.getDriver();
		siteLogin = new SiteLogin(driver);
		createArticle = new CreateArticle(driver);
		editArticle = new EditArticle(driver);
		
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
	
	@Test(priority=1)
	public void createNewArticle() {
		createArticle.NewArticle();
		createArticle.provideArticleDetails("Selenium Title", "Selenium Descrption", 
				"Selenium Body", "Selenium tags");
		createArticle.Publish();
		
	}
//	
//	public void editExistingArticle() {
//		editArticle.EditLink();
//		createArticle.provideArticleDetails("Selenium Title edit", "Selenium Descrption edit", 
//			"Selenium Body edit", "Selenium tags edit");
//		editArticle.UpdateArticle();
//	}
//	
//	
	
	
}
