package com.ecommerceTesting.pageObjects;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class ThankYouPage {
    private WebDriver driver;
    private WebDriverWait wait;

    private By confirmationMessage = By.className("complete-header"); // Localizador para a mensagem de confirmação

    public ThankYouPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30)); // Inicializa o WebDriverWait
    }

    public void assertConfirmationMessage(String expectedMessage) {
        // Espera até que a mensagem de confirmação esteja presente
        wait.until(ExpectedConditions.presenceOfElementLocated(confirmationMessage));

        // Verifica se a mensagem de confirmação está correta
        String actualMessage = driver.findElement(confirmationMessage).getText();
        assertTrue("A mensagem de confirmação não está correta.", actualMessage.contains(expectedMessage));
    }
}