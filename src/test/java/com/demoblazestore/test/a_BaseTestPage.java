package com.demoblazestore.test;



import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentAventReporter;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.demoblazestore.base.DriverScripts;
import com.demoblazestore.pages.About_us;
import com.demoblazestore.pages.Cart;
import com.demoblazestore.pages.Contact;
import com.demoblazestore.pages.Home;
import com.demoblazestore.pages.Login;
import com.demoblazestore.pages.Product_Store;
import com.demoblazestore.pages.Sign_up;
import com.demoblazestore.utils.HelperUtility;


public class a_BaseTestPage extends DriverScripts {
	
	//there are 3 protected variables that are below assigned to generate the reports
	
	protected static ExtentHtmlReporter extenthtmlreport;
	protected static ExtentReports exreports;
	protected static ExtentTest logger;

	Home homepage;
	Login loginpage;
	Sign_up signuppage;
	Contact contactpage;
	Cart cartpage;
	About_us aboutUs;
	Product_Store productpage;
	
	@BeforeSuite
	public void setUpReport() {
		//give the path where you want the report to be generated
		  extenthtmlreport = new ExtentHtmlReporter("./reports/index_"+System.currentTimeMillis()+".html ");
		  
		//now create an object of class from Extent report
		
		 exreports = new ExtentReports();
		 
		 exreports.attachReporter(extenthtmlreport);
	}

	@BeforeMethod
	public void setUp() {
		initializationofApplication();
		homepage = new Home();
		loginpage = new Login();
		signuppage = new Sign_up();
		contactpage = new Contact();
		cartpage = new Cart();
		aboutUs = new About_us();
		productpage = new Product_Store();
		
		
	}

	@AfterMethod
	// , whenever there is a failure use ItESTrESULT in aftermethod, from testNg
	public void tearDown(ITestResult result) {
		
		if(result.getStatus()==ITestResult.FAILURE)
			try
		{
			logger.fail("test-failed",MediaEntityBuilder.createScreenCaptureFromPath(HelperUtility.captureScreens(driver)).build());
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	
		//before quitiing the browser, the Report needs to be flushed.
		exreports.flush();
		quitDriver();
	}

}