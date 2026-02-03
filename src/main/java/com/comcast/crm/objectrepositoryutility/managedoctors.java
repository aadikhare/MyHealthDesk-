package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class managedoctors {

	WebDriver driver;

	public managedoctors(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href=\"edit-doctor.php?id=1\"]")
	WebElement managedocedit;

	@FindBy(xpath = "//a[@href=\"manage-doctors.php?id=1&del=delete\"]")
	WebElement managedocdelete;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getManagedocedit() {
		return managedocedit;
	}

	public WebElement getManagedocdelete() {
		return managedocdelete;
	}

}
