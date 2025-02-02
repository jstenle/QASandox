package com.myapp.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class ProductPage {
    private AndroidDriver<MobileElement> driver;

    // Localizador para o título do produto
    private By backpackTitle = By.xpath("//android.widget.TextView[@text='Sauce Labs Backpack']");

    public ProductPage(AndroidDriver<MobileElement> driver) {
        this.driver = driver; // Inicializa o driver
    }

    // Método para verificar se estamos na página do produto "Sauce Labs Backpack"
    public boolean isOnBackpackPage() throws InterruptedException {
        try {
        	Thread.sleep(2000);
            return driver.findElement(backpackTitle).isDisplayed(); // Verifica se o título do produto está visível
        } catch (NoSuchElementException e) {
            System.err.println("Elemento do título do produto não encontrado: " + e.getMessage());
            return false;
        }
    }
}