package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

import page_objects.Excercise1;

public class DriverFactory {
	
	private DriverFactory(){}; //Singleton class for driver factory to return only one instance of WebDriver object
	
	public static WebDriver driver = getDriver();
	
	private static WebDriver getDriver() {		
		if(driver == null) {	
			try {
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\resource_libraries\\chromedriver_v88.exe");
				ChromeOptions options = new ChromeOptions();
				options.addArguments("start-maximized");
				options.addArguments("--disable-notifications");
				driver = new ChromeDriver(options);
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		InitPageObjElements();
		return driver;
	}
	
	public static void stopDriver() {
		if(driver != null) {
			driver.quit();
		}
		driver = null;
	}
	
	private static void InitPageObjElements() {
		PageFactory.initElements(driver, Excercise1.class);
	}
}
