package tests;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		/*
		//Find Element
		driver.get("https://google.com");
		WebElement searchBox = driver.findElement(By.name("q"));
		
		searchBox.sendKeys("Selenium");
		driver.findElement(By.name("btnK")).click();
		*/
		
		/*
		//Find Elements
		driver.get("https://trytestingthis.netlify.app/");
		List<WebElement> elements = driver.findElements(By.tagName("select"));
		
		for(WebElement element : elements) {	
			System.out.println(element.getText());
		}
		*/
		
		//Find Element within element
		driver.get("https://google.com");
		WebElement form = driver.findElement(By.tagName("form"));
		form.findElement(By.name("q")).sendKeys("ABCD"+Keys.ENTER);
		
		
		Thread.sleep(3000);
		driver.quit();
	}

}
