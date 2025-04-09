package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateArticle {
	
	@FindBy(css = "a[href='#/editor']")
	WebElement newArticle;
	
	@FindBy(css = "[name='title']")
	WebElement newTitle;
	
	@FindBy(css = "[name='description']")
	WebElement ArticleDesc;

	@FindBy(css = "[name='body']")
	WebElement articleBody;
	
	@FindBy(css = "[name='tags']")
	WebElement articleTags;
	
	@FindBy(xpath = "//button[contains(text(), 'Publish Article')]")
	WebElement publishArticle;
	
	public CreateArticle(WebDriver driver)  {
		PageFactory.initElements(driver, this);
	}

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
