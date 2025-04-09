package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteArticle {

	
	@FindBy(css = "//button[contains(text(), ' Delete Article')]")
	WebElement deleteArticle;
	
	public DeleteArticle(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	//have to write the code for Alert poup

}
