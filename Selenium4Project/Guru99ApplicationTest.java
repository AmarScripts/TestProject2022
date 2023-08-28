package test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Guru99ApplicationTest {

	ChromeDriver driver;
	String url = "https://www.demo.guru99.com/v4/";
	
	@BeforeMethod
	public void invokeBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\Selenium Testing\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		
	}
	@Test
	public void verifyTitleOfThePage() {
		
		String expectedTitle = "guru99 Bank Home Page";
		String actualTitle = driver.getTitle();
		
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@Test(priority = 100)
	public void verifyLoginToGuru99Application() {
		
		WebElement userId = driver.findElement(By.className("uid"));
		WebElement userPassword = driver.findElement(By.className("password"));
		WebElement loginButton = driver.findElement(By.name("btnLogin"));
		
		userId.sendKeys("mngr476776");
		userPassword.sendKeys("AmuhYhY");
		loginButton.click();
		
	}
}
