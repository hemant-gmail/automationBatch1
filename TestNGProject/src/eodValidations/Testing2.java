package eodValidations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testing2 {
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before CLass tesing2 class");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("A CLass tesing2 class");
		System.out.println("********************************************");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before method testing2 class");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("After method testing2 class");
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

	@Test
	public void Test3(){
		System.out.println("Test case 3");
	}

	@Test
	public void Test4(){
		System.out.println("Test case 4");
	}

	@Test
	public void Test5(){
		System.out.println("Test case 5");
	}
	
	@Test
	public void Test6(){
		System.out.println("Test case 6");
	}

	@Test
	public void Test7(){
		System.out.println("Test case 7");
	}

	@Test
	public void Test8(){
		System.out.println("Test case 8");
	}

	@Test
	public void Test9(){
		System.out.println("Test case 9");
	}

	@Test
	public void Test10(){
		System.out.println("Test case 10");
	}


}
