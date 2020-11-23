package seleniumBasicFeatures;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WindowsHandle2 {
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
	//	wb.switchTo().window(parent);
		
		for (String str : wins) {
			wb.switchTo().window(str);
			List<WebElement> wele = wb.findElements(By.xpath("//img[@alt='Cognizant']"));
			if (wele.size() > 0){
				wele.get(0).click();
				//wb.findElement(By.xpath("//img[@alt='Cognizant']")).click();
			}
		}
		
		
	}

}
