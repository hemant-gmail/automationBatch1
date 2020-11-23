package seleniumBasicFeaturesPractice1;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Element_4_RadioButtton {
	@Test(priority=0)
	public void radiobuttonFirefox() throws InterruptedException{
		
		System.setProperty("webdriver.gecko.driver",
				"D:\\AutomationBatch1\\automationBatch1\\Drivers\\geckodriver.exe");
		FirefoxDriver fdr = new FirefoxDriver();
		fdr.get("https://demoqa.com/radio-button");
		fdr.manage().window().maximize();
		
		fdr.findElement(By.xpath("//label[@for='yesRadio']")).click();
				
		Thread.sleep(5000);
		fdr.close();
		
	}

	//Assignment
	@Test(priority=1)
	public void radiobuttonEdge() throws InterruptedException{
		System.setProperty("webdriver.edge.driver",
				"D:\\AutomationBatch1\\automationBatch1\\Drivers\\edgedriver_win64\\msedgedriver.exe");
		EdgeDriver edr = new EdgeDriver();
		edr.get("https://demoqa.com/radio-button");
		edr.manage().window().maximize();
		edr.findElement(By.xpath("//label[@for='impressiveRadio']")).click();
		
		Thread.sleep(5000);
		edr.close();
	}

}
