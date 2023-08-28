package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesTest {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(3));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
				
		driver.navigate().to("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		
		/*
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.linkText("Action")).click();
		
		//WebElement iframe = driver.findElement(By.cssSelector(".leftContainer>iframe"));
		//driver.switchTo().frame(iframe);
		
		//driver.switchTo().frame(index);
		
		driver.switchTo().defaultContent();
		*/
		
		//Getting Window Size
		int width = driver.manage().window().getSize().getWidth();
		int height = driver.manage().window().getSize().getHeight();
		
		Dimension size = driver.manage().window().getSize();
		
		System.out.println(size.getWidth());
		System.out.println(size.getHeight());
		
		//System.out.println("Width of the Window= "+width);
		//System.out.println("Height of the Window= "+height);
		
		//Setting ne Window Size
		driver.manage().window().setSize(new Dimension(800, 600));
		
		//Getting Window x,y Coordinates/Position
		int x = driver.manage().window().getPosition().getX();
		int y = driver.manage().window().getPosition().getY();
		
		Point position = driver.manage().window().getPosition();
		
		int x1 = position.getX();
		int y1 = position.getY();
		
		System.out.println(x1);
		System.out.println(y1);
		
		//Setting new window position
		driver.manage().window().setPosition(new Point(500,200));
		
		Thread.sleep(5000);
		driver.close();    
		driver.quit();
		
	}

}
