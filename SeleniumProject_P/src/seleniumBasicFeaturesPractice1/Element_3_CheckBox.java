package seleniumBasicFeaturesPractice1;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Element_3_CheckBox {
	
	@Test
	public void checkBoxTest_firefox() throws InterruptedException{
		
		System.setProperty("webdriver.gecko.driver", "D:\\AutomationBatch1\\automationBatch1\\Drivers\\geckodriver.exe");
		FirefoxDriver fdr = new FirefoxDriver();
		
		fdr.get("https://demoqa.com/checkbox");
		
		fdr.manage().window().maximize();
		
//		System.out.println(fdr.findElement(By.xpath("//span[@class='rct-checkbox']")).isSelected());
		fdr.findElement(By.xpath("//button[@title='Toggle']")).click();  // Click on Home toggle button to expand
		fdr.findElement(By.xpath("//label[@for='tree-node-documents']/span[@class='rct-checkbox']")).click(); // click on document checkbox
//		System.out.println(fdr.findElement(By.xpath("//span[@class='rct-checkbox']")).isSelected());
		
		Thread.sleep(5000);
		fdr.close();
		
	}
	
	@Test(priority =0)
	public void checkBoxTest_edge()throws InterruptedException{
		System.setProperty("webdriver.edge.driver", "D:\\AutomationBatch1\\automationBatch1\\Drivers\\edgedriver_win64\\msedgedriver.exe");
		EdgeDriver edr = new EdgeDriver();
		
		edr.get("https://demoqa.com/checkbox");
		
		edr.manage().window().maximize();
		//Assignemnt: Expand Commands, office>>Public and excel
		
		//Clikc on Home>>Desktop>>Commads
		//Click on Home Toggle to expand
		edr.findElement(By.xpath("//button[@title='Toggle']")).click();
		//Click Desktop toggle to expand
		edr.findElement(By.xpath("//label[@for='tree-node-desktop']/preceding-sibling::button[@title='Toggle']")).click();
		//Click on command
		edr.findElement(By.xpath("//label[@for='tree-node-commands']")).click();
		Thread.sleep(3000);
		
		//Click on Home>>Documnts>>Office >> public
		//Click Desktop toggle to collaps
		edr.findElement(By.xpath("//label[@for='tree-node-desktop']/preceding-sibling::button[@title='Toggle']")).click();
		//As Home already expand find Documents toggle and click on it
		edr.findElement(By.xpath("//label[@for='tree-node-documents']/preceding-sibling::button[@title='Toggle']")).click();		
		//Now click on Office toggle
		edr.findElement(By.xpath("//label[@for='tree-node-office']/preceding-sibling::button[@title='Toggle']")).click();
		//Click on Public
		edr.findElement(By.xpath("//label[@for='tree-node-public']")).click();
		Thread.sleep(3000);
		
		
		//Click on Home>>Downloads >> Excel File
		//Click documents toggle to collaps
		edr.findElement(By.xpath("//label[@for='tree-node-documents']/preceding-sibling::button[@title='Toggle']")).click();		
		//As Home already expand find Downloads toggle and click on it
		edr.findElement(By.xpath("//label[@for='tree-node-downloads']/preceding-sibling::button[@title='Toggle']")).click();
		//Click on ExcelFile
		edr.findElement(By.xpath("//label[@for='tree-node-excelFile']")).click();
		Thread.sleep(3000);
						
		edr.close();
	}

}
