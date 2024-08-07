package com.demoblazestore.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoblazestore.base.DriverScripts;

public class About_us extends DriverScripts{
	
	//********8888weblocators*************
	
	@FindBy(linkText ="About us") private WebElement about_us;


	

	public About_us() {
		//driver element is coming from DriverScripts, this element is coming from the line 15 for the loginLinks
		PageFactory.initElements(driver, this);

}
	
	public void AboutUsClick() {
		about_us.click();
		}
	
	}
