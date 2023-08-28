package appiumtests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class TvAppLaunch {

//	WebDriver driver;
		static AndroidDriver driver;
	//static AppiumDriver<MobileElement> driver;
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			try {
				openCalculator();
			} catch (Exception e) {
				System.out.println(e.getCause());
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
	}

	public static void openCalculator() throws Exception {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("DeviceName", "AndroidTV");
		cap.setCapability("udid", "192.168.1.2:5555");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "10");
		
		//Set the App package and app activity details
		cap.setCapability("appPackage", "com.airtel.com");
		cap.setCapability("appActivity", "START u0 {act=android.intent.action.MAIN cat=[android.intent.category.HOME] flg=0x10000100 cmp=com.airtel.tv/.MainActivity (has extras)} from uid 0");
		
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		
//		URL url = new URL("http://127.0.0.1:4723/wd/hub");
//		driver = new AppiumDriver<Mobile>(cap);
		
		System.out.println("Application Started.....");
	}
}
