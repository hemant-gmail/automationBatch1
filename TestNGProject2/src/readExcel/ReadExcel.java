package readExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	public static void main(String[] args) throws IOException {
		//Step 1.
		//String filePath = "D:\\AutomationBatch1\\automationBatch1\\TestNGProject2\\src\\readExcel\\Book1.xlsx";
		String filePath = System.getProperty("user.dir")+ "\\src\\readExcel\\Book1.xlsx";
		
		//Step 2.
		FileInputStream file = new FileInputStream(filePath);
		
		//Step 3.
		XSSFWorkbook wb = new XSSFWorkbook(file);
		
		//Step 4.
		XSSFSheet sheet =  wb.getSheet("TestData");

		//Step 5
		XSSFRow row = sheet.getRow(0);
		
		//Step 6
		XSSFCell cell = row.getCell(0);
		
		//Step 7
		String cellValue = cell.getStringCellValue();
		
		
		System.out.println(cellValue);
		
	}
	
}
