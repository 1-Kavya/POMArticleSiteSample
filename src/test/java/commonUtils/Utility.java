package commonUtils;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class Utility {
	
	public static void handleAlert(WebDriver driver) {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

}
