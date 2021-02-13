package com.qa.Component;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LinkUtil {
	
	WebDriver driver;
	ElementUtil elementUtil;

	public LinkUtil(WebDriver driver) {
		this.driver = driver;
		elementUtil = new ElementUtil(driver);
	}
	
	public boolean doIsDisplayed(By locator) {
		return elementUtil.getElement(locator).isDisplayed();
	}

}
