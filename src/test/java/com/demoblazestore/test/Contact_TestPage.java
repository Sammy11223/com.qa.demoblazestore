package com.demoblazestore.test;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;
import com.demoblazestore.pages.Contact;
import com.demoblazestore.pages.Home;
import com.demoblazestore.pages.Sign_up;

public class Contact_TestPage extends a_BaseTestPage {


	@Test(priority = 1)
	public void testSendMessage() throws InterruptedException {
		homepage.contactButton_click();
		contactpage.ContactEmailTextBox_sendText("abc@abc.com"); 
		contactpage.ContactNameTextBox_sendText("Jhon");
		contactpage.MessageTextBox_sendText("Test Message for testing");
		Thread.sleep(3000);
		contactpage.SendMessageButton_click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		String actualText = alert.getText();
		Sign_up.assertTextEquals(actualText, "Thanks for the message!!");	
	}
	@Test(priority = 2)
	public void testCloseWithoutSendMessage() throws InterruptedException {
		homepage.contactButton_click();
		contactpage.ContactEmailTextBox_sendText("abc@abc.com"); 
		contactpage.ContactNameTextBox_sendText("Jhon");
		contactpage.MessageTextBox_sendText("Test Message for testing");
		Thread.sleep(3000);
		contactpage.CloseButton_click();
		Thread.sleep(3000);
	}
}
