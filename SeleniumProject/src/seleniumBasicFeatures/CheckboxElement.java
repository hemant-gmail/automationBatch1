package seleniumBasicFeatures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CheckboxElement {
	
	@Test
	public void test3(){
		System.out.println("Launching browser");

		System.setProperty("webdriver.chrome.driver",
				"D:\\AutomationBatch1\\automationBatch1\\Drivers\\chromedriver.exe");
		ChromeDriver chromDr = new ChromeDriver();

		chromDr.get("https://demoqa.com/checkbox");

		//maximise the window.
		chromDr.manage().window().maximize();

//		chromDr.findElement(By.xpath("//span[@class='rct-checkbox']")).click();
		chromDr.findElement(By.xpath("//button[@title='Toggle']")).click();
		
		chromDr.findElement(By.xpath("//label[@for='tree-node-documents']/span[@class='rct-checkbox']")).click();
		
		
	}

}
