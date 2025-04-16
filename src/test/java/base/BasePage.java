package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class BasePage {
	
	private static BasePage basepage;
	private static WebDriver driver;
	
	private BasePage() {
	
		String strBrowser= "chrome"; 
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
			
			if (strBrowser.equalsIgnoreCase("chrome")) {
//			  driver = new ChromeDriver();
			  driver = new ChromeDriver(options);
			}
			else if (strBrowser.equalsIgnoreCase("edge")) {
				driver = new EdgeDriver();
			}
		      driver.manage().window().maximize();
		      driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		      driver.manage().deleteAllCookies();      

			}
	public static void initDriver() {
			if (basepage == null) {
				basepage = new BasePage();
			}
		}
	public static WebDriver getDriver() {
			return driver;
		}
		
	public static void openUrl(String url) {
			driver.get(url);
		}
	
	
	public static void teardown() {
			if(driver != null) {
				driver.close();
				driver.quit();
			}
			basepage = null;
		}

}
