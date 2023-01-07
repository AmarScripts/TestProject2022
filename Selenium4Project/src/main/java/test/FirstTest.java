package test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTest {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\B0222278\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		WebDriverManager.chromedriver().driverVersion("108.0.5359.71").setup();
		WebDriver driver = new ChromeDriver();
		//WebDriverManager.firefoxdriver().setup();
		//WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		
		
		driver.close();

	}

}
