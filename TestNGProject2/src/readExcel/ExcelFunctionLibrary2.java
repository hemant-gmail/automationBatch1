package readExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.acl.NotOwnerException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFunctionLibrary2 {
	//Read file - Hardcoded value: Workbook name, sheet name, Row no, Column no
	//1. Workbook 
	//2, 
	//Write file

	//Step 1.
	String filePath; //= "D:\\AutomationBatch1\\automationBatch1\\TestNGProject2\\src\\readExcel\\Book1.xlsx";

	XSSFWorkbook wb ;
	public ExcelFunctionLibrary2(String filePath) throws IOException{
		this.filePath = filePath;
		
		//Step 2.
		FileInputStream file = new FileInputStream(filePath);
		
		//Step 3.
		wb = new XSSFWorkbook(file);
	}
	
	public String getCellData(String sheetName, int rowNumber, int colNumber) throws IOException{
		//Step 4.
		XSSFSheet sheet =  wb.getSheet(sheetName);

		//Step 5
		XSSFRow row = sheet.getRow(rowNumber);
		
		//Step 6
		XSSFCell cell = row.getCell(colNumber);
		
		//Step 7
		String cellValue = cell.getStringCellValue();
		
		return cellValue;
	}
	
	public void setCellData(String sheetName, int rowNumber, int colNumber, String inputValue ) throws IOException{

		//Step 4.
		XSSFSheet sheet =  wb.getSheet(sheetName);
	
		int lastrow = sheet.getLastRowNum()+1;
		sheet.createRow(lastrow);
		
		XSSFRow row = sheet.getRow(lastrow);
		row.createCell(colNumber);
		
		XSSFCell cell = row.getCell(colNumber);
		
		cell.setCellValue(inputValue);

		FileOutputStream updateFile = new FileOutputStream(this.filePath);
		wb.write(updateFile);
		
		//Step 5
//		XSSFRow row = sheet.getRow(rowNumber);
		
		//Step 6
//		XSSFCell cell = row.getCell(colNumber);
		
		//Step 7
//		String cellValue = cell.getStringCellValue();
		
//		return cellValue;
	}

	public int getNumberOfRows(String sheetName) throws IOException{
		
		//Step 4.
		XSSFSheet sheet =  wb.getSheet(sheetName);
		
		int rowCount = sheet.getPhysicalNumberOfRows();
		
		return rowCount;
	}
	
	public int getNumberOfColumns(String sheetName, int rowNumber) throws IOException{
		
		//Step 4.
		XSSFSheet sheet =  wb.getSheet(sheetName);
	
		//Step 5
		XSSFRow row = sheet.getRow(rowNumber);
						
		int colCount = 	row.getPhysicalNumberOfCells();
		
//		return sheet.getRow(rowNumber).getPhysicalNumberOfCells();
//		return sheet.getRow(0).getPhysicalNumberOfCells();  //If do not want to pass rowNumber in parameter
		
		return colCount;
	}

	public int getNumberOfColumns(String sheetName) throws IOException{
		
		//Step 4.
		XSSFSheet sheet =  wb.getSheet(sheetName);
	
		return sheet.getRow(0).getPhysicalNumberOfCells();  //If do not want to pass rowNumber in parameter		
	}
}
