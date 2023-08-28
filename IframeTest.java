package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IframeTest {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
		
		//first method to find iframe name
	//	driver.switchTo().frame("iframeResult");
	 
		//2nd method with index number
//		driver.switchTo().frame(1);
			
		//2nd method by finding its element
		
		WebElement iframe = driver.findElement(By.xpath("//iFrame[@id='iframeResult']"));
		driver.switchTo().frame(iframe);
		
		driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("AZ");
		
		driver.switchTo().parentFrame();
		
		Thread.sleep(5000);
		driver.close();
	}

}
