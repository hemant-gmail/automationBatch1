package readExcel;

import java.io.IOException;

public class TextExcelLibrary {
	public static void main(String[] args) throws IOException {
//		ExcelFunctionLibrary excelFile = new ExcelFunctionLibrary();
		ExcelFunctionLibrary2 excelFile = new ExcelFunctionLibrary2(System.getProperty("user.dir")+ "\\src\\readExcel\\Book1.xlsx");
		
		
		// System.out.println( excelFile.getCellData("TestData", 0, 1));

		/*
		 * String data1 = excelFile.getCellData("TestData", 0, 0);
		 * System.out.println(data1); data1 = excelFile.getCellData("TestData",
		 * 0, 1); System.out.println(data1); data1 =
		 * excelFile.getCellData("Sheet3", 1, 0); System.out.println(data1);
		 * System.out.println("---------------------");
		 */

/*		int rowCount = excelFile.getNumberOfRows("TestData");
		int colCount = 0;

		System.out.println(colCount);

		for (int r = 0; r < rowCount; r++) {
			colCount = excelFile.getNumberOfColumns("TestData", r);
			for (int c = 0; c < colCount; c++) {
				System.out.print(excelFile.getCellData("TestData", r, c) + " ");
			}
			System.out.println();
		}
*/		
//		 System.getProperty("user.dir")+ "\\src\\readExcel\\"+"Book1.xlsx";

		int rowCount = excelFile.getNumberOfRows("TestData");
		int colCount = excelFile.getNumberOfColumns("TestData");

		for (int r = 0; r < rowCount; r++) {
			for (int c = 0; c < colCount; c++) {
				System.out.print(excelFile.getCellData("TestData", r, c) + " ");
			}
			System.out.println();
		}
		
		excelFile.setCellData("TestData", 0, 1, "Test");

	}

}
