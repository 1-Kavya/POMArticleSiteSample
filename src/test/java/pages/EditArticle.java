package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditArticle {
	@FindBy(xpath = "//a[@class='nav-link' and	contains(., 'Edit Article')][1]")
	WebElement editLink;
	
	
	@FindBy(xpath = "//button[contains(text(), 'Update Article')]")
	WebElement updateArticle;
	
	public EditArticle(WebDriver driver)  {
		PageFactory.initElements(driver, this);
	}
	
	public void EditLink() {
		editLink.click();		
	}
	
		
	public void UpdateArticle() {
		updateArticle.click();		
	}

}
