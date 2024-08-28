package com.demoblazestore.test;

import org.testng.annotations.Test;
import com.demoblazestore.pages.Contact;
import com.demoblazestore.pages.Home;

public class Contact_TestPage extends a_BaseTestPage {


	@Test(priority = 1)
	public void testSendMessage() throws InterruptedException {
		Home home = new Home();
		home.contactButton_click();
		Contact contact = new Contact();
		contact.ContactEmailTextBox_sendText();
		contact.ContactNameTextBox_sendText();
		contact.MessageTextBox_sendText();
		Thread.sleep(3000);
		contact.SendMessageButton_click();
		
}
	@Test(priority = 2)
	public void testCloseWithoutSendMessage() throws InterruptedException {
		Home home = new Home();
		home.contactButton_click();
		Contact contact = new Contact();
		contact.ContactEmailTextBox_sendText();
		contact.ContactNameTextBox_sendText();
		contact.MessageTextBox_sendText();
		Thread.sleep(3000);
		contact.CloseButton_click();
		
}
}