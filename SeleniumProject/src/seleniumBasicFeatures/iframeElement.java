package seleniumBasicFeatures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class iframeElement {
	FunctionalLibrary lib = new FunctionalLibrary();
	@Test
	public void test6() throws InterruptedException {
		System.out.println("Launching browser");
		WebDriver wb = lib.launchBrowser("FireFox");

		wb.get("https://paytmmall.com/");
		
		wb.manage().window().maximize();
		Thread.sleep(2000);
		wb.findElement(By.xpath("//div[text()='Log In/Sign Up']")).click();
		Thread.sleep(5000);
		//wb.switchTo().frame(0);
		wb.switchTo().frame(wb.findElement(By.tagName("iframe")));
		
		Thread.sleep(3000);
				
		wb.findElement(By.xpath("//span[text()='Login/Signup with mobile number and password']")).click();
		wb.switchTo().defaultContent();

	}
}
