package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class mngunreadquerie {

	WebDriver driver;

	public mngunreadquerie(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href=\"query-details.php?id=3\"]")
	WebElement fileiconbtn;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getFileiconbtn() {
		return fileiconbtn;
	}

}
