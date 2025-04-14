package testscripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BasePage;
import commonUtils.Utility;
import pages.CreateArticle;
import pages.DeleteArticle;
import pages.EditArticle;
import pages.SiteLogin;
import pages.ViewArticle;


public class ArticlePage {
	
  	WebDriver driver;
	SiteLogin siteLogin;
	CreateArticle createArticle;
	EditArticle editArticle;
	ViewArticle viewArticle;
	DeleteArticle deleteArticle;
	
	public ArticlePage() {
		BasePage.initDriver();
		driver = BasePage.getDriver();
		siteLogin = new SiteLogin(driver);
		createArticle = new CreateArticle(driver);
		editArticle = new EditArticle(driver);
		viewArticle = new ViewArticle(driver);
		deleteArticle = new DeleteArticle(driver);

	}
	
	@BeforeTest
	public void setup() {
		BasePage.openUrl("https://conduit-realworld-example-app.fly.dev/#/");
		
	}
		
	@Test
	public void validLogiTest() throws InterruptedException {
		siteLogin.LoginLink();
		siteLogin.loginIntoSite("sample.demotest@gmail.com", "P@ssword");
		siteLogin.LoginButn();
		Thread.sleep(3000);
		siteLogin.NewArticle();
	}
	
	@Test(priority=1)
	public void createNewArticle() throws InterruptedException {
//		createArticle.NewArticle();
		Thread.sleep(1500);
		createArticle.provideArticleDetails("KTitle", "Descrption", 
				"Selenium Body", "Selenium tags");
		createArticle.Publish();
		
	}
	@Test(priority=3)
	public void editExistingArticle() throws InterruptedException {
		Thread.sleep(1500);
		editArticle.EditLink();
		createArticle.provideArticleDetails(" Title edit", " Descrption edit", 
			" Body edit", " tags edit");
		editArticle.UpdateArticle();
		Thread.sleep(1500);
	}
	
//	@Test(priority=2)
	public void viewExistingArticle() throws InterruptedException {
		viewArticle.Home();
	}
	
	@Test(priority=4)
	public void delArticle() {
		deleteArticle.Delete();
		Utility.handleAlert(driver);
	}
	
	
}
