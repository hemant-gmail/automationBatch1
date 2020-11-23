package additionalAnnotations;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import readExcel.ExcelFunctionLibrary2;

public class dataProviderConcept {

	@Test(dataProvider="loginData2")
	public void loginTest(String userName, String password, String pin) throws IOException {
		System.out.println("Enter UserName "+userName);
		System.out.println("Enter Password "+password);
		System.out.println("Enter Pin "+pin);		
		System.out.println("Click on Login button");
		System.out.println("*************************");
		//loginData2();
	}
	
/*	@Test
	public void test1(){
		String[][] data = loginData();
		
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				System.out.println(data[i][j]);
			}
		}
	}*/
	
	@DataProvider
	public String[][] loginData() {
		// UserName | Password
		// UserName1 | Password1
		// UserName2 | Password2
		// UserName3 | Password3

		String[][] logData = new String[3][3];
		// Row1
		logData[0][0] = "UserName1";
		logData[0][1] = "Password1";
		logData[0][2] = "Pin1";

		// Row2
		logData[1][0] = "UserName2";
		logData[1][1] = "Password2";
		logData[1][2] = "Pin2";

		// Row3
		logData[2][0] = "UserName3";
		logData[2][1] = "Password3";
		logData[2][2] = "Pin3";
		
		return logData;
	}

	@DataProvider
	public String[][] loginData2() throws IOException {
		// UserName | Password
		// UserName1 | Password1
		// UserName2 | Password2
		// UserName3 | Password3
		ExcelFunctionLibrary2 excelFile = new ExcelFunctionLibrary2(System.getProperty("user.dir")+ "\\src\\readExcel\\Book1.xlsx");

		int rowCount = excelFile.getNumberOfRows("TestData");
		int colCount = excelFile.getNumberOfColumns("TestData");

		String[][] logData = new String[rowCount-1][colCount];

		for (int r = 1; r < rowCount; r++) {
			for (int c = 0; c < colCount; c++) {
	//			System.out.print(excelFile.getCellData("TestData", r, c) + " ");
				logData[r-1][c] = excelFile.getCellData("TestData", r, c);				
			}
//			System.out.println();
		}


//		String[][] logData = new String[3][3];
		// Row1
/*		logData[0][0] = "UserName1";
		logData[0][1] = "Password1";
		logData[0][2] = "Pin1";

		// Row2
		logData[1][0] = "UserName2";
		logData[1][1] = "Password2";
		logData[1][2] = "Pin2";

		// Row3
		logData[2][0] = "UserName3";
		logData[2][1] = "Password3";
		logData[2][2] = "Pin3";*/
		
		return logData;
	}
}













