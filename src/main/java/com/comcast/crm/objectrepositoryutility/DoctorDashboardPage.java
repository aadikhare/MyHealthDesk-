package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DoctorDashboardPage {
	WebDriver driver;
	public DoctorDashboardPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//span[contains(text(),'Dashboard')]")
	private WebElement DashbordLink;
	
	@FindBy(xpath="//a[contains(text(),'Update Profile')]")
	private WebElement UpdateProfileLink ;
	
	
	public WebElement getUpdateProfileLink() {
		return UpdateProfileLink;
	}

	@FindBy(xpath="//span[contains(text(),'Appointment History')]")
	private WebElement AppointmentHistoryLink;
	
	@FindBy(xpath="//span[contains(text(),'Patients')]")
	private WebElement PatientsLink ;
	
	@FindBy(xpath="//span[contains(text(),' Add Patient')]")
	private WebElement AddPatientLink;
	
	@FindBy(xpath="//span[contains(text(),' Manage Patient ')]")
	private WebElement ManagePatientLink;
	
	@FindBy(xpath="//span[contains(text(),' Search ')]")
	private WebElement SearchLink ;
	
	@FindBy(xpath="//span[@class='username']")
	private WebElement LogoutLogo;
	
	@FindBy(xpath="//a[contains(text(),'Log Out')]")
	private WebElement LogoutLink;
	
	public WebElement getDashbordLink() {
		return DashbordLink;
	}

	public WebElement getAppointmentHistoryLink() {
		return AppointmentHistoryLink;
	}

	public WebElement getPatientsLink() {
		return PatientsLink;
	}

	public WebElement getAddPatientLink() {
		return AddPatientLink;
	}

	public WebElement getManagePatientLink() {
		return ManagePatientLink;
	}

	public WebElement getSearchLink() {
		return SearchLink;
	}
	
	public WebElement getLogoutLink() {
		return LogoutLink;
	}

	public WebElement getLogoutLogo() {
		return LogoutLogo;
	}
	
	public void doctorlogout() {
		LogoutLogo.click();
		LogoutLink.click();
	}

}
