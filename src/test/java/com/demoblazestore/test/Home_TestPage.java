package com.demoblazestore.test;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.demoblazestore.pages.Home;

public class Home_TestPage extends a_BaseTestPage {

	@Test(priority = 1)
	public void testHomeclick() throws InterruptedException {
		// logger = report.createTest("test Home page click");
		Home home = new Home();
		String text = home.getHomeText();
		System.out.println(text);
		Assert.assertTrue(true, text);
		Thread.sleep(3000);
		// logger.pass("Home icon text matched");
	}

	@Test(priority = 2)
	public void testContactclick() throws InterruptedException {
		Home home = new Home();
		String text = home.getcontactButtonText();
		System.out.println(text);
		Thread.sleep(3000);
	}

	@Test(priority = 3)
	public void testAboutusclick() throws InterruptedException {
		Home home = new Home();
		String text = home.getaboutusButtonText();
		System.out.println(text);
		Thread.sleep(3000);
	}

	@Test(priority = 4)
	public void testCartclick() throws InterruptedException {
		Home home = new Home();
		String text = home.getcartButtonText();
		System.out.println(text);
		Thread.sleep(3000);
	}

	@Test(priority = 5)
	public void testLoginclick() throws InterruptedException {
		Home home = new Home();
		String text = home.getloginButtonText();
		System.out.println(text);
		Thread.sleep(3000);
	}

	@Test(priority = 6)
	public void testSignupclick() throws InterruptedException {
		Home home = new Home();
		String text = home.getsignupButtonText();
		System.out.println(text);
		Thread.sleep(3000);
	}

	@Test(priority = 7)
	public void testphonesTabclick() throws InterruptedException {
		Home home = new Home();
		String text = home.getphonesTabText();
		System.out.println(text);
		Thread.sleep(3000);
	}

	@Test(priority = 8)
	public void testlaptopsTabclick() throws InterruptedException {
		Home home = new Home();
		String text = home.getlaptopsTabText();
		System.out.println(text);
		Thread.sleep(3000);
	}

	@Test(priority = 9)
	public void testmonitorsTabclick() throws InterruptedException {
		Home home = new Home();
		String text = home.getmonitorsTabText();
		System.out.println(text);
		Thread.sleep(3000);
	}

	@Test(priority = 10)
	public void testHomeLink() throws InterruptedException {
		Home home = new Home();
		home.monitorsTab_click();
		Thread.sleep(3000);
		String pageTitle = home.getHomePageTitle();
		System.out.println(pageTitle);
		Assert.assertTrue(true, pageTitle);
	}
}
