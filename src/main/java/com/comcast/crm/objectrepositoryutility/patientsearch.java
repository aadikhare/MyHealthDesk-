package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class patientsearch {

	WebDriver driver;

	public patientsearch(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id=\"searchdata\"]")
	WebElement patientsearchtextbox;

	@FindBy(xpath = "//button[@id=\"submit\"]")
	WebElement patientsearchbtn;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getPatientsearchtextbox() {
		return patientsearchtextbox;
	}

	public WebElement getPatientsearchbtn() {
		return patientsearchbtn;
	}

}
