package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class managepatient {

	WebDriver driver;

	public managepatient(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href=\"view-patient.php?viewid=1\"]")
	WebElement eyeicon;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getEyeicon() {
		return eyeicon;
	}

	

}
