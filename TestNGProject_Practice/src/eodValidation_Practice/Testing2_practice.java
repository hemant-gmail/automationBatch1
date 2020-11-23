package eodValidation_Practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testing2_practice {

//----------------------------------BEFORE & AFTER CLASS----------------------------------
	@BeforeClass
	public void beforeClass(){
		System.out.println("    Before Class called(Testing2_practice)(eodValidation)");
	}
	
	@AfterClass
	public void afterClass(){
		System.out.println("    After Class called(Testing2_practice)(eodValidation)");
	}

//----------------------------------BEFORE & AFTER METHOD----------------------------------
	@BeforeMethod
	public void beforeMethod(){
		System.err.println("      Before Method Called(Testing2_practice)(eodValidation)");
	}
	
	@AfterMethod
	public void afterMethod(){
		System.err.println("      After Method Called(Testing2_practice)(eodValidation)");
	}

//----------------------------------TEST CASE----------------------------------
	@Test
	public void test1(){
		System.out.println("        Test Case 1(Testing2_practice)(eodValidation)");
	}

	@Test
	public void test2(){
		System.out.println("        Test Case 2(Testing2_practice)(eodValidation)");
		System.out.println(10/0);
	}
	
	@Test
	public void test3(){
		System.out.println("        Test Case 3(Testing2_practice)(eodValidation)");
	}

	@Test
	public void test4(){
		System.out.println("        Test Case 4(Testing2_practice)(eodValidation)");
	}
	
	@Test
	public void test5(){
		System.out.println("        Test Case 5(Testing2_practice)(eodValidation)");
	}

}
