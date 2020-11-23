package extentReportFeatures;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Testing {

	public static void main(String[] args) {
		
		String reportPath=System.getProperty("user.dir")+"\\src\\extentReportFeatures\\AutomationReport.html";
		
		//Step 1
		ExtentHtmlReporter reporter= new ExtentHtmlReporter(reportPath);
		
		//Step 2
		ExtentReports repo= new ExtentReports();
		
		//Step 3
		repo.attachReporter(reporter);
		
		//step 4: It will create a new test
		ExtentTest test1=repo.createTest("Verify extent report");
		
		test1.pass("Step 1 is passed");
		
		test1.pass("Step 2 is failed");
		
		test1.skip("Step 3 is skipped");
		
		//Step 5: It will create a second test
		test1=repo.createTest("Test 2");
		
		test1.pass("Step 1 is passed");
		
		test1.pass("Step 2 is failed");
		
		test1.pass("Step 3 is skipped");
		
		
		//Step 6: It will create third test
		test1=repo.createTest("Test 3");
		
		test1.pass("Step 1 is passed");
		
		test1.fail("Step 2 is failed");
		
		test1.skip("Step 3 is skipped");
		
		
		//Step 7: MUST flush at last
		repo.flush();
		
		

	}

}
