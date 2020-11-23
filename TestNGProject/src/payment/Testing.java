package payment;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testing {
	@BeforeTest
	public void beforePaymentModule(){
		System.out.println("Before Test tesing class");		
	}
	
	@AfterTest
	public void AfterPaymentModule(){
		System.out.println("After Test tesing class");		
	}
	@BeforeClass
	public void beforeClass(){
		System.out.println("Before CLass tesing class");
	}
	
	@AfterClass
	public void afterClass(){
		System.out.println("A CLass tesing class");		
	}

	@BeforeMethod
	public void beforeMethod(){
		System.out.println("Before method testing class");
	}
	
	@AfterMethod
	public void afterMethod(){
		System.out.println("After method testing class");
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
