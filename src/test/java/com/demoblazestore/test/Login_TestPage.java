package com.demoblazestore.test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.WebElement;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.demoblazestore.pages.Login;

public class Login_TestPage extends a_BaseTestPage {

	@Test(priority = 1)
	public void testLoginclick() {
		// Login login = new Login();
		loginpage.loginLink_click();
		loginpage.userNameDisplayed();
		Assert.assertTrue(true);


	}

	@Test(priority = 2)
	public void testLoginPageUserEntry() throws InterruptedException {
		loginpage.loginLink_click();
		Thread.sleep(3000);
	    loginpage.userName_Entry("jen1000");
		loginpage.passwordEntry("jkl122");
		loginpage.loginButtonClick();
		loginpage.welcomeUserDisplayed();
		Assert.assertTrue(true);
		Thread.sleep(3000);
	}
}
