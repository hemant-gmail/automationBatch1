package seleniumBasicFeatures;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WebTableElement {
	FunctionalLibrary lib = new FunctionalLibrary();
	WebDriver wb;
	
	@Test
	public void test9(){
		System.out.println("Launching browser");
		wb = lib.launchBrowser("FireFox");

		wb.get("https://www.w3schools.com/html/html_tables.asp");

		//maximise the window.
		wb.manage().window().maximize();

		List<WebElement> rows = wb.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		
		//table[@id='customers']/tbody/tr[2]/td[2]
		
		WebElement ele= null;
		
		for (int i = 2; i < rows.size(); i++) {
			for (int j = 1; j < wb.findElements(By.xpath("//table[@id='customers']/tbody/tr["+i+"]/td")).size(); j++) {
				ele = wb.findElement(By.xpath("//table[@id='customers']/tbody/tr["+i+"]/td["+j+"]"));
				System.out.println(ele.getText());
			}
		}
		
	}

}
