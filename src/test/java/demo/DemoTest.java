package demo;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.comcast.crm.basetest.BaseClass;
import com.comcast.crm.objectrepositoryutility.DoctorDashboardPage;
import com.comcast.crm.objectrepositoryutility.DoctorLoginPage;
import com.comcast.crm.objectrepositoryutility.HomePage;
import com.comcast.crm.objectrepositoryutility.PatientLoginPage;
import com.comcast.crm.objectrepositoryutility.PatientPasswordRecoveryPage;


public class DemoTest extends BaseClass {
	
	
	
	@Test 
	public void ValidURLTest() throws Exception  {
		
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
	
	/* PATIENT MODULE */
	
	@Test
		public void patientLoginBtnTest() throws Exception  {
		
		wlib.scrollByAmount(driver, 0, 700);
		homepage.getPatientLoginBtn().click();
		wlib.moveControlToWindow(driver, "user-login");
		driver.close();
		wlib.moveControlToWindow(driver, "logins");
		
		
	}
	@Test
	public void patientUsernameTest() throws Exception  {
		homepage.getLoginsLink().click();
		wlib.scrollByAmount(driver, 0, 200);
		homepage.getPatientLoginBtn().click();
		wlib.moveControlToWindow(driver, "user-login");
		patientLoginPage.getUsername().sendKeys("");
		driver.close();
	wlib.moveControlToWindow(driver, "logins");
	}
	@Test
	public void patientPasswordTest() throws Exception  {
		homepage.getLoginsLink().click();
		wlib.scrollByAmount(driver, 0, 200);
		homepage.getPatientLoginBtn().click();
		wlib.moveControlToWindow(driver, "user-login");
		patientLoginPage.getPassword().sendKeys("");
		driver.close();
	wlib.moveControlToWindow(driver, "logins");
		
	}
	
	@Test
	public void patientPageLoginBtnTest() throws Exception  {
		
	
		 homepage.getLoginsLink().click();
		  wlib.scrollByAmount(driver, 0, 200);
		  homepage.getPatientLoginBtn().click();
		  wlib.moveControlToWindow(driver,"user-login"); 
		  
		  patientLoginPage.getLoginBtn().click();
		  driver.close();
		  wlib.moveControlToWindow(driver, "logins");
	
	
}
	
	@Test
	public void patientForgotPasswordLinkTest() throws Exception  {
		
	
		homepage.getLoginsLink().click();
		  wlib.scrollByAmount(driver, 0, 200);
		  homepage.getPatientLoginBtn().click();
		  wlib.moveControlToWindow(driver,"user-login"); 
		  
		  patientLoginPage.getForgotPasswordLink().click();
		  driver.close();
		  wlib.moveControlToWindow(driver, "logins");		
}
	
	@Test
	public void patientLoginTest() throws Exception  {
		
	
		homepage.getLoginsLink().click();
		  wlib.scrollByAmount(driver, 0, 200);
		  homepage.getPatientLoginBtn().click();
		  wlib.moveControlToWindow(driver,"user-login"); 
		  
		  patientLoginPage.PatientLogin();
		  driver.close();
		  wlib.moveControlToWindow(driver, "logins");		
}
	
	@Test
	public void patientLogoutTest() throws Exception {
	homepage.getLoginsLink().click();
	wlib.scrollByAmount(driver, 0, 200);
	homepage.getPatientLoginBtn().click();
	wlib.moveControlToWindow(driver,"user-login");
	patientLoginPage.PatientLogin();
	userDashboardPage.Patientlogout();
	driver.close();
	wlib.moveControlToWindow(driver, "logins");


	}
	
//	@Test
//	public void userqueryTest() throws Exception {
//	homepage.getEnterNameTextField().sendKeys("abc");
//    homepage.getEmailAddress().sendKeys("abc@123");
//    homepage.getMobileNumber().sendKeys("9876543210");
//    homepage.getEnterMessage().sendKeys("NA");
//    wlib.scrollByAmount(driver,0,200);
//    homepage.getSendMessageBtn().click();
//    Thread.sleep(2000);
//    wlib.switchToAlert(driver);
//    wlib.moveControlToWindow(driver,"index");
//    homepage.getLoginsLink().click();
//    wlib.scrollByAmount(driver, 0, 200);
//   homepage.getAdminLoginBtn().click();
//   wlib.moveControlToWindow(driver,"Admin");
//    adminLoginPage.adminLogin();
    
    
    
	//}
	
	@Test
	public void patientupdateProfileTest() throws Exception {
	homepage.getLoginsLink().click();
	wlib.scrollByAmount(driver, 0, 200);
	homepage.getPatientLoginBtn().click();
	wlib.moveControlToWindow(driver,"user-login");
	patientLoginPage.PatientLogin();
	userDashboardPage.getUpdateProfileLink().click();
	userEditProfile.getAddress().clear();
	userEditProfile.getAddress().sendKeys("pune");
	wlib.scrollByAmount(driver, 0, 400);
	userEditProfile.getUpdateBtn().click();
	userDashboardPage.getDashbordLink().click();
	userDashboardPage.getUpdateProfileLink().click();
	Assert.assertTrue(userEditProfile.getAddress().getText().contains("pune"));
	
	userDashboardPage.Patientlogout();
	driver.close();
	wlib.moveControlToWindow(driver, "logins");


	}
	
	@Test
	public void patientupdategenderProfileTest() throws Exception {
	homepage.getLoginsLink().click();
	wlib.scrollByAmount(driver, 0, 200);
	homepage.getPatientLoginBtn().click();
	wlib.moveControlToWindow(driver,"user-login");
	patientLoginPage.PatientLogin();
	userDashboardPage.getUpdateProfileLink().click();
	WebElement we=userEditProfile.getGender();
	wlib.scrollByAmount(driver, 0, 400);
	wlib.selectOptions(we,"Male");
	userEditProfile.getUpdateBtn().click();
	userDashboardPage.getDashbordLink().click();
	userDashboardPage.getUpdateProfileLink().click();
	Assert.assertTrue(userEditProfile.getGender().getText().contains("Male"));
	userDashboardPage.Patientlogout();
	driver.close();
	wlib.moveControlToWindow(driver, "logins");


	}
	
	@Test
	public void createuserAndDeleteUserTest() throws Exception {
	homepage.getLoginsLink().click();
	wlib.scrollByAmount(driver, 0, 200);
	homepage.getPatientLoginBtn().click();
	wlib.moveControlToWindow(driver,"user-login");
	patientLoginPage.getCreateAnAccount().click();
	wlib.moveControlToWindow(driver,"Registration");
	patientRegistrationPage.getFullname().sendKeys("Patient11");
	patientRegistrationPage.getAddress().sendKeys("mumbai");
	patientRegistrationPage.getCity().sendKeys("mumbai");
	patientRegistrationPage.getMaleBtn().click();
	patientRegistrationPage.getEmail().sendKeys("Patient11@123456");
	patientRegistrationPage.getPassword().sendKeys("Test@12345");
	patientRegistrationPage.getPassword_again().sendKeys("Test@12345");
	wlib.scrollByAmount(driver,0, 200);
	patientRegistrationPage.getSubmitBtn().click();
	wlib.switchToAlert(driver);
	driver.close();
	wlib.moveControlToWindow(driver, "logins");
	homepage.getLoginsLink().click();
	homepage.getPatientLoginBtn().click();
	wlib.moveControlToWindow(driver, "user-login");
	patientLoginPage.getUsername().sendKeys("Patient11@123456");
	patientLoginPage.getPassword().sendKeys("Test@12345");
	patientLoginPage.getLoginBtn().click();
	wlib.moveControlToWindow(driver, "dashboard");
    userDashboardPage.Patientlogout();
    driver.close();
    wlib.moveControlToWindow(driver, "user-login");
    homepage.getLoginsLink().click();
    homepage.getAdminLoginBtn().click();
    wlib.moveControlToWindow(driver, "Admin");
    adminLoginPage.adminLogin();
    wlib.moveControlToWindow(driver, "dashboard");
    admindashboard.getUsers().click();
    admindashboard.getManageusers().click();
    wlib.scrollByAmount(driver, 0, 500);
    manageuserPage.getDeleteNewUser().click();
    wlib.switchToAlert(driver);
   driver.close();
   wlib.moveControlToWindow(driver, "logins");
    
	}
	
	
	
	/* DOCTOR MODULE */
	
	@Test
	public void doctorLoginBtnTest() throws Exception  {
	
	wlib.scrollByAmount(driver, 0, 700);
	homepage.getDoctorLoginBtn().click();
	wlib.moveControlToWindow(driver, "Doctor");
	driver.close();
	wlib.moveControlToWindow(driver, "logins");
	
	
}
	
	
	
@Test
public void doctorUsernameTest() throws Exception  {
	homepage.getLoginsLink().click();
	wlib.scrollByAmount(driver, 0, 200);
	homepage.getDoctorLoginBtn().click();
	wlib.moveControlToWindow(driver, "Doctor");
	doctorLoginPage.getUsername().sendKeys("");
	driver.close();
	wlib.moveControlToWindow(driver, "logins");
}
@Test
public void doctorPasswordTest() throws Exception  {
	homepage.getLoginsLink().click();
	wlib.scrollByAmount(driver, 0, 200);
	homepage.getDoctorLoginBtn().click();
	System.out.println(driver.getTitle());
	wlib.moveControlToWindow(driver, "Doctor");
	System.out.println(driver.getTitle());
	doctorLoginPage.getPassword().sendKeys("");
	driver.close();
	wlib.moveControlToWindow(driver, "logins");
	
}

@Test
  public void doctorPageLoginBtnTest() throws Exception {
  homepage.getLoginsLink().click();
  wlib.scrollByAmount(driver, 0, 200);
  homepage.getDoctorLoginBtn().click();
  wlib.moveControlToWindow(driver,"Doctor"); 
  
  doctorLoginPage.getLoginBtn().click(); driver.close();
  wlib.moveControlToWindow(driver, "logins");
  
  }

@Test
public void doctorForgotPasswordLinkTest() throws Exception {
homepage.getLoginsLink().click();
wlib.scrollByAmount(driver, 0, 200);
homepage.getDoctorLoginBtn().click();
wlib.moveControlToWindow(driver,"Doctor"); 

doctorLoginPage.getForgotPasswordLink().click();
driver.close();
wlib.moveControlToWindow(driver, "logins");

}
 
@Test
public void doctorLoginTest() throws Exception {
homepage.getLoginsLink().click();
wlib.scrollByAmount(driver, 0, 200);
homepage.getDoctorLoginBtn().click();
wlib.moveControlToWindow(driver,"Doctor");
doctorLoginPage.doctorLogin();
driver.close();
wlib.moveControlToWindow(driver, "logins");


}

//@Test
//public void doctorLogoutTest() throws Exception {
//homepage.getLoginsLink().click();
//wlib.scrollByAmount(driver, 0, 200);
//homepage.getDoctorLoginBtn().click();
//wlib.moveControlToWindow(driver,"Doctor");
//doctorLoginPage.doctorLogin();
//doctorDashboardPage.doctorlogout();
//driver.close();
//wlib.moveControlToWindow(driver, "logins");
//
//
//}

//@Test
//public void doctorprofileUpdateLinkTest() throws Exception {
//homepage.getLoginsLink().click();
//wlib.scrollByAmount(driver, 0, 200);
//homepage.getDoctorLoginBtn().click();
//wlib.moveControlToWindow(driver,"Doctor");
//doctorLoginPage.doctorLogin();
//Thread.sleep(4000);
//wlib.switchToAlert(driver);
//doctorDashboardPage.getUpdateProfileLink().click();
//doctorDashboardPage.doctorlogout();
//driver.close();
//wlib.moveControlToWindow(driver, "logins");
//
//
//}

//@Test
//public void Test() throws Exception {
//	
//homepage.getLoginsLink().click();
//wlib.scrollByAmount(driver, 0, 200);
//homepage.getDoctorLoginBtn().click();
//wlib.moveControlToWindow(driver,"Doctor");
//doctorLoginPage.doctorLogin();
////Thread.sleep(4000);
////wlib.switchToAlert(driver);
//doctorDashboardPage.getUpdateProfileLink().click();
//
//
//doctorDashboardPage.doctorlogout();
//driver.close();
//wlib.moveControlToWindow(driver, "logins");
//

}







	
//		
		
//		
		
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
		
		
		
		
		
		
		
		
		
		


	

