package com.demoblazestore.test;

import org.testng.annotations.Test;

import com.demoblazestore.base.DriverScripts;
import com.demoblazestore.pages.About_us;



public class Aboutus_TestPage extends a_BaseTestPage{
	
	@Test
	public void testClickAboutus() {
		aboutUs.AboutUsClick();
	}
	
	@Test
	public void testAboutusPopuptitle() {
		aboutUs.AboutUsPopTitle();
	}
	

}
