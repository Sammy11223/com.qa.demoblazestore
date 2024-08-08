package com.demoblazestore.test;

import org.testng.annotations.Test;

import com.demoblazestore.base.DriverScripts;
import com.demoblazestore.pages.About_us;

import dev.failsafe.internal.util.Assert;



public class Aboutus_TestPage extends a_BaseTestPage{
	
	@Test (priority =1)
	public void testClickAboutus() {
		aboutUs.AboutUsClick();
	}
	
	@Test(priority =2)
	public void testPlaybuttondisplay() {
	aboutUs.AboutUsClick();
	aboutUs.AboutusPlayisDisplayed();
	}
	
	@Test(priority =3)
	public void testAboutUsPopupTextTitle() {
		aboutUs.AboutUsClick();
		aboutUs.AboutusPlayisDisplayed();
		aboutUs.AboutUsgetText_popup();
		
	}
	/*
	@Test(priority =4)
	
	public void testClickPlaybutton() {
		aboutUs.AboutUsClick();
		aboutUs.AboutusPlayisDisplayed();
		aboutUs.clickplaybuttonPlay();
	}
	
	/*
	@Test (priority =2)
	public void testPlaybuttonClick() {
		aboutUs.AboutusPopPagePlayButton();
	}

	*/
	

}
