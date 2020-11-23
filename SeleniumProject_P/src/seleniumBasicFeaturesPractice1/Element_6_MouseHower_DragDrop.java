package seleniumBasicFeaturesPractice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Element_6_MouseHower_DragDrop {
	
	@Test(parameters="SelectBrowser")
	public void practiceMouseHower(String browser) throws InterruptedException{
		FunctionalLibrary lib = new FunctionalLibrary();
		WebDriver wdr = lib.launchBrowser("firefox");
		wdr.get("https://www.flipkart.com/");		
		wdr.manage().window().maximize();
		
		wdr.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		
		//Mouse hower and click
		WebElement wele = wdr.findElement(By.xpath("//span[text()='Men']"));
		Actions act = new Actions(wdr);
		act.moveToElement(wele).build().perform();
		
		Thread.sleep(3000);
		wdr.findElement(By.xpath("//a[text()='Kurta']")).click();
		
		
		//Drag and Drop
		Thread.sleep(3000);
		wele = wdr.findElement(By.xpath("//div[@class='_3G9WVX oVjMho']/div[@class='_3aQU3C']"));
		act.dragAndDropBy(wele, 50, 0).build().perform();
		
/*		Thread.sleep(5000);;
		wdr.close();
*/	}

}
