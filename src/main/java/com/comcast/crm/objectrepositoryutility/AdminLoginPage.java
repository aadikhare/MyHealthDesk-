package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminLoginPage {
	
		
		WebDriver driver;
		public AdminLoginPage(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver,this);
		}
		
		@FindBy(xpath="//input[@name='username']")
		private WebElement Username;
		
		@FindBy(xpath="//input[@name='password']")
		private WebElement Password;
		
		@FindBy(xpath="//button[@name='submit']")
		private WebElement LoginBtn;
		
		@FindBy(xpath="//a[contains(text(),'Bacto Home Page')]")
		private WebElement BactoHomePageLink;
		
		  
		
		
		public WebElement getUsername() {
			return Username;
		}
		
		public WebElement getPassword() {
			return Password;
		}
		
		public WebElement getLoginBtn() {
			return LoginBtn;
		}
		
		public WebElement getBactoHomePageLink() {
			return BactoHomePageLink;
		}
		
		public void adminLogin() {
			Username.sendKeys("admin");
			Password.sendKeys("Test@12345");
			LoginBtn.click();
			
		}
		
		
		
}
		
			


