package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DMP_Automation {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().driverVersion("108.0.5359.71").setup();
		WebDriver driver = new ChromeDriver();
		
		
		//Open a Webpage
		driver.get("https://rms.airtelxstreamotastaging.com/dmpapp/#/devices/search");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(5));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		driver.findElement(By.id("email")).sendKeys("rmsadmin@airtel.com");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("iCX@3007!");
		Thread.sleep(2000);
		driver.findElement(By.id("sign-in")).click();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.findElement(By.id("deviceId")).sendKeys("46678096499");
		Thread.sleep(2000);
		driver.findElement(By.id("searchBtn")).click();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//p[contains(text(),'Reboot the device')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Ok')]")).click();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		String getStatus = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"toast-container\"]/div/div[1]"))).getText();
		
		//System.out.println(getStatus);
		
		if (getStatus=="Reboot triggered successfully") {
			
			System.out.println("Test case passed");
			
		}
		//System.out.println(getStatus);
	
		
		/*
		String toast_text = driver.findElement(By.id("toast-container")).getText();
		//assert toast_text =="Reboot Triggered successfully";

		Thread.sleep(5000);
		
		//System.out.println("Test case passed");
		//System.out.println(toast_text);			
		
		//if(driver.findElement(By.id("toast-container")).getText().contains("Reboot Triggered successfully"))
		if(toast_text.contains("Reboot Triggered successfully"))
		{
			System.out.println("Device Rebooted Successfully");
		}
		
		*/
		Thread.sleep(4000);
		driver.close();
		//driver.quit();

	}

}
