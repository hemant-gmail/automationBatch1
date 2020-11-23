package additionalAnnotation;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderConcept {
	@Test(dataProvider= "testData")
	public void loginTest(String uName, String pwd){
		System.out.println("Enter LoginName " + uName);
		System.out.println("Enter password "+pwd);
		System.out.println("click  on submit");
		System.out.println("---------------------------------");
		
	}
	
	@DataProvider
	public String[][] testData(){
		//UserName	| Password
		//UserName1	| Password1
		//UserName2	| Password2
		//UserName3	| Password3
		
		String[][] loginData = new String[3][2];
		
		//Row1
		loginData[0][0]="UserName1";
		loginData[0][1]="Password1";
		
		//Row2
		loginData[1][0]="UserName2";
		loginData[1][1]="Password2";

		//Row1
		loginData[2][0]="UserName3";
		loginData[2][1]="Password3";
		
		return loginData;
	}
	
}
