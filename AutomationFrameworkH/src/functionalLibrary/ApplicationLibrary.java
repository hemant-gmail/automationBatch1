package functionalLibrary;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.poi.hwpf.model.types.LSTFAbstractType;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

import configuration.Configuration;

public class ApplicationLibrary {
	
	/*	
	 * Author: Hemant
	 * Date: 19 Nov 2020 
	 * Description: launching browser
	 * Param:
	 * 	
	*/
	public WebDriver launchBrowser(String browser) {
		WebDriver wdr = null;
		if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",Configuration.fireFoxDriverPath);
			wdr = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", Configuration.edgeDriverPath);
			wdr = new EdgeDriver();
		} else if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", Configuration.chromeDriverPath);
			wdr = new ChromeDriver();
		}
		
		if (!wdr.equals(null)){
			wdr.manage().window().maximize();
		}
		return wdr;
	}
	
	/*	
	 * Author: Hemant
	 * Date: 19 Nov 2020 
	 * Description: confirming the valid xpath
	 * Param:
	 * 	
	*/
	public boolean isElementPresent(WebDriver wdr, By element){
		
		List<WebElement> wele = wdr.findElements(element);
		
		if (wele.size() > 0){
			return true;
		}else{
		return false;}
	}
	
	/*	
	 * Author: Hemant
	 * Date: 2 Nov 2020 
	 * Description: Capure screen shot
	 * Param:
	 * 
	*/
	public void capureScreenShot(WebDriver wdr, String fileName) throws IOException{
		
		//To create reference of TakesScreenshot
		TakesScreenshot screenshot=(TakesScreenshot)wdr;
		//Call method to capture screenshot
		File src=screenshot.getScreenshotAs(OutputType.FILE);
		//Copy file to specific location		
		String currenttime = new SimpleDateFormat("MMddyyyHHmmss").format(new Date());
		FileHandler.copy(src, new File(Configuration.ScreenShortPath+fileName+"_"+currenttime+".png"));

	}
	
}
