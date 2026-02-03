package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class mngreadquerie {

	WebDriver driver;

	public mngreadquerie(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href=\"query-details.php?id=1\"]")
	WebElement refileiconbtn;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getRefileiconbtn() {
		return refileiconbtn;
	}

}
