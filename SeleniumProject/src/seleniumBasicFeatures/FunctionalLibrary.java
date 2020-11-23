package seleniumBasicFeatures;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FunctionalLibrary {
	
	@Test
	public WebDriver launchBrowser(String wBrowser){

		WebDriver wb = null;
		
		if(wBrowser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"D:\\AutomationBatch1\\automationBatch1\\Drivers\\chromedriver.exe");
			wb = new ChromeDriver();			
		} else if	(wBrowser.equals("FireFox")) {
			System.setProperty("webdriver.gecko.driver",
					"D:\\AutomationBatch1\\automationBatch1\\Drivers\\geckodriver.exe");
			wb = new FirefoxDriver();
			wb.get("https://demoqa.com/buttons");

			//maximise the window.
			wb.manage().window().maximize();

		}	
		
		return wb;

	}

}
