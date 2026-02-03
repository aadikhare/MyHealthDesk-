package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class admindashboard {

	WebDriver driver;

	public admindashboard(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/* Element on Admin */

	@FindBy(xpath = "//a[@class=\"dropdown-toggle\"]")
	WebElement Admin;

	@FindBy(xpath = "//a[contains(text(),\"Change Password\")]")
	WebElement changepassword;

	@FindBy(xpath = "//a[contains(text(),\"Log Out\")]")
	WebElement logout;

	/* Element on Admin Dashboard */

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

	/* Element in Main Navigation */
	/* Doctors */

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

	/* Element in Main Navigation */
	/* Users */

	@FindBy(xpath = "//span[text()=\" Users \"]")
	WebElement users;

	@FindBy(xpath = "//span[text()=\" Manage Users \"]")
	WebElement manageusers;

	/* Element in Main Navigation */
	/* Patients */

	@FindBy(xpath = "//span[text()=\" Patients \"]")
	WebElement patients;

	@FindBy(xpath = "//span[text()=\" Manage Patients \"]")
	WebElement managepatients;

	/* Element in Main Navigation */
	/* Appointment History */

	@FindBy(xpath = "//span[text()=\" Appointment History \"]")
	WebElement appointmenthistory;

	/* Element in Main Navigation */
	/* Conatctus Queries */

	@FindBy(xpath = "//span[text()=\" Conatctus Queries \"]")
	WebElement conatctusqueries;

	@FindBy(xpath = "//span[text()=\" Unread Query \"]")
	WebElement unreadqueries;

	@FindBy(xpath = "//span[text()=\" Read Query \"]")
	WebElement readqueries;

	/* Element in Main Navigation */
	/* Doctor Session Logs */

	@FindBy(xpath = "//span[text()=\" Doctor Session Logs \"]")
	WebElement doctorsessionlogs;

	/* Element in Main Navigation */
	/* User Session Logs */

	@FindBy(xpath = "//span[text()=\" User Session Logs \"]")
	WebElement usersessionlogs;

	/* Element in Main Navigation */
	/* Reports */

	@FindBy(xpath = "//span[text()=\" Reports \"]")
	WebElement reports;

	@FindBy(xpath = "//span[text()=\"B/w dates reports \"]")
	WebElement bwdatesreports;

	/* Element in Main Navigation */
	/* Pages */

	@FindBy(xpath = "//span[text()=\" Pages \"]")
	WebElement pages;

	@FindBy(xpath = "//span[text()=\"About Us \"]")
	WebElement aboutus;

	@FindBy(xpath = "//span[text()=\"Cotnact Us \"]")
	WebElement contactus;

	/* Element in Main Navigation */
	/* Patient search */

	@FindBy(xpath = "//span[text()=\" Patient Search \"]")
	WebElement patientsearch;

	/* Element in Main Navigation */
	/* Admin account */

	@FindBy(xpath = "//a[@class=\"dropdown-toggle\"]")
	WebElement adminaccount;

	@FindBy(xpath = "//a[@href=\"change-password.php\"]")
	WebElement changepasswordad;

	@FindBy(xpath = "//a[@href=\"logout.php\"]")
	WebElement logoutadmin;

	public WebElement getAdminaccount() {
		return adminaccount;
	}

	public WebElement getChangepasswordad() {
		return changepasswordad;
	}

	public WebElement getLogoutadmin() {
		return logoutadmin;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getAdmin() {
		return Admin;
	}

	public WebElement getChangepassword() {
		return changepassword;
	}

	public WebElement getLogout() {
		return logout;
	}

	public WebElement getTotalUsers() {
		return totalUsers;
	}

	public WebElement getTotaldoctors() {
		return totaldoctors;
	}

	public WebElement getTotalappointments() {
		return totalappointments;
	}

	public WebElement getTotalpatients() {
		return totalpatients;
	}

	public WebElement getTotalnewqueries() {
		return totalnewqueries;
	}

	public WebElement getDshboard() {
		return dshboard;
	}

	public WebElement getDoctors() {
		return doctors;
	}

	public WebElement getDoctorspecialization() {
		return doctorspecialization;
	}

	public WebElement getAdddoctor() {
		return adddoctor;
	}

	public WebElement getManagedoctor() {
		return managedoctor;
	}

	public WebElement getUsers() {
		return users;
	}

	public WebElement getManageusers() {
		return manageusers;
	}

	public WebElement getPatients() {
		return patients;
	}

	public WebElement getManagepatients() {
		return managepatients;
	}

	public WebElement getAppointmenthistory() {
		return appointmenthistory;
	}

	public WebElement getConatctusqueries() {
		return conatctusqueries;
	}

	public WebElement getUnreadqueries() {
		return unreadqueries;
	}

	public WebElement getReadqueries() {
		return readqueries;
	}

	public WebElement getDoctorsessionlogs() {
		return doctorsessionlogs;
	}

	public WebElement getUsersessionlogs() {
		return usersessionlogs;
	}

	public WebElement getReports() {
		return reports;
	}

	public WebElement getBwdatesreports() {
		return bwdatesreports;
	}

	public WebElement getPages() {
		return pages;
	}

	public WebElement getAboutus() {
		return aboutus;
	}

	public WebElement getContactus() {
		return contactus;
	}

	public WebElement getPatientsearch() {
		return patientsearch;
	}

}
