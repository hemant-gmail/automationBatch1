package seleniumBasicFeatures;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RadioButton {
	
	@Test
	public void test5(){
		System.out.println("Launching browser");

		System.setProperty("webdriver.chrome.driver",
				"D:\\AutomationBatch1\\automationBatch1\\Drivers\\chromedriver.exe");
		ChromeDriver chromDr = new ChromeDriver();

		chromDr.get("https://demoqa.com/radio-button");

		//maximise the window.
		chromDr.manage().window().maximize();

		chromDr.findElement(By.xpath("//label[@for='yesRadio']")).click();
		
		chromDr.findElement(By.xpath("//div/input[@id='impressiveRadio']")).click();
		
		
	}

}
