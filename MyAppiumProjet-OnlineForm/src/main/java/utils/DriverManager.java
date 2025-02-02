package utils;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;

public class DriverManager {
	private AndroidDriver<MobileElement> driver;

	public void initializeDriver() throws MalformedURLException {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "15.0");
		caps.setCapability("deviceName", "emulator-5554");
		caps.setCapability("browserName", "Chrome");
		caps.setCapability("automationName", "UiAutomator2");
		caps.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, true);

		driver = new AndroidDriver<MobileElement>(new URL("http://localhost:4723"), caps);
	}

	public AndroidDriver<MobileElement> getDriver() {
		return driver;
	}

	public void quitDriver() {
		if (driver != null) {
			driver.quit();
		}
	}
}