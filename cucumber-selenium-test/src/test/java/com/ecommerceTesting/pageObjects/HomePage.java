package com.ecommerceTesting.pageObjects;

import static org.junit.Assert.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class HomePage {
	private WebDriver driver;
	private WebDriverWait wait;

	private By productLink = By.id("add-to-cart-sauce-labs-backpack");
	private By shoppingCartLink = By.className("shopping_cart_link");

	public HomePage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(30)); // Espera até 30 segundos
	}

	public void addProductToCart() {
		wait.until(ExpectedConditions.elementToBeClickable(productLink)); // Espera até que o botão "Add to Cart" esteja clicável
		driver.findElement(productLink).click(); // Clica no botão "Add to Cart"
	}

	public void clickOnShoppingCartLink() {
		wait.until(ExpectedConditions.elementToBeClickable(shoppingCartLink)); // Espera até que o link do carrinho esteja clicável
		driver.findElement(shoppingCartLink).click(); // Clica no carrinho de compras
	}

	public void assertHomePage() {
		wait.until(ExpectedConditions.urlToBe("https://www.saucedemo.com/inventory.html")); // Verifica se a URL está correta
		assertTrue(driver.getTitle().contains("Swag Labs")); // Verifica se o título está correto
	}
}