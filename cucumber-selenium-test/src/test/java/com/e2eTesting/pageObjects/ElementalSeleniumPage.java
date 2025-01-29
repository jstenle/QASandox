package com.e2eTesting.pageObjects;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

public class ElementalSeleniumPage {
	private WebDriver driver;

	public ElementalSeleniumPage(WebDriver driver) {
		this.driver = driver;
	}

	public void assertElementalSeleniumTitle() {
		try {
			String title = driver.getTitle();
			assertTrue("Título da página não contém 'Elemental Selenium'", title.contains("Elemental Selenium"));
		} catch (Exception e) {
			assertTrue("Não foi possível obter o título da página.", false);
		}
	}

}
