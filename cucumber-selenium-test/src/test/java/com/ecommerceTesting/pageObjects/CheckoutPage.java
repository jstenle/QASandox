package com.ecommerceTesting.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class CheckoutPage {
	private WebDriver driver;
	private WebDriverWait wait;

	private By firstNameField = By.id("first-name");
	private By lastNameField = By.id("last-name");
	private By postalCodeField = By.id("postal-code");
	private By continueButton = By.id("continue");
	private By finishButton = By.id("finish");

	public CheckoutPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(30)); // Inicializa o WebDriverWait
	}

	public void fillPaymentInfo(String firstName, String lastName, String postalCode) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(firstNameField)); // Espera o campo ser visível
		driver.findElement(firstNameField).sendKeys(firstName); // Preenche o primeiro nome
		driver.findElement(lastNameField).sendKeys(lastName); // Preenche o sobrenome
		driver.findElement(postalCodeField).sendKeys(postalCode); // Preenche o código postal
		driver.findElement(continueButton).click(); // Clica para continuar
	}

	public void finishCheckout() {
		wait.until(ExpectedConditions.elementToBeClickable(finishButton)); // Espera o botão de finalizar ser clicável
		driver.findElement(finishButton).click(); // Clica para finalizar a compra
	}
}