package com.demoblazestore.test;

import org.openqa.selenium.WindowType;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.demoblazestore.pages.Product_Store;
import com.google.common.annotations.VisibleForTesting;

public class ProductStore_TestPage extends a_BaseTestPage {
	
	
	@Test(priority=1)
	public void testClickProduct_store_link() {
		productpage.product_store_click();
		
	}
	@Test(priority=2)
	public void testClickSamsunggalaxy6() {
		productpage.product_store_click();
		productpage.samsunggalaxy_s6_click();
	}
	
	@Test(priority =3)
	public void testSamsung_6_productpage_Addtocart() throws InterruptedException {
		productpage.product_store_click();
		productpage.samsunggalaxy_s6_click();
		productpage.addtoCart_samsung_6();
		Thread.sleep(300);
		
		String gettext = driver.switchTo().alert().getText();
		System.out.println(gettext);
//I creaTED the method for alert accept/dismiss in the driverscript, so that it can be 
		//called here with just the method name [ could be accept or dismiss]
		switchtoAlertAccept();
		System.out.println("Samsung_6_addedtocart");
		
	
		
	}
	
	
	

}
