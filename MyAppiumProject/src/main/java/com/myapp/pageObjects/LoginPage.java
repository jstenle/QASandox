package com.myapp.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class LoginPage {
    private AndroidDriver<MobileElement> driver;

    // Localizadores de elementos
    private By usernameField = By.xpath("//android.widget.EditText[@content-desc='test-Username']");
    private By passwordField = By.xpath("//android.widget.EditText[@content-desc='test-Password']");
    private By loginButton = By.xpath("//android.widget.TextView[@text='LOGIN']");

    public LoginPage(AndroidDriver<MobileElement> driver) {
        this.driver = driver; // Inicializa o driver
    }

    public void enterUsername(String username) {
        enterText(usernameField, username);
    }

    public void enterPassword(String password) {
        enterText(passwordField, password);
    }

    public void clickLogin() {
        clickElement(loginButton);
    }

    private void enterText(By locator, String text) {
        try {
            MobileElement element = driver.findElement(locator);
            element.clear(); // Limpa o campo antes de inserir, se necessário
            element.sendKeys(text); // Envia o texto
        } catch (NoSuchElementException e) {
            System.err.println("Elemento não encontrado: " + locator);
        }
    }

    private void clickElement(By locator) {
        try {
            driver.findElement(locator).click(); // Clica no elemento
        } catch (NoSuchElementException e) {
            System.err.println("Elemento não encontrado: " + locator);
        }
    }
}