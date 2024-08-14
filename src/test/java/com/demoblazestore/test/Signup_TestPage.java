package com.demoblazestore.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.demoblazestore.pages.Sign_up;

public class Signup_TestPage extends a_BaseTestPage {
	// private WebDriver driver;
	//private Sign_up signUpPage;

	@Test(priority = 1)
	public void testSignup_click() throws InterruptedException {
		//Sign_up signuppage = new Sign_up();
		signuppage.signupLink_click();
		Thread.sleep(10000);
		signuppage.signupUserEntry();
		signuppage.signupPasswordEntry();
		signuppage.signupButtonClick();
	}

}