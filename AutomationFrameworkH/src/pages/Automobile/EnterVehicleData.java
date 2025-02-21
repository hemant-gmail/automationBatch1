package pages.Automobile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import functionalLibrary.ApplicationLibrary;

public class EnterVehicleData {
	
	WebDriver  wdr;
	ApplicationLibrary lib = new ApplicationLibrary();
	
	public EnterVehicleData(WebDriver wdr){
		this.wdr= wdr;
	}
	
	//WebElements
	
	By make= By.id("make");
	By engineperformance= By.id("engineperformance");
	By dateofmanufacture= By.id("dateofmanufacture");
	By numberofseats= By.id("numberofseats");
	By fuel= By.id("fuel");
	By listprice= By.id("listprice");
	By licenseplatenumber= By.id("licenseplatenumber");
	By annualmileage= By.id("annualmileage");
	
	//Visibility
	public boolean ismakePresent() {
		if (lib.isElementPresent(wdr, make)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isEnginePerformancePresent() {
		if (lib.isElementPresent(wdr, engineperformance)) {
			return true;
		} else {
			return false;
		}
	}

	//Actions
	public void EnterEnginePerformance(int data) {
		wdr.findElement(engineperformance).sendKeys(""+data);
	}
	
	

}
