package testing;

import org.testng.annotations.Test;

import driver.Driver;

public class TestingDriverClass extends Driver{

	@Test
	public void test(){
		lib.launchBrowser("firefox");
	}
}
