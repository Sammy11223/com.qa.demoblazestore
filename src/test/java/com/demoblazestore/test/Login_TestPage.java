package com.demoblazestore.test;
import org.testng.annotations.Test;

import com.demoblazestore.pages.Login;

public class Login_TestPage extends a_BaseTestPage  {

	@Test
	public void testLoginclick() throws InterruptedException {
		Login login = new Login();
		login.loginLink_click();
		Thread.sleep(10000);
		login.userName_Entry();
		login.passwordEntry();
		login.loginButtonClick();
	}

}
