package com.demoblazestore.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoblazestore.base.DriverScripts;

public class About_us extends DriverScripts{
	
	//********8888weblocators*************
	
	@FindBy(linkText ="About us") private WebElement about_us;

	@FindBy(xpath="//h5[@class='modal-title' and @id ='videoModalLabel']") private WebElement about_us_pop_title;
	
	@FindBy(linkText="Close")private WebElement close_about_us;
	
	public About_us() {
		//driver element is coming from DriverScripts, this element is coming from the line 15 for the loginLinks
		PageFactory.initElements(driver, this);

}
	
	public void AboutUsClick() {
		about_us.click();
		}
	
	public void AboutUsPopTitle() {
		//String text_Aboutus = about_us_pop_title.getText();
		//System.out.println("the test is: "+ text_Aboutus);
		
	}
	public void AboutusPopPageClose() {
		//driver.switchTo().alert().dismiss();
		close_about_us.click();
	}
	
	}
