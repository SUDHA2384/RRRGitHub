package testCases;

import org.testng.annotations.Test;

import com.MenuPages.LoginPage;

import basePack.BaseClass;

public class TC_001 extends BaseClass{
	LoginPage lp;
	
	@Test
	public void loginTest() throws InterruptedException {
		lp = new LoginPage(driver);
		lp.clickLoginBtn();
		lp.enterInput();
		lp.clickSubmitButton();
	}

}
