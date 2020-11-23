package seleniumBasicFeatures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseHover {
	FunctionalLibrary lib = new FunctionalLibrary();
	WebDriver wb;

	@Test
	public void test9() throws InterruptedException{
		System.out.println("Launching browser");
		wb = lib.launchBrowser("FireFox");

		wb.get("https://www.flipkart.com/");

		//maximise the window.
		wb.manage().window().maximize();
		
		//To perform actions like double click, mouse hover, drag drop etc
		Actions act = new Actions(wb);
		wb.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		
		WebElement ele = wb.findElement(By.xpath("//span[text()='Men']"));

		act.moveToElement(ele).build().perform();
		
		Thread.sleep(2000);
		
		wb.findElement(By.xpath("//a[@title='Jeans']")).click();
		
		Thread.sleep(3000);

		ele = wb.findElement(By.xpath("//div[@class='_3G9WVX oVjMho']/div[@class='_3aQU3C']"));

		act.dragAndDropBy(ele, 50, 0).build().perform();

	}

}
