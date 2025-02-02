package com.myapp.tests;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.myapp.pageObjects.LoginPage;
import com.myapp.pageObjects.MainPage;
import com.myapp.pageObjects.ProductPage;
import com.myapp.utils.DriverManager;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class LoginTest extends DriverManager {
	private AndroidDriver<MobileElement> driver;
	private LoginPage loginPage;
	private MainPage mainPage;

	@Before
	public void setUp() throws Exception {
		initializeDriver();
		driver = getDriver();
		loginPage = new LoginPage(driver);
		mainPage = new MainPage(driver);
		new ProductPage(driver);

	}

	@Test
	public void validateLoginAndProductNavigation() throws InterruptedException {
		// Executa o login
		loginPage.enterUsername("standard_user");
		loginPage.enterPassword("secret_sauce");
		loginPage.clickLogin();

		// Vamos verificar se estamos na tela inicial:
		String pageSource = driver.getPageSource();
		assertTrue("O texto de ajuda não foi encontrado!",
				pageSource.contains("The currently accepted usernames for this application are"));

		// Clica no produto "Sauce Labs Backpack"
		mainPage.clickOnBackpackProduct();

		// Clica no produto "Sauce Labs Backpack" e obtém a instância da ProductPage
		ProductPage productPage = mainPage.clickOnBackpackProduct();

		// Verifica se está na página do "Sauce Labs Backpack"
		assertTrue("Não estamos na página do produto 'Sauce Labs Backpack'", productPage.isOnBackpackPage());

	}

	@After
	public void tearDown() {
		quitDriver(); // Fecha o driver após o teste
	}
}