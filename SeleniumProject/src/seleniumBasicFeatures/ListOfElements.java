package seleniumBasicFeatures;

import org.openqa.selenium.chrome.ChromeDriver;

public class ListOfElements {
	
	/*Link, textbox, button, alerts, Pop up, dropdown, radiobutton, checkbox, textarea, image, combobox, 
	iframe, multiple window, tooltip */
	
	public static void main(String[] args) {
		System.out.println("Launching browser");

		System.setProperty("webdriver.chrome.driver",
				"D:\\AutomationBatch1\\automationBatch1\\Drivers\\chromedriver.exe");
		ChromeDriver chromDr = new ChromeDriver();

		// navigate to URL
		chromDr.get("http://sampleapp.tricentis.com/101/index.php");

		//
		chromDr.manage().window().maximize();

	}

}
