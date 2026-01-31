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
	
	@FindBy(xpath="//span[text()='Dashboard']")
	private WebElement DashbordLink;
	
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
	

}
