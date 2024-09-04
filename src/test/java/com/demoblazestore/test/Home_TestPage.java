package com.demoblazestore.test;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.demoblazestore.pages.Home;

public class Home_TestPage extends a_BaseTestPage {

	@Test(priority = 1)
	public void testHomeclick() throws InterruptedException {
		// logger = report.createTest("test Home page click");
		String text = homepage.getHomeText();
		System.out.println(text);
		Assert.assertTrue(true, text);
		Assert.assertTrue(text.contains("Home"));
		Thread.sleep(3000);
		// logger.pass("Home icon text matched");
	}

	@Test(priority = 2)
	public void testContactclick() throws InterruptedException {
		String text = homepage.getcontactButtonText();
		System.out.println(text);
		Assert.assertTrue(text.contains("Contact"));
		Thread.sleep(3000);
	}

	@Test(priority = 3)
	public void testAboutusclick() throws InterruptedException {
		String text = homepage.getaboutusButtonText();
		System.out.println(text);
		Assert.assertTrue(text.contains("About us"));
		Thread.sleep(3000);
	}

	@Test(priority = 4)
	public void testCartclick() throws InterruptedException {
		String text = homepage.getcartButtonText();
		System.out.println(text);
		Assert.assertTrue(text.contains("Cart"));
		Thread.sleep(3000);
	}

	@Test(priority = 5)
	public void testLoginclick() throws InterruptedException {
		String text = homepage.getloginButtonText();
		System.out.println(text);
		Assert.assertTrue(text.contains("Log in"));
		Thread.sleep(3000);
	}

	@Test(priority = 6)
	public void testSignupclick() throws InterruptedException {
		Home home = new Home();
		String text = homepage.getsignupButtonText();
		System.out.println(text);
		Assert.assertTrue(text.contains("Sign up"));
		Thread.sleep(3000);
	}

	@Test(priority = 7)
	public void testphonesTabclick() throws InterruptedException {
		String text = homepage.getphonesTabText();
		System.out.println(text);
		Assert.assertTrue(text.contains("Phones"));
		Thread.sleep(3000);
	}

	@Test(priority = 8)
	public void testlaptopsTabclick() throws InterruptedException {
		String text = homepage.getlaptopsTabText();
		System.out.println(text);
		Assert.assertTrue(text.contains("Laptops"));
		Thread.sleep(3000);
	}

	@Test(priority = 9)
	public void testmonitorsTabclick() throws InterruptedException {
		String text = homepage.getmonitorsTabText();
		System.out.println(text);
		Assert.assertTrue(text.contains("Monitors"));
		Thread.sleep(3000);
	}

	@Test(priority = 10)
	public void testHomeLink() throws InterruptedException {
		homepage.monitorsTab_click();
		Thread.sleep(3000);
		String pageTitle = homepage.getHomePageTitle();
		System.out.println(pageTitle);
		Assert.assertTrue(pageTitle.contains("STORE"));
	}
}
