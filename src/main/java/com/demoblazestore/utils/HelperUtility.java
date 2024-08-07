package com.demoblazestore.utils;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import com.demoblazestore.base.DriverScripts;


public class HelperUtility extends DriverScripts {

	// create method to create screenshots
	// this method accepts type of webdriver

	public static String captureScreens(WebDriver driver) {
		
		
		//1st define the source how we are capturing the screen// how ypou are grabbing the screen
		
		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		//2nd once given the source, give a path to save the screenshot the report

		//String screenPath = "C:/Users/Pramoj PC/Documents/Selenium/com.qa.webshops/reportss/screensshots/screen.png";
		
		//[("./reportss/index_"+System.currentTimeMillis()+".html ");]
		String screenPath =System.getProperty("user.dir")+ "./reports/screenshotss/screen_"+System.currentTimeMillis()+".png";
		
		
		try {
			
			//from class Filehandler, copy the report and attach to the Report
		FileHandler.copy(source, new File(screenPath ));
	}
		
		catch(IOException e) {
			System.out.println("unable to capture the screen");
			e.printStackTrace();
		}
			
		return screenPath;
	}

}