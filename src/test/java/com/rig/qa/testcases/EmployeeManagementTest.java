package com.rig.qa.testcases;

import org.apache.poi.ss.usermodel.Sheet;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.rig.qa.base.TestBase;
import com.rig.qa.pages.EmployeeManagement;
import com.rig.qa.pages.HRManagement;
import com.rig.qa.pages.HomePage;
import com.rig.qa.pages.LoginPage;
import com.rig.qa.util.TestUtil;

public class EmployeeManagementTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	Sheet EmployeeSheet;
	HRManagement hrManagement;
	EmployeeManagement employeeManagement;
	TestUtil testUtil; 
	String SheetName = "EmployeeSheet";
	public EmployeeManagementTest() {
		super();
	}
	
	@BeforeMethod
	public void SetUp() throws InterruptedException {
		initialization();
		testUtil = new TestUtil();
		hrManagement = new HRManagement();
		employeeManagement = new EmployeeManagement();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("EmployeeId"), prop.getProperty("Password"));
		hrManagement = homePage.ClickOnHRManagement();
		hrManagement.ClickOnEmployeeManagement();
	}
	
	
	@DataProvider
	public Object[][] getRigTestData() {
		Object data[][] = TestUtil.getTestData(SheetName);
		return data;
	}
	
	@Test(dataProvider="getRigTestData")
	public void AddEmployeeTest(String FirstName, String LastName, String DateOfBirth, String JoiningDate, String Gender, String Email, String Mobile, String AdharCardNo,
			String PanCardNo, String BloodGroup, String Department, String JobRole, String MaritalStatus, String Address,
			String City, String State, String PinCode) throws InterruptedException {
		employeeManagement.CreateNewEmployee(FirstName, LastName, DateOfBirth, JoiningDate, Gender, Email, Mobile, AdharCardNo,
				PanCardNo, BloodGroup, Department, JobRole, MaritalStatus, Address, City, State, PinCode);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
	

}
