package com.comcast.crm.basetest;
import org.openqa.selenium.WebDriver;



import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.comcast.crm.basetest.BaseClass;
import com.comcast.crm.generic.fileutility.ExcelUtility;
import com.comcast.crm.generic.fileutility.FileUtility;
import com.comcast.crm.generic.webDriverUtility.JavaUtility;
import com.comcast.crm.generic.webDriverUtility.WebDriverUtility;
import com.comcast.crm.objectrepositoryutility.DoctorDashboardPage;
import com.comcast.crm.objectrepositoryutility.DoctorLoginPage;
import com.comcast.crm.objectrepositoryutility.HomePage;
import com.comcast.crm.objectrepositoryutility.PatientLoginPage;
import com.comcast.crm.objectrepositoryutility.UserDashboardPage;
import com.comcast.crm.objectrepositoryutility.UserEditProfile;

import java.io.IOException;





import com.comcast.crm.generic.databaseutility.DatabaseUtility;


public class BaseClass {
	public FileUtility fLib = new FileUtility();
	public ExcelUtility eLib = new ExcelUtility();
	public WebDriverUtility wlib = new WebDriverUtility();
	public JavaUtility javaLib =new JavaUtility();
	public WebDriver driver;
	public int randomNum=javaLib.getRandomNumber();
	public HomePage homepage;
	public PatientLoginPage patientLoginPage;
	public DoctorLoginPage doctorLoginPage;
	public DoctorDashboardPage doctorDashboardPage;
	public UserDashboardPage userDashboardPage;
	public UserEditProfile userEditProfile;
	public DatabaseUtility dbLib = new DatabaseUtility();
	
	
	
	@BeforeSuite
	public void configBS() {
		
		
		//dbLib.getDbConnection("DBURL", "UN", "PASSWD");
	}
	
	@BeforeClass
	public void configBC() throws IOException {
		
		String BROWSER=fLib.getDataFromProperyFile("browser");
		
		
		
	
	    driver=wlib.openWebBrowser(driver,BROWSER);
	   // System.out.println(driver);
	    driver.manage().window().maximize();
	   
	
	}
	
	@BeforeMethod
	public void configBM() throws Exception {
		String URL = fLib.getDataFromProperyFile("url");
		 driver.get(URL);
		    wlib.waitForPageToLoad(driver);
	 homepage = new HomePage(driver);
	 patientLoginPage = new PatientLoginPage(driver);
	 doctorLoginPage=new DoctorLoginPage(driver);
	 doctorDashboardPage = new DoctorDashboardPage(driver);
	 userDashboardPage = new UserDashboardPage(driver);
	 userEditProfile =new UserEditProfile(driver);
		
	}
	
	@AfterMethod
	public void configAM()
	{
		
		
	}
	
	
	@AfterClass
	public void configAC() {
	//driver.quit();
	}
	@AfterSuite
	public void configAS() {
		
		}
	}

