package seleniumBasicFeaturesPractice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FunctionalLibrary {

	public WebDriver launchBrowser(String browser) {
		WebDriver wdr = null;
		if (browser.equalsIgnoreCase("FireFox")) {
			System.setProperty("webdriver.gecko.driver",
					"D:\\AutomationBatch1\\automationBatch1\\Drivers\\geckodriver.exe");
			wdr = new FirefoxDriver();
		}else if (browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver",
					"D:\\AutomationBatch1\\automationBatch1\\Drivers\\edgedriver_win64\\msedgedriver.exe");
			wdr = new EdgeDriver();
		}else if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"D:\\AutomationBatch1\\automationBatch1\\Drivers\\chromedriver.exe");
			wdr = new ChromeDriver();
		}
		return wdr;
	}

}
