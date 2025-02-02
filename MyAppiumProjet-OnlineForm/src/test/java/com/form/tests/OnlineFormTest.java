package com.form.tests;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.form.pageObjects.FormPage;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import utils.DriverManager;

public class OnlineFormTest extends DriverManager {
	private AndroidDriver<MobileElement> driver;
	private FormPage formPage;

	@Before
	public void setUp() throws Exception {
		initializeDriver();
		driver = getDriver();
		formPage = new FormPage(driver); // Inicializa a FormPage
	}

	@Test
	public void testFormSubmission() throws InterruptedException {
		// Acessa o formulário online
		driver.get("https://form.respondi.app/HlORNH69");

		// Preenche o nome
		formPage.enterName("John Doe");
		formPage.clickRespond();

		// Verifica se a mensagem de agradecimento aparece
		assertTrue("A mensagem de agradecimento não foi encontrada!", formPage.isThankYouMessageDisplayed());
	}

	@After
	public void tearDown() {
		quitDriver();
	}
}