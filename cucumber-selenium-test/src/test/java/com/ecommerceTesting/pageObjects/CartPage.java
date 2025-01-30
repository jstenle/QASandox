package com.ecommerceTesting.pageObjects;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage {
	private WebDriver driver;

	private By checkoutButton = By.id("checkout");

	public CartPage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickCheckoutButton() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.elementToBeClickable(checkoutButton));
			driver.findElement(checkoutButton).click();
		} catch (NoSuchElementException e) {
			throw new RuntimeException("Checkout button not found!", e);
		}
	}

}
