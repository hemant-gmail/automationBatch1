package testing;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class CaptureScreenShot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.gecko.driver",
				"D:\\AutomationBatch1\\automationBatch1\\Drivers\\geckodriver.exe");
		FirefoxDriver fdr = new FirefoxDriver();

		fdr.get("https://www.w3schools.com/html/html_tables.asp"); 

		fdr.manage().window().maximize();
		
		//To create reference of TakesScreenshot
		TakesScreenshot screenshot=(TakesScreenshot)fdr;
		//Call method to capture screenshot
		File src=screenshot.getScreenshotAs(OutputType.FILE);
		//Copy file to specific location		
		String currenttime = new SimpleDateFormat("MMddyyyHHmmss").format(new Date());
		FileHandler.copy(src, new File("D:\\AutomationBatch1\\automationBatch1\\AutomationFrameworkH\\Screenshots\\"+currenttime+".png"));


		
	}
}
