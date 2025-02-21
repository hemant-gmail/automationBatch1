package driver;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import configuration.Configuration;
import functionalLibrary.ApplicationLibrary;
import functionalLibrary.ExcelFunctionLibrary;

public class Driver {

	public ApplicationLibrary lib;
	public ExcelFunctionLibrary xlLib;
	
	@BeforeSuite
	public void oneTimeSetup() throws IOException{
		lib = new ApplicationLibrary();
		xlLib= new ExcelFunctionLibrary(Configuration.testDataPath);
		
		//login to dependency machines
		//Clear database
		//delete logfiles
		//web.config files
	}
	
	@AfterSuite
	public void oneTimeTearDown(){
		//Close all the connections
	}
}
