package test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class STBAutomation {
    public static void main(String[] args) {
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Navigate to the STB control panel
        driver.get("http://192.168.225.7/");

        // Find the input element for entering the STB key
        WebElement inputElement = driver.findElement(By.cssSelector("input#key"));

        // Enter the STB key into the input element
        inputElement.sendKeys("1234");

        // Find the submit button
        WebElement submitButton = driver.findElement(By.cssSelector("button#submit"));

        // Click the submit button
        submitButton.click();

        // Wait for the page to load
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Find the channel change button
        WebElement channelChangeButton = driver.findElement(By.cssSelector("button#change-channel"));

        // Click the channel change button
        channelChangeButton.click();

        // Wait for the channel to change
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Close the browser window
        driver.quit();
    }
}
