package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class aboutuspage {

	WebDriver driver;

	public aboutuspage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id=\"pagetitle\"]")
	WebElement aboutpagetitle;

	@FindBy(xpath = "//li[@style=\"text-align: left;\"]/parent::ul")
	WebElement aboutpagediscription;

	@FindBy(xpath = "//button[@name=\"submit\"]")
	WebElement aboutsubmitbtn;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getAboutpagetitle() {
		return aboutpagetitle;
	}

	public WebElement getAboutpagediscription() {
		return aboutpagediscription;
	}

	public WebElement getAboutsubmitbtn() {
		return aboutsubmitbtn;
	}

}
