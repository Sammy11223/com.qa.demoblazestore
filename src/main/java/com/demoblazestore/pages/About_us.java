package com.demoblazestore.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.demoblazestore.base.DriverScripts;

public class About_us extends DriverScripts{
	
	//********8888weblocators*************
	
	@FindBy(xpath="//a[@class='nav-link' and @data-target='#videoModal']") private WebElement about_us;

	@FindBy(xpath="//h5[@class='modal-title' and @id ='videoModalLabel']") private WebElement about_us_pop_Title;
	
	@FindBy(xpath="(//span[@class='vjs-icon-placeholder'])[1]") private WebElement playbutton_displayed;
	
	@FindBy(linkText="Play Video") private WebElement playVideo;
	
	
	public About_us() {
		//driver element is coming from DriverScripts, this element is coming from the line 15 for the loginLinks
		PageFactory.initElements(driver, this);

}
	
	public void AboutUsClick() {
		about_us.click();
		}
	
	
	public void AboutUsgetText_popup() {
		about_us_pop_Title.getText();
	}
	
	public void AboutusPlayisDisplayed() {
	new WebDriverWait(driver, Duration.ofSeconds(30));
	playbutton_displayed.isDisplayed();
	}
	
	public void clickplaybuttonPlay() {
		playVideo.click();
	}
		
	public void clickyourplaybuttonPlay() {
		playVideo.click();
	}
		
	
		
		
		/*
		Actions action = new Actions(driver);

		WebElement element =driver.findElement(By.xpath("(//span[@class='vjs-icon-placeholder'])[1] "));

		action.moveToElement(element).click().perform();
		
		//driver.switchTo().alert().dismiss();
		driver.click(); */
	}
	
	