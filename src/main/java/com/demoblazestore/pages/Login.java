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

public class Login extends DriverScripts {

//******LoginPageLocators************

	@FindBy(id = "login2") private WebElement loginLink_homepage;
	@FindBy(id = "loginusername") private WebElement loginUsernameTextBox;
	@FindBy(id = "loginpassword") private WebElement loginPasswordTextBox;
	@FindBy(xpath = "//button[contains(@class, 'btn btn-primary') and contains(text(), 'Log in')]") private WebElement loginFormButton;

	
	//WebElement login_Button;

	public Login() {
		PageFactory.initElements(driver, this);
	}

	public void loginLink_click() {
		loginLink_homepage.click();
	}

	public void userName_Entry() {
		loginUsernameTextBox.sendKeys("hji88");
	}

	public void passwordEntry() {
		loginPasswordTextBox.sendKeys("1234");

	}

	public void loginButtonClick() {
		loginFormButton.click();

	}

}
