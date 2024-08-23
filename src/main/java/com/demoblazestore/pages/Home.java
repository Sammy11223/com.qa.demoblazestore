package com.demoblazestore.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoblazestore.base.DriverScripts;

public class Home extends DriverScripts {

	//******HomePageLocators************

		@FindBy(xpath = "//a[text()='Home ']") private WebElement homeButton;
		@FindBy(xpath = "//a[text()='Contact']") private WebElement contactButton;
		@FindBy(xpath = "//a[text()='About us']") private WebElement aboutusButton;
		@FindBy(xpath = "//a[text()='Cart']") private WebElement cartButton;
		@FindBy(xpath = "//a[text()='Log in']") private WebElement loginButton;
		@FindBy(xpath = "//a[text()='Sign up']") private WebElement signupButton;
		@FindBy(xpath = "//a[text()='Phones']") private WebElement phonesTab;
		@FindBy(xpath = "//a[text()='Laptops']") private WebElement laptopsTab;
		@FindBy(xpath = "//a[text()='Monitors']") private WebElement monitorsTab;
		
	//******************** Page Initialization***************************
			public Home() {
				PageFactory.initElements(driver, this);
			}
				
	//******************** Page Methods/Actions***************************
				
		public String getHomePageTitle() {
			return driver.getTitle();
		}
		
		public void homeButton_click() {
			homeButton.click();
		}
		
		public String getHomeText() {
			return homeButton.getText();
		}
		
		public void contactButton_click() {
			contactButton.click();
		}
		
		public String getcontactButtonText() {
			return contactButton.getText();
		}
		
		public void aboutusButton_click() {
			aboutusButton.click();
		}
		
		public String getaboutusButtonText() {
			return aboutusButton.getText();
		}
		
		public void cartButton_click() {
			cartButton.click();
		}
		
		public String getcartButtonText() {
			return cartButton.getText();
		}
		
		public void loginButton_click() {
			loginButton.click();
		}
		
		public String getloginButtonText() {
			return loginButton.getText();
		}
		
		public void signupButton_click() {
			signupButton.click();
		}
		
		public String getsignupButtonText() {
			return signupButton.getText();
		}
		
		public boolean isHomeButtonPresent() {
			return homeButton.isDisplayed();
		}
		
		public boolean iscontactButtonPresent() {
			return contactButton.isDisplayed();
		}
		
		public boolean isaboutusButtonPresent() {
			return aboutusButton.isDisplayed();
		}
		
		public boolean iscartButtonPresent() {
			return cartButton.isDisplayed();
		}
		
				
		public boolean isloginButtonPresent() {
			return loginButton.isDisplayed();
		}
		
		public boolean issignupButtonPresent() {
			return signupButton.isDisplayed();
		}
		public void phonesTab_click() {
			phonesTab.click();
		}
		
		public String getphonesTabText() {
			return phonesTab.getText();
		}
		
		public boolean isphonesTabPresent() {
			return phonesTab.isDisplayed();
		}
		public void laptopsTab_click() {
			laptopsTab.click();
		}
		
		public String getlaptopsTabText() {
			return laptopsTab.getText();
		}
		
		public boolean islaptopsTabPresent() {
			return laptopsTab.isDisplayed();
		}
		public void monitorsTab_click() {
			monitorsTab.click();
		}
		
		public String getmonitorsTabText() {
			return monitorsTab.getText();
		}
		
		public boolean ismonitorsTabPresent() {
			return monitorsTab.isDisplayed();
		}
}
