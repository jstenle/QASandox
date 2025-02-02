package com.form.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class FormPage {
	private AndroidDriver<MobileElement> driver;

	// Localizadores
	private By nameField = By.xpath("//input[@type='text']"); // Campo de nome
	private By respondButton = By.xpath("//button[contains(text(), 'Responder')]"); // Botão "Responder"
	private By thankYouMessage = By.xpath("//*[contains(text(), 'Obrigado por participar!')]"); // Mensagem de
																								// agradecimento

	public FormPage(AndroidDriver<MobileElement> driver) {
		this.driver = driver; // Inicializa o driver
	}

	// Método para preencher o nome
	public void enterName(String name) {
		try {
			MobileElement nameInput = driver.findElement(nameField);
			nameInput.clear(); // Limpa o campo antes de inserir
			nameInput.sendKeys(name); // Envia o nome
		} catch (NoSuchElementException e) {
			System.err.println("Campo de nome não encontrado: " + e.getMessage());
		}
	}

	// Método para clicar no botão "Responder"
	public void clickRespond() {
		try {
			MobileElement respondBtn = driver.findElement(respondButton);
			respondBtn.click(); // Clica no botão "Responder"
		} catch (NoSuchElementException e) {
			System.err.println("Botão 'Responder' não encontrado: " + e.getMessage());
		}
	}

	// Método para verificar a mensagem de sucesso
	public boolean isThankYouMessageDisplayed() throws InterruptedException {
		try {
			Thread.sleep(2000);
			MobileElement message = driver.findElement(thankYouMessage);
			return message.isDisplayed(); // Verifica se a mensagem de agradecimento está visível
		} catch (NoSuchElementException e) {
			System.err.println("Mensagem de agradecimento não encontrada: " + e.getMessage());
			return false;
		}
	}
}