package seleniumBasicFeaturesPractice1;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WindowHandlingPractice2 {
	@Test(parameters="SelectBrowser")
	public void windowHandlePractice1(String browser) throws InterruptedException{
		FunctionalLibrary lib = new FunctionalLibrary();
		
		WebDriver wdr = lib.launchBrowser(browser);
		
		wdr.get("https://www.naukri.com/");
		
		String parent = wdr.getWindowHandle();
		
		Set<String> winHandle = wdr.getWindowHandles();
		
		for (String wh : winHandle) {
			wdr.switchTo().window(wh);
			List<WebElement> wele= wdr.findElements(By.xpath("//img[@alt='Sierra Cedar']"));
			if (wele.size()>0){
				//wele.get(0).click();
				wdr.findElement(By.xpath("//img[@alt='Sierra Cedar']")).click();
			}
			
		}
		
	}
}
