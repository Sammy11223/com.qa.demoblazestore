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
	
/*	
	
	@Test(priority =2)
	public void testPlaybuttondisplay() {
	aboutUs.AboutUsClick();

	}


	@Test(priority =4)
	
	public void testClickPlaybutton() throws InterruptedException {
		aboutUs.AboutUsClick();
		Thread.sleep(1000);
	
		aboutUs.AboutUs_play_video();
	}
	
	/*
	@Test (priority =2)
	public void testPlaybuttonClick() {
		aboutUs.AboutusPopPagePlayButton();
	}

	*/
	

}
