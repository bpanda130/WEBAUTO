package com.qa.Component;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class ElementUtil {
	
	WebDriver driver;

	public ElementUtil(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public boolean checkWebElementPresent(By locator){
		int elementCount = driver.findElements(locator).size();
		System.out.println("total elements count: " + elementCount + " for " + locator);
		
		if(elementCount>0){
			return true;
		}else{
			return false;
		}
	}
	
	public int getElementSize(By locator) {
		return driver.findElements(locator).size();
	}

}
