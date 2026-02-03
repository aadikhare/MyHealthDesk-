package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookAppointmentPage {
	
		
		WebDriver driver;
		public BookAppointmentPage(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver,this);
		}
		
		@FindBy(xpath="//select[@name='Doctorspecialization']")
		private WebElement DoctorSpecialization;
		
		@FindBy(xpath="//select[@name='doctor']")
		private WebElement Doctors;
		
		@FindBy(xpath="//input[@name='appdate']")
		private WebElement Date;
		
		@FindBy(xpath="//input[@name='apptime']")
		private WebElement Time;
		
		@FindBy(xpath="//button[@name='submit']")
		private WebElement submitBtn;
		public WebElement getDoctorSpecialization() {
			return DoctorSpecialization;
		}

		public WebElement getDoctors() {
			return Doctors;
		}

		public WebElement getDate() {
			return Date;
		}

		public WebElement getTime() {
			return Time;
		}

		public WebElement getSubmitBtn() {
			return submitBtn;
		}
		

		
		
		
		
		
}
		
			


