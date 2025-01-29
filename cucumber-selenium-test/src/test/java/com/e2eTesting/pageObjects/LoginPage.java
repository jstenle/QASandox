package com.e2eTesting.pageObjects;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	private WebDriver driver;

	private By usernameField = By.id("username");
	private By passwordField = By.id("password");
	private By loginButton = By.cssSelector("button.radius");

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void enterUsername(String username) {
		driver.findElement(usernameField).sendKeys(username);
	}

	public void enterPassword(String password) {
		driver.findElement(passwordField).sendKeys(password);
	}

	public void clickLogin() {
		isLoginButtonDisplayed();
		driver.findElement(loginButton).click();
	}

	public boolean isLoginButtonDisplayed() {
		try {
			return driver.findElement(loginButton).isDisplayed();
		} catch (NoSuchElementException e) {
			return false;
		}
	}
}