package seleniumBasicFeatures;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LinkElement {
	
	@Test
	public void test1(){
		System.out.println("Launching browser");

		System.setProperty("webdriver.chrome.driver",
				"D:\\AutomationBatch1\\automationBatch1\\Drivers\\chromedriver.exe");
		ChromeDriver chromDr = new ChromeDriver();

		// navigate to URL
//		chromDr.get("http://sampleapp.tricentis.com/101/index.php");
//		chromDr.get("https://autosneh.wordpress.com/");
		chromDr.get("https://demoqa.com/links");
		
		//maximise the window.
		chromDr.manage().window().maximize();

		//get caption
		//System.out.println(chromDr.findElement(By.id("simpleLink")).getText());
				
		//Click Automobile
//		chromDr.findElement(By.id("simpleLink")).click();

//		WebElement ele = chromDr.findElement(By.id("simpleLink"));
		
		String parent = chromDr.getWindowHandle();
		WebElement ele = chromDr.findElement(By.xpath("//a[@id='simpleLink']"));
		
		
		//Validate text -- Home
		Assert.assertEquals(ele.getText(), "Home");

		Set<String> wins = 		chromDr.getWindowHandles();
		int numOfWindows = wins.size();
		System.out.println("No Of windows open are "+ numOfWindows);
//		OR System.out.println("No Of windows open are "+chromDr.getWindowHandles().size() );
		
		//Verify link is working or not
		ele.click();
		Assert.assertEquals(chromDr.getWindowHandles().size(), numOfWindows+1);
		
		for (String s : wins) {
			System.out.println("Path "+ s);
			if(!s.equals(parent)){
				chromDr.switchTo().window(s);
			}
			System.out.println("Path "+ s);
		}
		
		WebElement image = chromDr.findElement(By.xpath("//img[@class='banner-image']"));
		
		image.click();
		
/*		if (numOfWindows < chromDr.getWindowHandles().size()){
			System.out.println("Successssssssssssss");
		}
*/		
		
/*		2 types of  X path
		1. Relative X path 
		ex.//img[@class='banner-image']
		Syntax: //tagName[@attributeName='attribute value']
		2. absolute X path : which come from root mean from html
		ex. /html/body/div/div/div/div[1]/a/img
		
*/	}

}
