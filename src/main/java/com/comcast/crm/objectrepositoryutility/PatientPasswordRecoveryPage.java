package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PatientPasswordRecoveryPage {
	
		
		WebDriver driver;
		public PatientPasswordRecoveryPage(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver,this);
		}
		
		@FindBy(xpath="//input[@name='fullname']")
		private WebElement Fullname;
		
		@FindBy(xpath="//input[@name='email']")
		private WebElement Email;
		
		@FindBy(xpath="//button[@name='submit']")
		private WebElement SubmitBtn;
		
		@FindBy(xpath="//a[contains(text(),'Log-in')]")
		private WebElement LogIn;
		
		  
		
		
		public WebElement getFullname() {
			return Fullname;
		}
		
		public WebElement getEmail() {
			return Email;
		}
		
		public WebElement getSubmitBtn() {
			return SubmitBtn;
		}
		
		public WebElement getLogIn() {
			return LogIn;
		}
		
		
		
}
		
			


