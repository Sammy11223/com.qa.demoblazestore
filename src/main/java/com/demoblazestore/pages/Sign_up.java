package com.demoblazestore.pages;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
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
	
	public void signupUserEntry() {
		userNameTextbox.sendKeys("jen1000");
	
	}
	
	public void signupPasswordEntry() {
		userPasswordTextbox.sendKeys("jkl122");
	}
	
	public void signupButtonClick() {
		signUpButton.click();
	}
}