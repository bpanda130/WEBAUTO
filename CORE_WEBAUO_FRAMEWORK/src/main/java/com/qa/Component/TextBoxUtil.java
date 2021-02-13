package com.qa.Component;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TextBoxUtil {
	
	WebDriver driver;
	ElementUtil elementUtil;

	public TextBoxUtil(WebDriver driver) {
		this.driver = driver;
		elementUtil = new ElementUtil(driver);
	}
	
	public void doSendKeys(By locator, String value) {
		elementUtil.getElement(locator).sendKeys(value);
	}

	public void doClick(By locator) {
		elementUtil.getElement(locator).click();
	}
	
	public String doGetText(By locator) {
		return elementUtil.getElement(locator).getText();
	}
	
	public boolean doIsDisplayed(By locator) {
		return elementUtil.getElement(locator).isDisplayed();
	}

}
