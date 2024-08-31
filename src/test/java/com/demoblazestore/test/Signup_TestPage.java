package com.demoblazestore.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.demoblazestore.pages.Sign_up;

public class Signup_TestPage extends a_BaseTestPage {
	// private WebDriver driver;
	//private Sign_up signUpPage;

	@Test(priority = 1)
	public void testSignup_click() throws InterruptedException {
		signuppage.signupLink_click();
		Thread.sleep(10000);
		signuppage.signupUserEntry("jen10000");
		signuppage.signupPasswordEntry("mkl1222");
		signuppage.signupButtonClick();
	}
	@Test(priority = 2)
	public void testPopupTextVerification() {
		signuppage.signupLink_click();
        signuppage.signupPopupTextVerification();
	}

}