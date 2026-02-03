package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class mngqueriedetails {

	WebDriver driver;

	public mngqueriedetails(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//textarea[@name=\"adminremark\"]")
	WebElement textarea;

	@FindBy(xpath = "//button[@class=\"btn btn-primary pull-left\"]")
	WebElement updatebtn;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getTextarea() {
		return textarea;
	}

	public WebElement getUpdatebtn() {
		return updatebtn;
	}

}
