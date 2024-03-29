package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseActions {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
		/*
		driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");  
		
		WebElement boxA = driver.findElement(By.xpath("//li[@name='A']"));
		WebElement boxD = driver.findElement(By.xpath("//li[@name='D']"));
		
		Actions actions = new Actions(driver);
		actions.moveToElement(boxA);
		actions.clickAndHold();
		actions.moveToElement(boxD);
		
		actions.contextClick(boxD);
		WebElement text = findElement(By.xpath("//h3[contains(.,'Click and Hold in Selenium')]"));
		actions.doubleClick(text);
	*/
		
		//Drag and Drop Example
		driver.get("https://selenium08.blogspot.com/2020/01/drag-drop.html");
		
		WebElement src = driver.findElement(By.id("draggable"));
		WebElement dest = driver.findElement(By.id("droppable"));
		
		Actions actions = new Actions(driver);
	
		actions.dragAndDrop(src, dest);
		
		//actions.release().perform();
		actions.build().perform();
		Thread.sleep(3000);
		driver.quit();
		System.out.println("Done");
	}

}
