package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Waits {

	public static void main(String[] args) throws InterruptedException {
		
				WebDriverManager.chromedriver().setup();
				WebDriver driver = new ChromeDriver();
				
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				//Open a Webpage
				driver.get("https://google.com");
				driver.findElement(By.name("q")).sendKeys("Automation Step by Step"+ Keys.ENTER);
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				
				Thread.sleep(5000);
				
				//driver.close();
				//driver.quit();
	
	}
}

