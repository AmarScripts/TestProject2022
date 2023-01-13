package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserActions {

	public static void main(String[] args) throws InterruptedException {
				//WebDriverManager.chromedriver().setup();
				WebDriverManager.chromedriver().driverVersion("108.0.5359.71").setup();
				WebDriver driver = new ChromeDriver();
				
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
				
				//Open a Webpage
				driver.get("https://www.google.com");
				String originalWindow = driver.getWindowHandle();
				
				driver.navigate().to("https://automationstepbystep.com/");
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
				
				
				//Get Current URL
				System.out.println(driver.getCurrentUrl());
			
				//Get the Title
				System.out.println(driver.getTitle());
				
				driver.navigate().back();
				Thread.sleep(1000);
				driver.navigate().forward();
				Thread.sleep(1000);
				driver.navigate().refresh();
				Thread.sleep(1000);
				
			
				
				//Switching Windows
				driver.switchTo().window(originalWindow);
				
				
				//Open a New Window and Switch to window
				driver.switchTo().newWindow(WindowType.WINDOW);
				driver.switchTo().newWindow(WindowType.TAB);
				driver.switchTo().window(originalWindow);
				
			
				
			driver.navigate().to("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
				
				
				//Switch to frame
			driver.switchTo().frame("packageFrame");
				//switch to frame using frame index
			driver.switchTo().frame("leftBottom");
				
				driver.findElement(By.linkText("Actions")).click();
				
				
				driver.switchTo().defaultContent();
			
//				Thread.sleep(4000);
//				driver.close();
//				driver.quit();
	}

}
