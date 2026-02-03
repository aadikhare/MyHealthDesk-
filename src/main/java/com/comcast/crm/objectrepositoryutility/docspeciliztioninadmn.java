package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class docspeciliztioninadmn {

	WebDriver driver;

	public docspeciliztioninadmn(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@class=\"form-control\"]")
	WebElement docspesearch;

	@FindBy(xpath = "//button[@class=\"btn btn-o btn-primary\"]")
	WebElement docspesearchbtn;

	@FindBy(xpath = "//a[@href=\"edit-doctor-specialization.php?id=1\"]")
	WebElement editicon;

	@FindBy(xpath = "//a[@href=\"doctor-specilization.php?id=1&del=delete\"]")
	WebElement deleteicon;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getDocspesearch() {
		return docspesearch;
	}

	public WebElement getDocspesearchbtn() {
		return docspesearchbtn;
	}

	public WebElement getEditicon() {
		return editicon;
	}

	public WebElement getDeleteicon() {
		return deleteicon;
	}

}
