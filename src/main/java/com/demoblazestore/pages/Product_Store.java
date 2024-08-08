package com.demoblazestore.pages;

import java.sql.Driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Product_Store {
	
	//**WEBLOCATORS****
	
	@FindBy(linkText ="PRODUCT STORE") private WebElement product_store_link;
	
	
	//***INITILAIZATION*****
	

		public Product_Store(){
			//driver element is coming from DriverScripts, this element is coming from the line 15 for the loginLinks
			PageFactory.initElements(driver, this);
	}
	
	//*****methods********

}
