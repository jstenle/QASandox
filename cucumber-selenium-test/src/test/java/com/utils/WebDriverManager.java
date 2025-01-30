package com.utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverManager {
	private WebDriver driver;
	private WebDriverWait wait;

	// Inicializa o WebDriver e define o tempo de espera padrão
	public void initializeDriver() {
		try {
			// Define a propriedade do ChromeDriver
			System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
			driver = new ChromeDriver();
			wait = new WebDriverWait(driver, Duration.ofSeconds(30)); // Configura o tempo de espera
		} catch (Exception e) {
			System.err.println("Error initializing WebDriver: " + e.getMessage());
			throw e;
		}
	}

	// Retorna a instância do WebDriver
	public WebDriver getDriver() {
		if (driver == null) {
			throw new IllegalStateException("WebDriver not initialized. Call initializeDriver() first.");
		}
		return driver;
	}

	// Muda o foco para uma nova aba
	public void changeTabFocus() {
		String originalTab = driver.getWindowHandle();
		for (String tab : driver.getWindowHandles()) {
			if (!tab.equals(originalTab)) {
				driver.switchTo().window(tab);
				break;
			}
		}
	}

	// Fecha o WebDriver
	public void quitDriver() {
		if (driver != null) {
			driver.quit();
		}
	}

	// Retorna a instância do WebDriverWait
	public WebDriverWait getWait() {
		return wait;
	}
}