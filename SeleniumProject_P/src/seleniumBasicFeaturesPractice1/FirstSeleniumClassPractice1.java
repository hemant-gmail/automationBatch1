package seleniumBasicFeaturesPractice1;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FirstSeleniumClassPractice1 {
	
	@Test
	public void launchBrowserPractice() throws InterruptedException{
		System.out.println("Launching Browser");
		
		System.setProperty("webdriver.gecko.driver", "D:\\AutomationBatch1\\automationBatch1\\Drivers\\geckodriver.exe");
		FirefoxDriver fdr = new FirefoxDriver();
		
		fdr.get("https://demoqa.com/");
		
		fdr.manage().window().maximize();
		
		Thread.sleep(5000);
		
		fdr.close();
		
	}

}
