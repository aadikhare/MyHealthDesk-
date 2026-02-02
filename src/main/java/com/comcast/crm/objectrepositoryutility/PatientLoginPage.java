package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PatientLoginPage {

	WebDriver driver;

	public PatientLoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name='username']")
	private WebElement Username;

	@FindBy(xpath = "//input[@name='password']")
	private WebElement Password;

	@FindBy(xpath = "//button[@name='submit']")
	private WebElement LoginBtn;

	@FindBy(xpath = "//a[contains(text(),'Forgot Password ?')]")
	private WebElement ForgotPasswordLink;
	
	
	

	public WebElement getUsername() {
		return Username;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getLoginBtn() {
		return LoginBtn;
	}

	public WebElement getForgotPasswordLink() {
		return ForgotPasswordLink;
	}

	public void PatientLogin() {
		Username.sendKeys("adminab@test.com");
		Password.sendKeys("Test@12345");
		LoginBtn.click();
	}
	
	
	
}
