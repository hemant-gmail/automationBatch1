package seleniumBasicFeaturesPractice1;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Element_2_TextBox {
	
	@Test(priority = 0)
	public void firefoxtest() throws InterruptedException{
		
		System.setProperty("webdriver.gecko.driver", "D:\\AutomationBatch1\\automationBatch1\\Drivers\\geckodriver.exe");
		
		FirefoxDriver fdr = new FirefoxDriver();
		fdr.get("https://demoqa.com/text-box");
		
		fdr.manage().window().maximize();
		
		//Enter Full Name
		fdr.findElement(By.xpath("//input[@id='userName']")).sendKeys("15 November");
		
		//Enter email id
		fdr.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("Iam.November@gmail.com");

		//Enter Current Address
		fdr.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("Pune, Maharashtra,\nIndia, Asia,\nEarth");

		//Enter Current Address
		fdr.findElement(By.xpath("//textarea[@id='permanentAddress']")).sendKeys("Wardha, Maharashtra,\nIndia, Asia,\nEarth");
		Thread.sleep(5000);
		
		//fdr.close();
		
	}

}
