package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateArticle {
	
//	@FindBy(xpath = "//a[href='#/editor']")
//	@FindBy(xpath = "//a[@class='nav-link' and	contains(text(), 'New Article')]")
//	@FindBy(xpath = "//a[@class='nav-link ' and	contains(., 'New')]")
//	@FindBy(linkText="Article" )
//	@FindBy(partialLinkText = "New")
//	WebElement newArticle;
	
	@FindBy(xpath = "//input[@name='title']")
	WebElement newTitle;
	
	@FindBy(xpath = "//input[@name='description']")
	WebElement ArticleDesc;

	@FindBy(xpath = "//textarea[@name='body']")
	WebElement articleBody;
	
	@FindBy(xpath = "//input[@name='tags']")
	WebElement articleTags;
	
	@FindBy(xpath = "//button[contains(text(), 'Publish Article')]")
	WebElement publishArticle;
	
	public CreateArticle(WebDriver driver)  {
		PageFactory.initElements(driver, this);
	}

//	public void NewArticle() {
//		newArticle.click();
//	}
	
	public void provideArticleDetails(String strTitle, String strDesc, String strBody, String strTags) {
		newTitle.sendKeys(strTitle);
		ArticleDesc.sendKeys(strDesc);
		articleBody.sendKeys(strBody);
		articleTags.sendKeys(strTags);
	}

	public void Publish() {
		publishArticle.click();
	}
	

}
