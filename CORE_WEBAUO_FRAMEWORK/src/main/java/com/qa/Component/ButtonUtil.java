package com.qa.Component;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ButtonUtil {
	
	WebDriver driver;
	ElementUtil elementUtil;

	public ButtonUtil(WebDriver driver) {
		this.driver = driver;
		elementUtil = new ElementUtil(driver);
	}
	
	public void doClick(By locator) {
		elementUtil.getElement(locator).click();
	}
	
	public void doActionsClick(By locator){
		WebElement element = elementUtil.getElement(locator);
		Actions action = new Actions(driver);
		action.click(element).perform();
	}
	
	public boolean doIsDisplayed(By locator) {
		return elementUtil.getElement(locator).isDisplayed();
	}

}
