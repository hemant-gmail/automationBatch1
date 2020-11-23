package readExcel_Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel_Practice {
	public static void main(String[] args) throws IOException {
		//Step 1
		String filePath = System.getProperty("user.dir")+ "\\src\\readExcel_Practice\\TestData.xlsx";
//		System.out.println(filePath);
		
		//Step 2
		FileInputStream file = new FileInputStream(filePath);
		
		//Step 3
		XSSFWorkbook wb = new XSSFWorkbook(file);
		
		//step 4
		XSSFSheet sheet  = wb.getSheet("TestData");
		
		//step 5
		XSSFRow row = sheet.getRow(0);
		
		//step 6
		XSSFCell col = row.getCell(0);
		
		//step 7
		System.out.println(col.getStringCellValue());
		
	}

}
