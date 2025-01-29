package com.e2eTesting.pageObjects;

import static org.junit.Assert.assertTrue;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecurePage {
	private WebDriver driver;

	private By successMessage = By.id("flash");
	private By elementalSeleniumLink = By.linkText("Elemental Selenium");

	public SecurePage(WebDriver driver) {
		this.driver = driver;
	}

	public void assertSecureURL() {
		assertTrue("URL não contém '/secure'", driver.getCurrentUrl().contains("/secure"));
	}

	public void assertSecureMessage(String expectedMessage) {
		try {
			String actualMessage = driver.findElement(successMessage).getText();
			assertTrue("Mensagem de sucesso não está correta", actualMessage.contains(expectedMessage));
		} catch (NoSuchElementException e) {
			assertTrue("Elemento de mensagem de sucesso não encontrado.", false);
		}
	}

	public void clickElementalSeleniumLink() {
		try {
			driver.findElement(elementalSeleniumLink).click();
		} catch (NoSuchElementException e) {
			assertTrue("Link 'Elemental Selenium' não encontrado.", false);
		}
	}

}
