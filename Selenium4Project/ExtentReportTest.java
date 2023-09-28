package com.extentreport.test;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportTest {

	@Test
	public void extentReport() {
		
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("index.html"); //html file will be generated
		spark.config().setTheme(Theme.DARK);
		spark.config().setDocumentTitle("My Automation Report");
		spark.config().setReportName("Extent Reports Demo");
		extent.attachReporter(spark);

		
		ExtentTest test = extent.createTest("Login Test").assignAuthor("Amar").assignCategory("Smoke").assignCategory("Regression").assignDevice("Chrome 86");  //Create a test node in the report
		
		test.pass("Login Test Started Successfully");		//create a step node in the report
		test.info("URL is Loaded");
		test.info("Value Entered");
		test.pass("Login Test completed successfully");
		//test.skip("Testskip" );  // removed debug, Fatal, error  --->  to match junit, testNG
		

		ExtentTest test1 = extent.createTest("HomePage Test").assignCategory("Regression").assignAuthor("Amar").assignAuthor("Lalit").assignDevice("Firefox");  //Create a test node in the report
		
		test1.pass("HomePage Test Started Successfully");		//create a step node in the report
		test1.info("URL is Loaded");
		test1.info("Value Entered");
		test1.fail("HomePage Test failed miserably");
		
		
		
		extent.flush();    //To write the logs in the report
	}
}
