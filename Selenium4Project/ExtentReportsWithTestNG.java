package test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReportsWithTestNG {

	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	WebDriver driver;

	@BeforeSuite
	public void setUp() {

		htmlReporter = new ExtentHtmlReporter("extent.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);


	}

	@BeforeTest
	public void setUpTest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	@Test
	public void test1() throws IOException {

		//create a toggle for the given test, adds all log events under
		ExtentTest test1 = extent.createTest("My First Test", "This is a test to validate google search functionality");

		driver.get("https://google.com");
		test1.pass("Navigated to Google.com");

		test1.log(Status.INFO, "This Steps shows usage of log(status, Details)");
		test1.info("This Step shows usage of info(Details)");
		test1.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
		test1.addScreenCaptureFromPath("screenshot.png");

	}

	@Test
	public void test2() throws IOException {

		//create a toggle for the given test, adds all log events under
		ExtentTest test1 = extent.createTest("My First Test", "This is a test to validate google search functionality");
		test1.log(Status.INFO, "This Steps shows usage of log(status, Details)");
		test1.info("This Step shows usage of info(Details)");
		test1.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
		test1.addScreenCaptureFromPath("screenshot.png");

	}

	@AfterTest
	public void tearDownTest() {

		driver.close();
		driver.quit();
		System.out.println("Test Completed successfully");
	}


	@AfterSuite
	public void tearDown() {
		extent.flush();

	}
}
