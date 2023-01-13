package test;

import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowManagerment {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().driverVersion("108.0.5359.71").setup();
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		//Open a Webpage
		driver.get("https://www.google.com");
	
		//driver.navigate().to("https://automationstepbystep.com/");
		
	//Window Management Size
		//int width = driver.manage().window().getSize().getWidth();
		//int height = driver.manage().window().getSize().getHeight();
		
		Dimension size = driver.manage().window().getSize();
		
		System.out.println(size.getWidth());
		System.out.println(size.getHeight());
		
		driver.manage().window().setSize(new Dimension(800, 600));
		
	//Window Management Position
		driver.manage().window().getPosition().getX();
		driver.manage().window().getPosition().getY();
		
		Point position = driver.manage().window().getPosition();
		
		System.out.println(position.getX());
		System.out.println(position.getY());
		
	//Set to New Position
		driver.manage().window().setPosition(new Point(500, 200));
		
	//Window Management
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.manage().window().minimize();
		Thread.sleep(5000);
		driver.manage().window().fullscreen();
		
		
		Thread.sleep(4000);
		//driver.close();
		//driver.quit();
		
	}

}
