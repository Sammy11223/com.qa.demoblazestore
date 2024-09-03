package com.demoblazestore.test;
import org.testng.annotations.Test;
import com.demoblazestore.pages.Login;
import com.demoblazestore.test.Login_TestPage;
import com.demoblazestore.test.Home_TestPage;
import com.demoblazestore.pages.Home;
public class ProductStore_TestPage extends a_BaseTestPage {
	
	
		
	/*@Test(priority=2)
	public void testClickProduct_store_link() {
		productpage.product_store_click();		
	}
	*/
	@Test(priority =1)
	public  void accessthelogin_link() throws InterruptedException {
		
		//testLoginPageUserEntry();
		//Login_TestPage login_tp = new Login_TestPage();
		//login_tp.testLoginPageUserEntry();}
		/*		working code before the hardcoded values for Login_page(username, pswd, and clickloginbutton)
		loginpage.loginLink_click();
		loginpage.userName_Entry();
		loginpage.passwordEntry();
		loginpage.loginButtonClick();
		Thread.sleep(3000);	
		*/
		loginpage.loginLink_click();
		
		loginpage.userName_Entry("jen1000");
		Thread.sleep(4000);
		loginpage.passwordEntry("jkl122");
		loginpage.loginButtonClick();
		Thread.sleep(3000);	
	} 
	
	@Test (priority =2)
	public void testClick_product_storelink() throws InterruptedException {
		//just testing if the product store link works or not??
		//((Login_TestPage) loginpage).Login_TestPage();
		productpage.product_store_click();
		productpage.samsunggalaxy_s6_click();
		Thread.sleep(4000);
	}

	@Test(priority =3)
	public void testSamsung_6_productpage_Addtocart() throws InterruptedException {
		//accessthelogin_link();
		accessthelogin_link();
		//validate the welcome text
		//now go to product and add the samsung_6
		//Thread.sleep(4000);
		productpage.product_store_click();
		//Thread.sleep(4000);
		productpage.samsunggalaxy_s6_click();
		productpage.addtoCart_samsung_6();
		Thread.sleep(4000);		
	//	String gettext = driver.switchTo().alert().getText();
		//System.out.println(gettext);
//I creaTED the method for alert accept/dismiss in the driverscript, so that it can be 
		//called here with just the method name [ could be accept or dismiss]
		switchtoAlertAccept();
		Thread.sleep(4000);
		System.out.println("Samsung_6_addedtocart");				
	}	
	

}
