package extentReportFeatures;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Ttesting {
	public static void main(String[] args) {
		String reportPath = System.getProperty("user.dir")+ "\\src\\extentReportFeatures\\AutomationReport.html";
		ExtentHtmlReporter reporter = new ExtentHtmlReporter(reportPath);
		
		ExtentReports reports =  new ExtentReports();
		
		reports.attachReporter(reporter);
		
		ExtentTest test1 = reports.createTest("Verify Extent report");
		
		test1.pass("Step 1 is pass");
		test1.fail("Step 2 is failed");
		test1.skip("Step 3 is skiped");
		
test1 = reports.createTest("Verify Extent report Test 2");
		
		test1.pass("Step 1 is pass");
		test1.fail("Step 2 is failed");
		test1.skip("Step 3 is skiped");
		
test1 = reports.createTest("Verify Extent report Test 2");
		
		test1.pass("Step 1 is pass");
		test1.fail("Step 2 is failed");
		test1.skip("Step 3 is skiped");
		
		reports.flush();
		
		System.out.println("Done");
	}

}
