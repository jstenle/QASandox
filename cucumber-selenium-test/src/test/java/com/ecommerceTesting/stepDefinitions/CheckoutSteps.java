package com.ecommerceTesting.stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ecommerceTesting.pageObjects.CartPage;
import com.ecommerceTesting.pageObjects.CheckoutPage;
import com.ecommerceTesting.pageObjects.HomePage;
import com.ecommerceTesting.pageObjects.LoginPage;
import com.ecommerceTesting.pageObjects.ThankYouPage;
import com.utils.WebDriverManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckoutSteps extends WebDriverManager {

	private WebDriver driver;
	private LoginPage loginPage;
	private HomePage homePage;
	private CartPage cartPage;
	private CheckoutPage checkoutPage;
	private ThankYouPage thankYouPage;
	private WebDriverWait wait;

	@Given("I am on the login page of saucedemo")
	public void i_am_on_the_login_page_of_saucedemo() {
		initializeDriver();
		driver = getDriver();
		driver.get("https://www.saucedemo.com/");
		loginPage = new LoginPage(driver);
	}

	@When("I enter valid credentials in saucedemo")
	public void i_enter_valid_credentials_in_saucedemo() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user-name"))); // Espera até que o campo de nome de usuário esteja visível
		loginPage.enterUsername("standard_user");
		loginPage.enterPassword("secret_sauce");
		loginPage.clickLogin();
	}

	@Given("I am on the saucedemo home page")
	public void i_am_on_the_saucedemo_home_page() {
		homePage = new HomePage(driver);
		homePage.assertHomePage(); // Verifica se a URL é a correta
	}

	@When("I add a product to the cart")
	public void i_add_a_product_to_the_cart() {
		homePage.addProductToCart(); // Adiciona o produto ao carrinho
	}

	@When("I proceed to checkout")
	public void i_proceed_to_checkout() {
		wait.until(ExpectedConditions.elementToBeClickable(By.className("shopping_cart_link"))); // Espera até que o link do carrinho esteja clicável
		homePage.clickOnShoppingCartLink(); // Clica no carrinho
		cartPage = new CartPage(driver);
		cartPage.clickCheckoutButton(); // Clica para ir para a página de checkout
	}

	@When("I fill in the payment information")
	public void i_fill_in_the_payment_information() {
		checkoutPage = new CheckoutPage(driver);
		checkoutPage.fillPaymentInfo("John", "Doe", "12345"); // Preencha os dados de pagamento
		checkoutPage.finishCheckout(); // Clica no botão Finish
	}

	@Then("I should see a confirmation message")
	public void i_should_see_a_confirmation_message() {
		thankYouPage = new ThankYouPage(driver); // Inicializa a página de agradecimento
		thankYouPage.assertConfirmationMessage("Thank you for your order!"); // Verifica a mensagem de confirmação
		quitDriver(); // Fecha o navegador após o teste
	}
}