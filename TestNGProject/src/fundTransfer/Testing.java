package fundTransfer;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testing {
	@BeforeSuite
	public void beforeSuite(){
		System.out.println("Before Suite -> application");
	}
	
	@AfterSuite
	public void afterSuite(){
		System.out.println("After Suite -> application");		
	}

	@BeforeTest
	public void beforePaymentModule(){
		System.out.println("Before Test -> tesing class-fundTransfer");		
	}
	
	@AfterTest
	public void AfterPaymentModule(){
		System.out.println("After Test -> tesing class-fundTransfer");		
	}
	@BeforeClass
	public void beforeClass(){
		System.out.println("Before CLass -> tesing class");
	}
	
	@AfterClass
	public void afterClass(){
		System.out.println("After CLass -> tesing class");		
	}

	@BeforeMethod
	public void beforeMethod(){
		System.out.println("Before method -> testing class");
	}
	
	@AfterMethod
	public void afterMethod(){
		System.out.println("After method -> testing class");
		System.out.println();
	}

	@Test
	public void Test1(){
		System.out.println("Test case 1");
	}

	@Test
	public void Test2(){
		System.out.println("Test case 2");
		System.out.println(10/0);		
	}
}
