package appiumtest;

import java.net.MalformedURLException;
import java.net.URL;
//import org.junit.jupiter.api.Test;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AutomationName;

class AndroidTest {

	
		@Test
		void androidLaunchTest() throws InterruptedException, MalformedURLException {
			
			UiAutomator2Options options = new UiAutomator2Options();
			options.setPlatformName("Android"); //optional
			options.setAutomationName(AutomationName.ANDROID_UIAUTOMATOR2);  //optional
			options.setDeviceName("amar-test-device");
			options.setApp(System.getProperty("C:\\Users\\B0222278\\Downloads\\Android-MyDemoAppRN.1.0.0.build-130.apk"));
			
			
			
			AndroidDriver driver = new AndroidDriver(new URL( "http://127.0.0.1:4723/"), options);
			
			Thread.sleep(4000);
		}


	

}
