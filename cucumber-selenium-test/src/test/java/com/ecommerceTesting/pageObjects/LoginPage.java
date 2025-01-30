package com.ecommerceTesting.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
	private WebDriver driver;
	private WebDriverWait wait;

	private By usernameField = By.id("user-name"); // ID do campo de usuário
	private By passwordField = By.id("password"); // ID do campo de senha
	private By loginButton = By.id("login-button"); // ID do botão de login

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(30)); // Inicializa o WebDriverWait
	}

	public void enterUsername(String username) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(usernameField)); // Aguarda o campo de usuário ser visível
		driver.findElement(usernameField).sendKeys(username); // Insere o nome de usuário
	}

	public void enterPassword(String password) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(passwordField)); // Aguarda o campo de senha ser visível
		driver.findElement(passwordField).sendKeys(password); // Insere a senha
	}

	public void clickLogin() {
		wait.until(ExpectedConditions.elementToBeClickable(loginButton)); // Aguarda o botão de login ser clicável
		driver.findElement(loginButton).click(); // Clica no botão de login
	}
}