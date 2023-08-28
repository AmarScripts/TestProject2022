package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardActions {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		/*
		//sendKeys()
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("Selenium"+ Keys.ENTER);
		*/
		
		/*
		//KeyDown
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("Selenium"+ Keys.ENTER);
		Actions actionProvider = new Actions(driver);
		Action keydown = actionProvider.keyDown(Keys.CONTROL).sendKeys("a").build();
		keydown.perform();
		*/
		
		//KeyUp
		driver.get("https://google.com");
		Actions actions = new Actions(driver);
		WebElement searchbox = driver.findElement(By.name("q"));
		
		actions.keyDown(Keys.SHIFT).sendKeys(searchbox, "Selenium")
		.keyUp(Keys.SHIFT).sendKeys(searchbox, " Selenium").perform();
		
		Thread.sleep(2000);
		searchbox.clear();
		
		Thread.sleep(3000);
		//driver.quit();
		driver.close();
	}
}
