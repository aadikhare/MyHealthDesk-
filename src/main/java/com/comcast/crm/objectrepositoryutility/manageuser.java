package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class manageuser {

	WebDriver driver;

	public manageuser(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href=\"manage-users.php?id=4&del=delete\"]")
	WebElement mnguserdelete;
	
	@FindBy(xpath = "//a[@href=\"manage-users.php?id=7&del=delete\"]")
	WebElement totaluserdelete;

	public WebElement getTotaluserdelete() {
		return totaluserdelete;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getMnguserdelete() {
		return mnguserdelete;
	}

}
