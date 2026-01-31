package demo;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.comcast.crm.basetest.BaseClass;
import com.comcast.crm.objectrepositoryutility.HomePage;
import com.comcast.crm.objectrepositoryutility.PatientLoginPage;
import com.comcast.crm.objectrepositoryutility.PatientPasswordRecoveryPage;


public class DemoTest extends BaseClass {
	
	
	
	@Test 
	public void ValidURLTest() throws Exception  {
		System.out.println("hellow");
		
	}
	 
	@Test 
	public void ServicesLinkTest() throws Exception  {
	
	homepage.getServices().click();
	}
	
	@Test 
	public void AboutUsLinkTest() throws Exception  {
	homepage.getAboutUsLink().click();
	}
	
	@Test 
	public void GalleryLinkTest() throws Exception  {
    homepage.getGalleryLink().click();
	}
	@Test
	public void ContactUsLinkTest() throws Exception  {
    homepage.getContactUsLink().click();
	}
	@Test
    public void LoginsLinkTest() throws Exception  {
		homepage.getLoginsLink().click();
}
	@Test
		public void BookAnAppointmentBtnTest() throws Exception  {
		homepage.getBookAnAppointmentBtn().click();
		}
	@Test
		public void PatientLoginBtnTest() throws Exception  {
		
		wlib.scrollByAmount(driver, 0, 700);
		homepage.getPatientLoginBtn().click();
		wlib.moveControlToWindow(driver, "user-login");
		driver.close();
		wlib.moveControlToWindow(driver, "logins");
		
		
	}
	@Test
	public void UsernameTest() throws Exception  {
		homepage.getLoginsLink().click();
		wlib.scrollByAmount(driver, 0, 200);
		homepage.getPatientLoginBtn().click();
		wlib.moveControlToWindow(driver, "user-login");
		patientLoginPage.getUsername().sendKeys("");
		driver.close();
		wlib.moveControlToWindow(driver, "logins");
	}
	@Test
	public void PasswordTest() throws Exception  {
		homepage.getLoginsLink().click();
		wlib.scrollByAmount(driver, 0, 200);
		homepage.getPatientLoginBtn().click();
		wlib.moveControlToWindow(driver, "user-login");
		patientLoginPage.getPassword().sendKeys("");
		driver.close();
		wlib.moveControlToWindow(driver, "logins");
		
	}
	
	@Test
	public void BtnsubmitTest() throws Exception  {
		homepage.getLoginsLink().click();
		wlib.scrollByAmount(driver, 0, 200);
		homepage.getPatientLoginBtn().click();
		wlib.moveControlToWindow(driver, "user-login");
		patientLoginPage.getBtnsubmit().click();
		driver.close();
		wlib.moveControlToWindow(driver, "logins");
		
	}
//		
//		
		
//		//homepage.getDoctorLoginBtn().click();
		//homepage.getAdminLoginBtn().click();
//		homepage.getEnterNameTextField().sendKeys("abc");
//		homepage.getEmailAddress().sendKeys("abc@123");
//		homepage.getMobileNumber().sendKeys("9876543210");
//		homepage.getEnterMessage().sendKeys("NA");
//		wlib.scrollByAmount(driver,0,200);
//		homepage.getSendMessageBtn().click();
//		
//		wlib.moveControlToWindow(driver, "user-login");
//		
//		patientLoginPage.getForgotPasswordLink().click();
//		
//		PatientPasswordRecoveryPage patientPasswordRecoverypage = new PatientPasswordRecoveryPage(driver);
//		
//		wlib.moveControlToWindow(driver, "forgot-password");
//		
//		patientPasswordRecoverypage.getFullname().sendKeys("");
//		patientPasswordRecoverypage.getEmail().sendKeys("");
//		patientPasswordRecoverypage.getSubmitBtn().click();
//		wlib.switchToAlert(driver);
//		patientPasswordRecoverypage.getLogIn().click();
		
		
		
		
		
		
		
		
		
		
	}


