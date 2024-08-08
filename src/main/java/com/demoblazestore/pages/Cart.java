package com.demoblazestore.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoblazestore.base.DriverScripts;

public class Cart extends DriverScripts{
	
	//****weblocator**
	@FindBy(linkText="Cart") private WebElement cart;
		// TODO Auto-generated method stub

	//**initialization**
	public Cart() {
		//driver element is coming from DriverScripts, this element is coming from the line 15 for the loginLinks
		PageFactory.initElements(driver, this);
	}
	
	//**methods***
	public void clickCart() {
		cart.click();
	}
	


}
