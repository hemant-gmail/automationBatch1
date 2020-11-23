package seleniumBasicFeaturesPractice1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Element_1_Link {

	@Test(priority = 1)
	public void firefoxtest() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"D:\\AutomationBatch1\\automationBatch1\\Drivers\\geckodriver.exe");
		FirefoxDriver fdr = new FirefoxDriver();

		fdr.get("http://sampleapp.tricentis.com/101/app.php");

		fdr.manage().window().maximize();

		String caption = fdr.findElement(By.id("nav_automobile")).getText();

		System.out.println(caption);

		WebElement wele = fdr.findElement(By.id("nav_automobile"));

		Assert.assertEquals(wele.getText(), "Automobile");

		fdr.findElement(By.id("nav_automobile")).click();

		Thread.sleep(5000);

		wele.click();

		Thread.sleep(2000);

		fdr.close();
	}

	@Test(priority = 0)
	public void edgetest() throws InterruptedException {
		System.setProperty("webdriver.edge.driver",
				"D:\\AutomationBatch1\\automationBatch1\\Drivers\\edgedriver_win64\\msedgedriver.exe");
		WebDriver edr = new EdgeDriver();

		edr.get("https://demoqa.com/links");

		edr.manage().window().maximize();

		String caption = edr.findElement(By.id("simpleLink")).getText();

		// WebElement wele = edr.findElement(By.id("simpleLink"));
		WebElement wele = edr.findElement(By.xpath("//a[@id='simpleLink']"));
		System.out.println(caption);

		// Validate text
		Assert.assertEquals(wele.getText(), "Home");

		String parent = edr.getWindowHandle();

		int noOfWindowsBefore = edr.getWindowHandles().size();

		wele.click();
		Thread.sleep(2000);

		Set<String> whandle = edr.getWindowHandles();
		int noOfWindows = whandle.size();

		Assert.assertEquals(noOfWindows, noOfWindowsBefore + 1);
		System.out.println("Total Number of windows are " + noOfWindows);

		for (String wh : whandle) {
			if (!wh.equals(parent)) {
				// edr.close();
				edr.switchTo().window(wh);
			}
		}
		WebElement image = edr.findElement(By.xpath("//img[@class='banner-image']"));

		image.click();

		// Close all windows excelpt parent
		whandle = edr.getWindowHandles();
		noOfWindows = whandle.size();

		for (String wh : whandle) {
			edr.switchTo().window(wh);
			if (!wh.equals(parent)) {
				edr.close();
			}
		}

		edr.switchTo().window(parent);
		// Dynamic link
		wele = edr.findElement(By.xpath("//a[@id='dynamicLink']"));
		wele.click();
		/*
		 * edr.findElement(By.id("nav_truck")).click();
		 * 
		 * Thread.sleep(5000);
		 */

		// edr.close();

	}

}
