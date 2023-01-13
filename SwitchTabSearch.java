package test;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchTabSearch {


	public static void main(String[] args) {
		//WebDriverManager.chromedriver().setup();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
		
		//Open a Webpage
		driver.get("https://www.google.com");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		driver.findElement(By.name("q")).sendKeys("cartoon");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		//String originalWindow = driver.getWindowHandle();


		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.google.com");
		
		driver.findElement(By.name("q")).sendKeys("Automation is Love");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
		//Switching Windows
		//driver.switchTo().window(originalWindow);
		
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs2.get(1));
	    
	    driver.switchTo().window(tabs2.get(0));
		
		//Open a New Window and Switch to window
//		driver.switchTo().newWindow(WindowType.WINDOW);
//		driver.switchTo().newWindow(WindowType.TAB);
//		driver.switchTo().window(originalWindow);
		
		
	//	driver.navigate().to("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		
		driver.quit();

	}

}
