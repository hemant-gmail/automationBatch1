package pages.Home;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import functionalLibrary.ApplicationLibrary;

public class HomePage {

	WebDriver wdr;

	ApplicationLibrary lib = new ApplicationLibrary();

	public HomePage(WebDriver wdr) {
		this.wdr = wdr;
	}

	// WebElement
	By automobile = By.xpath("//div[@class='main-navigation']/ul/li/a[@id='nav_automobile']");
	By truck = By.xpath("//div[@class='main-navigation']/ul/li/a[@id='nav_truck']");
	By motorcycle = By.xpath("//div[@class='main-navigation']/ul/li/a[@id='nav_motorcycle']");
	By camper = By.xpath("//div[@class='main-navigation']/ul/li/a[@id='nav_camper']");

	
	public boolean isAutomobilePresent() {
		if (lib.isElementPresent(wdr, automobile)) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isTrueckPresent() {
		if (lib.isElementPresent(wdr, truck)) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isMotorCyclePresent() {
		if (lib.isElementPresent(wdr, motorcycle)) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isCamperPresent() {
		if (lib.isElementPresent(wdr, camper)) {
			return true;
		} else {
			return false;
		}
	}

	public void clickAutomobile() {

		/*
		 * if (lib.isElementPresent(wdr, automobile) == true) {
		 * wdr.findElement(automobile).click(); } else
		 * Assert.fail("Automobile element is not present on Home page");
		 */
		wdr.findElement(automobile).click();
	}

	public void clickTruck() {
		wdr.findElement(truck).click();
	}

	public void clickMotorCycle() {
		wdr.findElement(motorcycle).click();
	}

	public void clickCamper() {
		wdr.findElement(camper).click();
	}

}
