package utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelDataProvider {

	/*
	public static void main(String[] args) {
		String excelPath = "C:\\Users\\B0222278\\eclipse-workspace\\SeleniumProject\\excel\\data.xlsx";
		testData(excelPath, "Sheet1");
	}
	*/
	WebDriver driver = null;
	
	@BeforeTest
	public void setUpTest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	}
	
	@Test(dataProvider="testData")
	public void test1(String username, String password) throws InterruptedException {
		System.out.println(username+ " | "+ password);
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		
		Thread.sleep(3000);
	}
	
	@AfterTest
	public void tearDownTest() {
		
		driver.close();    
		driver.quit();
		System.out.println("Test completed sucessfully");
	}

	
	@DataProvider(name = "testData")
	public Object[][] getData() {
		
		String excelPath = "C:\\Users\\B0222278\\eclipse-workspace\\SeleniumProject\\excel\\data.xlsx";
		
		Object data[][] = testData(excelPath, "Sheet1");
		return data;
		
	}

	public static Object[][] testData(String excelPath, String sheetName) {
		
		ExcelUtils excel = new ExcelUtils(excelPath, sheetName);
		
		int rowCount = excel.getRowCount();
		int colCount = excel.getColCount();
		
		Object data[][] = new Object[rowCount-1][colCount];
		
		for(int i=1; i<rowCount; i++) {
			
			for(int j=0; j<colCount; j++) {
				
				String cellData = excel.getCellDataString(i, j);
				//System.out.print(cellData+ " | ");
				//int cellData1 = excel.getCellDataNumber(i, j);
				
				data[i-1][j] = cellData;
			}
			System.out.println();
		}
		
		return data;
	}
}
