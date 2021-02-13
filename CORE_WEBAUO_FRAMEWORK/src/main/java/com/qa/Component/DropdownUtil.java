package com.qa.Component;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropdownUtil {
	
	WebDriver driver;
	ElementUtil elementUtil;

	public DropdownUtil(WebDriver driver) {
		this.driver = driver;
		elementUtil = new ElementUtil(driver);
	}
	
	public void doDropDownSelectByVisibleText(By locator, String value) {
		Select select = new Select(elementUtil.getElement(locator));
		select.selectByVisibleText(value);
	}

	public void doDropDownSelectByValue(By locator, String value) {
		Select select = new Select(elementUtil.getElement(locator));
		select.selectByValue(value);
	}

	public void doDropDownSelectByIndex(By locator, int index) {
		Select select = new Select(elementUtil.getElement(locator));
		select.selectByIndex(index);
	}

	public List<String> getAllDropDownOptionsList(By locator) {

		WebElement element = elementUtil.getElement(locator);
		List<String> optionsValueList = new ArrayList<String>();

		Select select = new Select(element);
		List<WebElement> optionsList = select.getOptions();

		for (int i = 0; i < optionsList.size(); i++) {
			String text = optionsList.get(i).getText();
			optionsValueList.add(text);
		}

		return optionsValueList;

	}

	public void selectValueFromDropDown(By locator, String value) {

		WebElement element = elementUtil.getElement(locator);

		Select select = new Select(element);
		List<WebElement> optionsList = select.getOptions();

		for (int i = 0; i < optionsList.size(); i++) {
			String text = optionsList.get(i).getText();
			if (text.equals(value)) {
				optionsList.get(i).click();
				break;
			}
		}

	}
	
	public void selectDropDownValueWithoutSelectClass(By locator, String value) {
		List<WebElement> industry_options_list = driver.findElements(locator);
		for (WebElement ele : industry_options_list) {
			String text = ele.getText();
			if (text.equals(value)) {
				ele.click();
				break;
			}
		}
	}

}
