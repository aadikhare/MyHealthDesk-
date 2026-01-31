package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class admindashboard {

	WebDriver driver;
	
	public  admindashboard(WebDriver driver) 
	{
	this.driver=driver;
	PageFactory.initElements(driver, this);		
	}
	
	
	@FindBy(xpath = "//a[@class=\"dropdown-toggle\"]")
	WebElement Admin;
	
	@FindBy(xpath = "//a[@class=\"dropdown-toggle\"]")
	WebElement Admin1;
	
	
	
	
	
	
	
	
	
	@FindBy(xpath = "//a[@href=\"manage-users.php\"]/parent::p[@class=\"links cl-effect-1\"]")
	WebElement totalUsers;
	
	@FindBy(xpath = "//a[@href=\"manage-doctors.php\"]/parent::p[@class=\"cl-effect-1\"]")
	WebElement totaldoctors;
	
	@FindBy(xpath = "//a[@href=\"appointment-history.php\"]/parent::p[@class=\"links cl-effect-1\"]")
	WebElement totalappointments;
	
	@FindBy(xpath = "//a[@href=\"manage-patient.php\"]/parent::p[@class=\"links cl-effect-1\"]")
	WebElement totalpatients;
	
	@FindBy(xpath = "//a[@href=\"unread-queries.php\"]/parent::p[@class=\"links cl-effect-1\"]")
	WebElement totalnewqueries;
	
	
	/* Element in Mani Navigation*/
	 
	  /*Doctors */
	
	
	@FindBy(xpath = "//span[text()=\" Dashboard \"]")
	WebElement dshboard;
	
	@FindBy(xpath = "//span[text()=\" Doctors \"]")
	WebElement doctors;
	
	@FindBy(xpath = "//span[text()=\" Doctor Specialization \"]")
	WebElement doctorspecialization;
	
	@FindBy(xpath = "//span[text()=\" Add Doctor\"]")
	WebElement adddoctor;
	
	@FindBy(xpath = "//span[text()=\" Manage Doctors \"]")
	WebElement managedoctor;
	
	/* Element in Mani Navigation*/
	 
	  /*Users */
	
	@FindBy(xpath = "//span[text()=\" Users \"]")
	WebElement users;
	
	@FindBy(xpath = "//span[text()=\" Manage Users \"]")
	WebElement manageusers;
	
	/* Element in Mani Navigation*/
	  /* Patients */
	
	@FindBy(xpath = "//span[text()=\" Patients \"]")
	WebElement patients;
	
	@FindBy(xpath = "//span[text()=\" Manage Patients \"]")
	WebElement managepatients;
	
	/* Element in Mani Navigation*/
	  /* Appointment History */
	
	@FindBy(xpath = "//span[text()=\" Appointment History \"]")
	WebElement appointmenthistory;
	
	/* Element in Mani Navigation*/
	  /* Conatctus Queries */
	
	@FindBy(xpath = "//span[text()=\" Conatctus Queries \"]")
	WebElement conatctusqueries;
	
	@FindBy(xpath = "//span[text()=\" Unread Query \"]")
	WebElement unreadqueries;
	
	@FindBy(xpath = "//span[text()=\" Read Query \"]")
	WebElement readqueries;
	
	/* Element in Mani Navigation*/
	  /* Doctor Session Logs */
	
	@FindBy(xpath = "//span[text()=\" Doctor Session Logs \"]")
	WebElement doctorsessionlogs;
	
	/* Element in Mani Navigation*/
	  /* User Session Logs */
	
	@FindBy(xpath = "//span[text()=\" User Session Logs \"]")
	WebElement usersessionlogs;
	
	/* Element in Mani Navigation*/
	  /* Reports */
	
	@FindBy(xpath = "//span[text()=\" Reports \"]")
	WebElement reports;
	
	@FindBy(xpath = "//span[text()=\"B/w dates reports \"]")
	WebElement bwdatesreports;
	
	/* Element in Mani Navigation*/
	  /* Pages */
	
	@FindBy(xpath = "//span[text()=\" Pages \"]")
	WebElement pages;
	
	@FindBy(xpath = "//span[text()=\"About Us \"]")
	WebElement aboutus;
	
	@FindBy(xpath = "//span[text()=\"Cotnact Us \"]")
	WebElement contactus;
	
	/* Element in Mani Navigation*/
	  /* Patient search */
	
	@FindBy(xpath = "//span[text()=\" Patient Search \"]")
	WebElement patientsearch;
	
}
