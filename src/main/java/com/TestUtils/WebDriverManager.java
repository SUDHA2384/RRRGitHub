package com.TestUtils;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import basePack.BaseClass;


public class WebDriverManager extends BaseClass{
	
	
	public static String getTitle() {
		String actTitle = driver.getTitle();
		System.out.println(actTitle);
		
		return actTitle;
	}
	
	public static String currentUrl() {
		String actCurrentUrl = driver.getCurrentUrl();
		System.out.println(actCurrentUrl);
		return actCurrentUrl;
	}
	
	public static void typeInput(WebElement element, String text) {
		WebDriverWait wait  = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(text);
	}

	
	public static void clickOnElement(WebElement element) {
		WebDriverWait wait  = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}
	
	public void windoeHandle() {
		
	}
}
