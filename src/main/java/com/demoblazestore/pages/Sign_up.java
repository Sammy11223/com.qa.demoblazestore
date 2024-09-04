package com.demoblazestore.pages;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.demoblazestore.base.DriverScripts;

public class Sign_up extends DriverScripts {

//********************************************Signuppagelocators*******************

	@FindBy(id = "signin2") private WebElement signupLink;
    @FindBy(id = "sign-username") private WebElement userNameTextbox;
	@FindBy(id = "sign-password") private WebElement userPasswordTextbox;
	@FindBy(xpath="//button[text()='Sign up']")  private WebElement signUpButton;
	
	
	public Sign_up() {
		PageFactory.initElements(driver, this);
	}



	public void signupLink_click() {
		signupLink.click();

	}
	
	public void signupUserEntry(String SignupName) {
		userNameTextbox.sendKeys(SignupName);
	
	}
	
	public void signupPasswordEntry(String SignupPassword) {
		userPasswordTextbox.sendKeys(SignupPassword);
	}
	
	public void signupButtonClick() {
		signUpButton.click();
	}
	public void signupPopupTextVerification() {
		signupButtonClick();
		Alert alert = driver.switchTo().alert();
		String popupText = alert.getText();
		Assert.assertEquals(popupText, "Please fill out Username and Password.");
	
	}
	
	public static void assertTextEquals(String actualText, String expectedText) {
        Assert.assertEquals(actualText, expectedText);
    }
	

	
}