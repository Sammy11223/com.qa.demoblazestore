package com.demoblazestore.test;

import org.testng.annotations.Test;
import com.demoblazestore.pages.Contact;
import com.demoblazestore.pages.Home;

public class Contact_TestPage extends a_BaseTestPage {


	@Test(priority = 1)
	public void testSendMessage() throws InterruptedException {
		homepage.contactButton_click();
		Contact contact = new Contact(); // Remove this line or comment it out
		contact.ContactEmailTextBox_sendText(); // anywhere contact in this page should be replaced with contactpage , as this has been initialized already inside the a_BaseTestPage
		contact.ContactNameTextBox_sendText();
		contact.MessageTextBox_sendText();
		Thread.sleep(3000);
		contact.SendMessageButton_click();
		Thread.sleep(3000);
}
	@Test(priority = 2)
	public void testCloseWithoutSendMessage() throws InterruptedException {
		homepage.contactButton_click();
		Contact contact = new Contact(); // Remove this line or comment it out
		contact.ContactEmailTextBox_sendText(); // anywhere contact in this page should be replaced with contactpage , as this has been initialized already inside the a_BaseTestPage
		contact.ContactNameTextBox_sendText();
		contact.MessageTextBox_sendText();
		Thread.sleep(3000);
		contact.CloseButton_click();
		Thread.sleep(3000);
}
}
