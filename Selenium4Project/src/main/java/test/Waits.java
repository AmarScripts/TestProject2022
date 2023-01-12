package test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Waits {

	public static void main(String[] args) throws InterruptedException {
		
				WebDriverManager.chromedriver().setup();
				WebDriver driver = new ChromeDriver();
				
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				//Open a Webpage
				driver.get("https://google.com");
				
			
				Thread.sleep(4000);
				driver.close();
				driver.quit();
	
	}

}
