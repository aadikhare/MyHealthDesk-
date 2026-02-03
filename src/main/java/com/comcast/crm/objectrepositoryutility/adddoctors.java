package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class adddoctors {

	WebDriver driver;
	public adddoctors(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//select[@class=\"form-control\"]")
	WebElement selectspeci;

	@FindBy(xpath = "//input[@name=\"docname\"]")
	WebElement doctorname;

	@FindBy(xpath = "//textarea[@name=\"clinicaddress\"]")
	WebElement clinicaddress;

	@FindBy(xpath = "//input[@name=\"docfees\"]")
	WebElement consultfee;

	@FindBy(xpath = "//input[@name=\"doccontact\"]")
	WebElement doccontactno;

	@FindBy(xpath = "//input[@id=\"docemail\"]")
	WebElement docemail;

	@FindBy(xpath = "//input[@name=\"npass\"]")
	WebElement docpassword;

	@FindBy(xpath = "//input[@name=\"cfpass\"]")
	WebElement docconfpassword;

	@FindBy(xpath = "//button[@id=\"submit\"]")
	WebElement docsubmitbtn;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getSelectspeci() {
		return selectspeci;
	}

	public WebElement getDoctorname() {
		return doctorname;
	}

	public WebElement getClinicaddress() {
		return clinicaddress;
	}

	public WebElement getConsultfee() {
		return consultfee;
	}

	public WebElement getDoccontactno() {
		return doccontactno;
	}

	public WebElement getDocemail() {
		return docemail;
	}

	public WebElement getDocpassword() {
		return docpassword;
	}

	public WebElement getDocconfpassword() {
		return docconfpassword;
	}

	public WebElement getDocsubmitbtn() {
		return docsubmitbtn;
	}
}
