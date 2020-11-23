package seleniumBasicFeatures;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TextBoxElement {
	
	@Test
	public void test2(){
		System.out.println("Launching browser");

		System.setProperty("webdriver.chrome.driver",
				"D:\\AutomationBatch1\\automationBatch1\\Drivers\\chromedriver.exe");
		ChromeDriver chromDr = new ChromeDriver();

		chromDr.get("https://demoqa.com/text-box");

		//maximise the window.
		chromDr.manage().window().maximize();
		
		chromDr.findElement(By.xpath("//input[@id='userName']")).sendKeys("Hemant Fulmali");
		
		chromDr.findElement(By.xpath("//input[@id='userName']")).clear();
		
	}

}
