package seleniumBasicFeatures;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WindowsHandler {
	FunctionalLibrary lib = new FunctionalLibrary();
	WebDriver wb;
	
	@Test
	public void test(){
		System.out.println("Launching browser");
		wb = lib.launchBrowser("FireFox");

		wb.get("https://www.naukri.com/");

		//maximise the window.
		wb.manage().window().maximize();
		
		String parent =wb.getWindowHandle();
		
		Set<String> wins = wb.getWindowHandles();
		int noOfWindows = wins.size();
		
		//If want to close all windows except parent window
/*		for (String str : wins) {
			
			if(!str.equalsIgnoreCase(parent)){
				wb.switchTo().window(str).close();
			}
			
		}
*/		
		wb.switchTo().window(parent);
		
		////img[@alt='Cognizant']
		

	}

}
