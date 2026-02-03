package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class contactuspage {

	WebDriver driver;

	public contactuspage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id=\"pagetitle\"]")
	WebElement contactpagetitle;

	@FindBy(xpath = "//div[@class=\" nicEdit-main  \"]")
	WebElement contactpagediscription;

	@FindBy(xpath = "//input[@name=\"email\"]")
	WebElement contactemail;

	@FindBy(xpath = "//input[@name=\"mobnum\"]")
	WebElement contactmobileno;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getContactpagetitle() {
		return contactpagetitle;
	}

	public WebElement getContactpagediscription() {
		return contactpagediscription;
	}

	public WebElement getContactemail() {
		return contactemail;
	}

	public WebElement getContactmobileno() {
		return contactmobileno;
	}

}
