package fundTransfer_Practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testing_practice {
	
//----------------------------------BEFORE & AFTER TEST----------------------------------
	@BeforeTest
	public void beforeTest(){
		System.out.println("  Before Test called(payment_Practice)(fundTransfer)");		
	}
	
	@AfterTest
	public void afterTest(){
		System.out.println("  After Test called(payment_Practice)(fundTransfer)");				
	}
	
//----------------------------------BEFORE & AFTER CLASS----------------------------------
	@BeforeClass
	public void beforeClass(){
		System.out.println("    Before Class called(Testing1_practice)(fundTransfer)");
	}
	
	@AfterClass
	public void afterClass(){
		System.out.println("    After Class called(Testing1_practice)(fundTransfer)");
		System.out.println("    ---------------------><----------------------");
	}

//----------------------------------BEFORE & AFTER METHOD----------------------------------
	@BeforeMethod
	public void beforeMethod(){
		System.err.println("      Before Method Called(Testing1_practice)(fundTransfer)");
	}
	
	@AfterMethod
	public void afterMethod(){
		System.err.println("      After Method Called(Testing1_practice)(fundTransfer)");
	}

//----------------------------------TEST CASE----------------------------------	
	@Test
	public void test1(){
		System.out.println("        Test Case 1(Testing1_practice)(fundTransfer)");
	}

	@Test
	public void test2(){
		System.out.println("        Test Case 2(Testing1_practice)(fundTransfer)");
		System.out.println(10/0);
	}

	@Test
	public void test3(){
		System.out.println("        Test Case 3(Testing1_practice)(fundTransfer)");
	}

	@Test
	public void test4(){
		System.out.println("        Test Case 4(Testing1_practice)(fundTransfer)");
	}
	
	@Test
	public void test5(){
		System.out.println("        Test Case 5(Testing1_practice)(fundTransfer)");
	}

}
