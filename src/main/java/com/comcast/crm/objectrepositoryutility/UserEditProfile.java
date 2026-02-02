package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserEditProfile {
	WebDriver driver;
	public UserEditProfile(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//input[@name='fname']")
	private WebElement UserName;
	
	@FindBy(xpath="//textarea[@name='address']")
	private WebElement Address ;
	
	@FindBy(xpath="//input[@name='city']")
	private WebElement City;
	
	@FindBy(xpath="//select[@name='gender']")
	private WebElement gender;
	
	@FindBy(xpath="//input[@name='uemail']")
	private WebElement email;
	
	@FindBy(xpath="//button[@name='submit']")
	private WebElement UpdateBtn;
	
	
	public WebElement getUpdateBtn() {
		return UpdateBtn;
	}

	public WebElement getUserName() {
		return UserName;
	}

	public WebElement getAddress() {
		return Address;
	}

	public WebElement getCity() {
		return City;
	}

	public WebElement getGender() {
		return gender;
	}

	public WebElement getEmail() {
		return email;
	}
	
	
	
	}