package basicFunctions;

import org.testng.annotations.Test;

public class DependsOnMethodConcept {
	
	@Test
	public void launchBrowser(){
//		System.out.println(10/0);
		System.out.println(" Browser getting launched successfully");
	}

	@Test(dependsOnMethods="launchBrowser")
	public void login(){
//		System.out.println(10/0);
		System.out.println(" User logins");		
	}

	@Test(dependsOnMethods="login",priority=1)
	public void logOut(){
		System.out.println(" User logs out");		
		System.out.println();
	}

	@Test(dependsOnMethods="login")
	public void verifyHomePage(){
//		System.out.println(10/0);
		System.out.println(" Verify Home page");		
	}

}
