package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
		
		WebDriver driver;
		public HomePage(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver,this);
		}
		
		@FindBy(xpath="//a[text()='Services']")
		private WebElement Services;
		
		@FindBy(xpath="//a[text()='About Us']")
		private WebElement AboutUsLink;
		
		@FindBy(xpath="//a[text()='Gallery']")
		private WebElement GalleryLink;
		
		@FindBy(xpath="//a[text()='Contact Us']")
		private WebElement ContactUsLink;
		
		@FindBy(xpath="//a[text()='Logins']")
		private WebElement LoginsLink;
		
		@FindBy(xpath="//a[text()='Book an Appointment']")
		private WebElement BookAnAppointmentBtn;
		
		
		@FindBy(xpath="//h6[text()='Patient Login']/following-sibling::a")
		private WebElement PatientLoginBtn;
		
		@FindBy(xpath="//h6[text()='Doctors login']/following-sibling::a")
		private WebElement DoctorLoginBtn;
		
		@FindBy(xpath="//h6[text()='Admin Login']/following-sibling::a")
		private WebElement AdminLoginBtn;
		
		/*Contact Form elements*/
			
		@FindBy(xpath="//input[@name='fullname']")
		private WebElement EnterNameTextField;
		
		@FindBy(xpath="//input[@name='emailid']")
		private WebElement EmailAddress;
		
		@FindBy(xpath="//input[@name='mobileno']")
		private WebElement MobileNumber;
		
		@FindBy(xpath="//textarea[@name='description']")
		private WebElement EnterMessage;
		
		@FindBy(xpath="//button[text()='Send Message']")
		private WebElement SendMessageBtn;
		
		
	 
		 
		
		
		
		public WebElement getServices() {
			return Services;
		}
		
		public WebElement getAboutUsLink() {
			return AboutUsLink;
		}
		
		public WebElement getGalleryLink() {
			return GalleryLink;
		}
		
		public WebElement getContactUsLink() {
			return ContactUsLink;
		}
		
		public WebElement getLoginsLink() {
			return LoginsLink;
		}
		
		public WebElement getBookAnAppointmentBtn() {
			return BookAnAppointmentBtn;
		}
		
		public WebElement getPatientLoginBtn() {
			return PatientLoginBtn;
		}
		
		public WebElement getDoctorLoginBtn() {
			return DoctorLoginBtn;
		}
		
		public WebElement getAdminLoginBtn() {
			return AdminLoginBtn;
		}
		
		public WebElement getEnterNameTextField() {
			return EnterNameTextField;
		}
		
		public WebElement getEmailAddress() {
			return EmailAddress;
		}
		
		public WebElement getMobileNumber() {
			return MobileNumber;
		}
		
		public WebElement getEnterMessage() {
			return EnterMessage;
		}
		
		public WebElement getSendMessageBtn() {
			return SendMessageBtn;
		}
		
}
		
			


