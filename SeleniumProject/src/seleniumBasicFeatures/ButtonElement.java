package seleniumBasicFeatures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ButtonElement {
	
	FunctionalLibrary lib = new FunctionalLibrary();
	
	
	@Test
	public void test6(){
		
		System.out.println("Launching browser");

/*		System.setProperty("webdriver.chrome.driver",
				"D:\\AutomationBatch1\\automationBatch1\\Drivers\\chromedriver.exe");
		ChromeDriver chromDr = new ChromeDriver();*/
		
		WebDriver wb = lib.launchBrowser("FireFox");

		wb.get("https://demoqa.com/buttons");

		//maximise the window.
		wb.manage().window().maximize();

//		wb.findElement(By.xpath("//button[@id='Mthep']")).click();
//		OR
		wb.findElement(By.xpath("//button[text()='Click Me']")).click();

		

		
	}

}
