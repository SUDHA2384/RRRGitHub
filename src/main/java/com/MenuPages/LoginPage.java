package com.MenuPages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.TestUtils.WebDriverManager;

import basePack.BaseClass;

public class LoginPage extends BaseClass{
	WebDriverManager wdm;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(css="#login_Layer > div")
	WebElement loginBtn;
	
	@FindBy(css="input[placeholder=\"Enter your active Email ID / Username\"]")
	WebElement userName;
	
	
	@FindBy(css="input[placeholder=\"Enter your password\"]")
	WebElement password;
	
	@FindBy(css="button[type=\"submit\"]")
	WebElement submitBtn;
	
	
	public void clickLoginBtn() throws InterruptedException {
		
		String expTitle = "Jobs - Recruitment - Job Search - Employment -Job Vacancies - Naukri.com";
		String actTitle = WebDriverManager.getTitle();
		Assert.assertEquals(actTitle, expTitle);
		WebDriverManager.clickOnElement(loginBtn);
		System.out.println("Success");
	}
	
	public void enterInput() {
		WebDriverManager.typeInput(userName, "sudha082@gmail.com");
		WebDriverManager.typeInput(password, "chinna020384");
	}
	
	public void clickSubmitButton() throws InterruptedException {
		WebDriverManager.clickOnElement(submitBtn);
		
		System.out.println("Login done successfully");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		String expTitle = "https://www.naukri.com/mnjuser/homepage";
		String actTitle = WebDriverManager.currentUrl();
		Assert.assertEquals(actTitle, expTitle);
	}
}
