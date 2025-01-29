package com.e2eTesting.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverManager {
	private WebDriver driver;

	public void initializeDriver() {
		try {
			System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
			driver = new ChromeDriver();
		} catch (Exception e) {
			System.err.println("Error initializing WebDriver: " + e.getMessage());
			throw e;
		}
	}

	public WebDriver getDriver() {
		if (driver == null) {
			throw new IllegalStateException("WebDriver not initialized. Call initializeDriver() first.");
		}
		return driver;
	}

	public void changeTabFocus() {
		// Armazenar a aba original
		String originalTab = driver.getWindowHandle();

		// Mudar para a nova aba
		for (String tab : driver.getWindowHandles()) {
			if (!tab.equals(originalTab)) {
				driver.switchTo().window(tab);
				break;
			}
		}
	}

	public void quitDriver() {
		if (driver != null) {
			driver.quit();
		}
	}
}