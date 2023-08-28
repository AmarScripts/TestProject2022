package tests;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
public class SeleniumWaits {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("automation step by step" + Keys.ENTER);

		//Example of Explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement myLink = wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Automation Step by Step: NEVER STOP LEARNING")));
		myLink.click();

		//Fluent Wait
		Wait <WebDriver> fluentwait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(1)).ignoring(NoSuchElementException.class);

		//	WebElement myLink1 = fluentwait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Automation Step by Step: NEVER STOP LEARNING")));
		//	myLink1.click();

		//Thread.sleep(2000);
		driver.close();
		driver.quit();
	}

}
