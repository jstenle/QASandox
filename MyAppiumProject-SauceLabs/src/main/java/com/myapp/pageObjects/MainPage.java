package com.myapp.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class MainPage {
    private AndroidDriver<MobileElement> driver;

    // Localizadores
    private By backpackProduct = By.xpath("//android.widget.TextView[@text='Sauce Labs Backpack']");

    public MainPage(AndroidDriver<MobileElement> driver) {
        this.driver = driver; // Inicializa o driver
    }

    // Método para clicar no produto "Sauce Labs Backpack"
    public ProductPage clickOnBackpackProduct() {
        try {
            MobileElement backpackElement = driver.findElement(backpackProduct);
            backpackElement.click(); // Clica no produto
            return new ProductPage(driver); // Retorna uma nova instância da ProductPage
        } catch (NoSuchElementException e) {
            System.err.println("Elemento do produto 'Sauce Labs Backpack' não encontrado: " + e.getMessage());
            return null; 
        }
    }
}