package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkingWithChrome {
	
	ChromeDriver driver;
	
	//WebDriverManager.chromedriver().setup();
	//System.setProperty("webdriver.driver.chrome", "C:\\Users\\Administrator\\Desktop\\Selenium Testing\\chromedriver.exe");
	//WebDriver driver = new ChromeDriver();
	
	String url = "https://www.guru99.com/";
	
	public void invokeBrowser() {
		
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.driver.chrome","C:\\Users\\B0222278\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		//WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get(url);
	}

	public void getTitle() {
		
		String titleOfThePage = driver.getTitle();
		System.out.println("Title of the Page - "+ titleOfThePage);
	}
	
	public void closeBrowser() {
		//driver.close();
		driver.quit();
	}
	public static void main(String[] args) {
		
		WorkingWithChrome wc = new WorkingWithChrome();
		wc.invokeBrowser();
		wc.getTitle();
		wc.closeBrowser();
	}
}
