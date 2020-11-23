package seleniumBasicFeatures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class RightClickButtonElement {
	
	FunctionalLibrary lib = new FunctionalLibrary();
	WebDriver wb;
	
	@Test
	public void test8(){
		System.out.println("Launching browser");
		wb = lib.launchBrowser("FireFox");

		wb.get("https://demoqa.com/buttons");

		//maximise the window.
		wb.manage().window().maximize();
		
		//To perform actions like double click, mouse hover, drag drop etc
		Actions act = new Actions(wb);
		WebElement ele= wb.findElement(By.xpath("//button[text()='Right Click Me']"));

		act.contextClick(ele).build().perform();
	}


}
