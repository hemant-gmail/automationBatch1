package seleniumBasicFeaturesPractice1;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class WindowHandlingPractice1 {
	
	@Test(parameters="SelectBrowser")
	public void windowHandlePractice1(String browser) throws InterruptedException{
		FunctionalLibrary lib = new FunctionalLibrary();
		
		WebDriver wdr = lib.launchBrowser(browser);
		
		wdr.get("https://www.naukri.com/");
		
		String parent = wdr.getWindowHandle();
		
		Set<String> winHandle = wdr.getWindowHandles();
		
		for (String wh : winHandle) {
			if (!wh.equals(parent)){
//				wdr.switchTo().window(wh).close();		
			}
			//System.out.println(wh);
		}
		
		//img[@alt='Sierra Cedar']
/*		Thread.sleep(5000);
		wdr.close();
*/	}

}
