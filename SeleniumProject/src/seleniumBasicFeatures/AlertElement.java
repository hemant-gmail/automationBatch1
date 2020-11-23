package seleniumBasicFeatures;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class AlertElement {
	
	FunctionalLibrary lib = new FunctionalLibrary();
	WebDriver wb;

	@Test
	public void test10() throws InterruptedException{
		System.out.println("Launching browser");
		wb = lib.launchBrowser("FireFox");

		wb.get("https://demoqa.com/alerts");

		//maximise the window.
		wb.manage().window().maximize();
		
		wb.findElement(By.xpath("//button[@id='alertButton']")).click();
		
		Alert alt=	wb.switchTo().alert();
		alt.accept();
		
		Thread.sleep(2000);

		wb.findElement(By.xpath("//button[@id='confirmButton']")).click();
		
		alt=	wb.switchTo().alert();
		alt.dismiss();
		
		
		Thread.sleep(2000);

		wb.findElement(By.xpath("//button[@id='promtButton']")).click();
		
		alt=	wb.switchTo().alert();
		alt.sendKeys("Hemant");
		alt.accept();
		
		
	}

}
