package com.demoblazestore.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.demoblazestore.pages.Sign_up;

public class Signup_TestPage extends a_BaseTestPage {
	// private WebDriver driver;
	//private Sign_up signUpPage;

	@Test(priority = 1)
	public void testSignup_click() throws InterruptedException {
		signuppage.signupLink_click();
		Thread.sleep(3000);
		signuppage.signupUserEntry("jen"+System.currentTimeMillis());
		signuppage.signupPasswordEntry("mkl1222");
		signuppage.signupButtonClick();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		String actualText = alert.getText();
		Sign_up.assertTextEquals(actualText, "Sign up successful.");
		
	}
	
	
	@Test(priority = 2)
	public void testPopupTextVerification() {
		signuppage.signupLink_click();
		signuppage.signupButtonClick();
       // signuppage.signupPopupTextVerification();
		Alert alert = driver.switchTo().alert();
		String actualText = alert.getText();
		Sign_up.assertTextEquals(actualText, "Please fill out Username and Password.");
	}

}