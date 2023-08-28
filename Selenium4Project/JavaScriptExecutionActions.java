package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutionActions {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().driverVersion("108.0.5359.71").setup();
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
	//Open a Webpage
		driver.get("https://www.google.com");
	
		
	//Creating the Javascript Executor interface object by type casting
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
	//Javascript to click an element
		WebElement button = driver.findElement(By.name("btnI"));
		js.executeScript("arguments[0].click()", button);
		
		//String text = (String)js.executeScript("return arguments[0].innerText", button);
		//System.out.println(text);
		
	//Execute JS directly
		js.executeScript("console.log('hello world...')");
		
		Thread.sleep(4000);
		//driver.close();
		//driver.quit();

	}

}
