package com.demoblazestore.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoblazestore.base.DriverScripts;

public class Contact extends DriverScripts {
	
	//******ContactPageLocators************

			@FindBy(id = "recipient-email") private WebElement ContactEmailTextBox;
			@FindBy(id = "recipient-name") private WebElement ContactNameTextBox;
			@FindBy(id = "message-text") private WebElement MessageTextBox;
			@FindBy(xpath = "//*[@id=\"exampleModal\"]//button[@class='btn btn-secondary']") private WebElement CloseButton;
			@FindBy(xpath = "//button[text()='Send message']") private WebElement SendMessageButton;

	//******************** Page Initialization***************************
			public Contact() {
				PageFactory.initElements(driver, this);
			}
				
	//******************** Page Methods/Actions***************************
				
		public String getContactPageTitle() {
			return driver.getTitle();
		}
		
		public void ContactEmailTextBox_sendText() {
			ContactEmailTextBox.sendKeys("abc@abc.com");
		}
		
		public void ContactNameTextBox_sendText() {
			ContactNameTextBox.sendKeys("Jhon");
		}
		
		public void MessageTextBox_sendText() {
			MessageTextBox.sendKeys("Test Message for testing");
		}
		
		public void CloseButton_click() {
			CloseButton.click();
		}
		
		public void SendMessageButton_click() {
			SendMessageButton.click();
		}
}
