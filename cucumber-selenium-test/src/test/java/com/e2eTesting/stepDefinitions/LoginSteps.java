package com.e2eTesting.stepDefinitions;

import org.openqa.selenium.WebDriver;

import com.e2eTesting.pageObjects.ElementalSeleniumPage;
import com.e2eTesting.pageObjects.LoginPage;
import com.e2eTesting.pageObjects.SecurePage;
import com.utils.WebDriverManager;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends WebDriverManager {
	LoginPage loginPage;
	SecurePage securePage;
	ElementalSeleniumPage elementalSeleniumPage;

	@Given("I am on the login page")
	public void i_am_on_the_login_page() {
		initializeDriver();
		WebDriver driver = getDriver();
		driver.get("http://the-internet.herokuapp.com/login");
		loginPage = new LoginPage(driver);
	}

	@When("I enter valid credentials")
	public void i_enter_valid_credentials() {
		loginPage.enterUsername("tomsmith");
		loginPage.enterPassword("SuperSecretPassword!");
		loginPage.clickLogin();
	}

	@Then("I should be redirected to the secure area")
	public void i_should_be_redirected_to_the_secure_area() {
		securePage = new SecurePage(getDriver());
		securePage.assertSecureURL();
	}

	@And("I should see the message {string}")
	public void i_should_see_the_message(String string) {
		securePage.assertSecureMessage(string);
	}

	@When("I click on Elemental Selenium link")
	public void i_click_on_elemental_selenium_link() {
		securePage.clickElementalSeleniumLink();
	}

	@Then("I should be redirected to the Elemental Selenium page")
	public void i_should_be_redirected_to_the_elemental_selenium_page() {
		changeTabFocus();
		elementalSeleniumPage = new ElementalSeleniumPage(getDriver());
		elementalSeleniumPage.assertElementalSeleniumTitle();
		quitDriver();
	}

}