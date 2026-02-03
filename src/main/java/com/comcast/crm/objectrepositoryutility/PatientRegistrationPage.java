package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PatientRegistrationPage {

	WebDriver driver;

	public PatientRegistrationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name='full_name']")
	private WebElement Fullname;

	@FindBy(xpath = "//input[@name='address']")
	private WebElement Address;

	@FindBy(xpath = "//input[@name='city']")
	private WebElement City;

	@FindBy(xpath = "//input[@value='female']")
	private WebElement FemaleBtn;
	
	//@FindBy(xpath = "//input[@value='male']")
	@FindBy(xpath = "//label[@for='rg-male']")
	private WebElement MaleBtn;
	
	@FindBy(xpath = "//input[@name='email']")
	private WebElement Email;
	
	@FindBy(xpath = "//input[@name='password']")
	private WebElement Password;
	
	@FindBy(xpath = "//input[@name='password_again']")
	private WebElement Password_again;
	
	
	@FindBy(xpath = "//button[@name='submit']")
	private WebElement SubmitBtn;

	public WebElement getFullname() {
		return Fullname;
	}


	public WebElement getAddress() {
		return Address;
	}


	public WebElement getCity() {
		return City;
	}


	public WebElement getFemaleBtn() {
		return FemaleBtn;
	}


	public WebElement getMaleBtn() {
		return MaleBtn;
	}


	public WebElement getEmail() {
		return Email;
	}


	public WebElement getPassword() {
		return Password;
	}


	public WebElement getPassword_again() {
		return Password_again;
	}


	public WebElement getSubmitBtn() {
		return SubmitBtn;
	}
	
	
	
	
	
	
	
}
