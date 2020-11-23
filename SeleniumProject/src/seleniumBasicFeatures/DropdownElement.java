package seleniumBasicFeatures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropdownElement {
	FunctionalLibrary lib = new FunctionalLibrary();
	WebDriver wb;

	@Test
	public void test() throws InterruptedException {
		System.out.println("Launching browser");
		wb = lib.launchBrowser("FireFox");

		wb.get("http://sampleapp.tricentis.com/101/app.php");

		// maximise the window.
		wb.manage().window().maximize();
		
		WebElement wele = wb.findElement(By.id("make"));
		Select sel = new Select(wele);
		sel.selectByIndex(13);
		
		Thread.sleep(2000);
		
		sel.selectByValue("BMW");

	
		Thread.sleep(2000);
		
		sel.selectByVisibleText("Renault");
}

}
