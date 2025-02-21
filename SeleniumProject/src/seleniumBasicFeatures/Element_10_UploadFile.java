package seleniumBasicFeatures;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Element_10_UploadFile {
	
	FunctionalLibrary lib = new FunctionalLibrary();
	@Test
	@Parameters("SelectBrowser")
	public void uplaodFile(String browser) throws AWTException, InterruptedException{
		WebDriver wdr =  lib.launchBrowser(browser);
		wdr.get("https://demoqa.com/upload-download");
		wdr.manage().window().maximize();
		
		//wdr.findElement(By.id("uploadFile")).click();
		wdr.findElement(By.xpath("//label[@for='uploadFile']")).click();
		
		//Keyboard and mouse related operations
		Robot rb = new Robot();
		StringSelection cb = new StringSelection("D:\\AutomationBatch1\\automationBatch1\\AutomationFrameworkH\\Screenshots\\testing.png");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(cb,null);
		
		Thread.sleep(10000);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.delay(2000);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
	}

}
