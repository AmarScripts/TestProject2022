package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class LoginDemoSteps {

	WebDriver driver = null;
	
	@SuppressWarnings("deprecation")
	@Given("browser is open")
	public void browser_is_open() {
		System.out.println("Inside Step- browser is open");

		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path is :"+projectPath);

		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/drivers/chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		//driver.manage().window().maximize();
	}

	@And("user in on login page")
	public void user_in_on_login_page() {
		
		driver.navigate().to("https://example.testproject.io/web/");
	}

	@When("user enters the username and password")
	public void user_enters_the_username_and_password() throws InterruptedException {
		
		driver.findElement(By.id("name")).sendKeys("Amar");
		driver.findElement(By.id("password")).sendKeys("12345");
		
		Thread.sleep(2000);
	}

	@And("user click on login")
	public void user_click_on_login() {
		
		driver.findElement(By.id("login")).click();
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() throws InterruptedException {
		
		driver.findElement(By.id("logout")).isDisplayed();
		System.out.println("User is successfully logged In");
		
		Thread.sleep(2000);
		driver.close();
		driver.quit();
	}




}
