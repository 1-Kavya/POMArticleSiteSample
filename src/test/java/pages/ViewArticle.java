package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewArticle {
	
	@FindBy(xpath = "//a[@class='nav-link ' and	contains(., 'Home')]")
	WebElement home;
	
	@FindBy(xpath = "//a[@class='nav-link ' and	contains(., 'Global Feed')]")
	WebElement globalFeed;
	
	@FindBy(xpath = "//a[@class='author' and	contains(., 'DemoSample')]")
	WebElement author;
	
	@FindBy(xpath = "//a[@class='preview-link' and	contains(., 'KTitle')]")
	WebElement preview;
	
	public ViewArticle(WebDriver driver)  {
		PageFactory.initElements(driver, this);
	}
	
	public void Home() throws InterruptedException {
		Thread.sleep(3000);
		home.click();
		Thread.sleep(3000);
		globalFeed.click();
		Thread.sleep(3000);
	}
	
	public boolean ViewPage() {
		if (author.isDisplayed()) {
			return true;
		}
		return false;
	}

	public void PreviewArticle() {
		preview.click();
	}
	
	
}
