package test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshots {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriverManager.chromedriver().driverVersion("108.0.5359.71").setup();
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
	//Open a Webpage
		driver.get("https://www.google.com");
	
		//driver.navigate().to("https://automationstepbystep.com/");
		
	//Take Screenshot
		
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File("./image1.png"));
		
	//Take Element Screenshot
		WebElement element = driver.findElement(By.cssSelector(".lnXdpd"));
		File srcFile1 = element.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile1, new File("./image2.png"));
		
		
		Thread.sleep(4000);
		driver.close();
		driver.quit();
		
	}

}
