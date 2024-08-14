package com.demoblazestore.pages;

import java.sql.Driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoblazestore.base.DriverScripts;

public class Product_Store extends DriverScripts{
	
	//**WEBLOCATORS****
	
	@FindBy(linkText ="PRODUCT STORE") private WebElement product_store_link;
	@FindBy(xpath=" (//img[@class='card-img-top img-fluid' and @src='imgs/galaxy_s6.jpg'])[1]") private WebElement samsung_galaxys6;
	@FindBy(linkText="Product description") private WebElement product_descrip_text;
	@FindBy(linkText= "Add to cart") private WebElement add_tocart_link;
	//***INITILAIZATION*****
	
	public Product_Store() {
		//driver element is coming from DriverScripts, this element is coming from the line 15 for the loginLinks
		PageFactory.initElements(driver, this);
	
		
	}

	//*****methods********
	
	public void product_store_click() {
		product_store_link.click();
	}
	
	public void samsunggalaxy_s6_click() {
		samsung_galaxys6.click();
	}
	
	public void addtoCart_samsung_6() {
		add_tocart_link.click();
		
	}

}

	