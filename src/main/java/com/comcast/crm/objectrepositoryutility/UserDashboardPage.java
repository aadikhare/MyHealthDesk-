package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserDashboardPage {
	WebDriver driver;
	public UserDashboardPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//span[contains(text(),'Dashboard')]")
	private WebElement DashbordLink;
	
	@FindBy(xpath="//span[text()='Book Appointment']")
	private WebElement BookAppointmentLink;
	
	@FindBy(xpath="//span[contains(text(),'Appointment History')]")
	private WebElement AppointmentHistoryLink;
	
	@FindBy(xpath="//span[contains(text(),'Medical History')]")
	private WebElement MedicalHistoryLink;
	
	@FindBy(xpath="//a[contains(text(),'Update Profile')]")
	private WebElement UpdateProfileLink ;
	
	@FindBy(xpath="//span[@class='username']")
	private WebElement LogoutLogo;
	
	@FindBy(xpath="//a[contains(text(),'Log Out')]")
	private WebElement LogoutLink;

	
	public WebElement getDashbordLink() {
		return DashbordLink;
	}

	public WebElement getBookAppointmentLink() {
		return BookAppointmentLink;
	}

	public WebElement getAppointmentHistoryLink() {
		return AppointmentHistoryLink;
	}

	public WebElement getMedicalHistoryLink() {
		return MedicalHistoryLink;
	}

	public WebElement getUpdateProfileLink() {
		return UpdateProfileLink;
	}
	
	public WebElement getLogoutLogo() {
		return LogoutLogo;
	}

	public WebElement getLogoutLink() {
		return LogoutLink;
	}
	
	public void Patientlogout() {
		LogoutLogo.click();
		LogoutLink.click();

}
}