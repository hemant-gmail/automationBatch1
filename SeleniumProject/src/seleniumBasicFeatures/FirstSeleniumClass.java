package seleniumBasicFeatures;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstSeleniumClass {
	
	@Test
	public void launchBowser(){
		System.out.println("Launching browser");
		
		System.setProperty("webdriver.chrome.driver", "D:\\AutomationBatch1\\automationBatch1\\Drivers\\chromedriver.exe");
		ChromeDriver chromDr= new ChromeDriver();
		
		//navigate to URL
		chromDr.get("https://www.flipkart.com/");
		
		//
		chromDr.manage().window().maximize();
	}

}
