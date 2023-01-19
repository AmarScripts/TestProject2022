package test;

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
		/*
		//Find Elements Demo
		driver.get("https://google.com");
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("Selenium"+Keys.ENTER);
		//Thread.sleep(2000);
		
		//driver.findElement(By.name("btnK")).click();
		
		*/
		/*
		driver.get("https://trytestingthis.netlify.app/");
		List<WebElement> elements = driver.findElements(By.tagName("Select"));
		
		for(WebElement element : elements){
			System.out.println("Paragraph Text:"+ element.getText());
		}
		*/
		
		/*
		//Find Element with Element
		driver.get("https://www.google.com/");
		WebElement form = driver.findElement(By.tagName("form"));
		form.findElement(By.name("q")).sendKeys("ABCD" + Keys.ENTER);
		*/
		
		/*
		//Find an active element
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Selenium Tutorials");
		String title = driver.switchTo().activeElement().getAttribute("title");
		System.out.println(title);
		*/
		
		/*
		//Get tagname, text, css etc.
		driver.get("https://www.google.com/");
		WebElement searchBox = driver.findElement(By.name("q"));
		String tagName = searchBox.getTagName();
		String text = searchBox.getText();
		String CssValue = searchBox.getCssValue("color");
		
		System.out.println(tagName+ " | "+ text + " | " + CssValue);
		*/
		
		//Check Element Enabled, is Selected
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		WebElement checkbox = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
		System.out.println(checkbox.isEnabled());
		System.out.println(checkbox.isSelected());
		
		Thread.sleep(2000);
		driver.quit();

	}

}
