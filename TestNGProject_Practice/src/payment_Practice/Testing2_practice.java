package payment_Practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testing2_practice {
	@BeforeClass
	public void beforeClass(){
		System.out.println("    Before Class called(Testing2_practice)(Payments)");
	}
	
	@AfterClass
	public void afterClass(){
		System.out.println("    After Class called(Testing2_practice)(Payments)");
	}

	@BeforeMethod
	public void beforeMethod(){
		System.err.println("      Before Method Called(Testing2_practice)(Payments)");
	}
	
	@AfterMethod
	public void afterMethod(){
		System.err.println("      After Method Called(Testing2_practice)(Payments)");
	}

	@Test
	public void test1(){
		System.out.println("        Test Case 1(Testing2_practice)(Payments)");
	}

	@Test
	public void test2(){
		System.out.println("        Test Case 2(Testing2_practice)(Payments)");
		System.out.println(10/0);
	}
	
	@Test
	public void test3(){
		System.out.println("        Test Case 3(Testing2_practice)(Payments)");
	}

	@Test
	public void test4(){
		System.out.println("        Test Case 4(Testing2_practice)(Payments)");
	}
	
	@Test
	public void test5(){
		System.out.println("        Test Case 5(Testing2_practice)(Payments)");
	}

}
