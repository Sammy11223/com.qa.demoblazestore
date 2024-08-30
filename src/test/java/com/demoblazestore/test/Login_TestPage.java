package com.demoblazestore.test;
import org.testng.annotations.Test;

import com.demoblazestore.pages.Login;

public class Login_TestPage extends a_BaseTestPage  {

	@Test(priority = 1)
	public void testLoginclick() throws InterruptedException {
		//Login login = new Login();
		loginpage.loginLink_click();	
	}
	
	@Test(priority = 2)
	public void testLoginPageUserEntry() throws InterruptedException {
		loginpage.loginLink_click();
		loginpage.userName_Entry("jen1000");
		loginpage.passwordEntry("jkl122");
		loginpage.loginButtonClick();
		Thread.sleep(10000);		
	}
}
