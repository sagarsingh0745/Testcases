package com.rig.qa.testcases;

import org.apache.poi.ss.usermodel.Sheet;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.rig.qa.base.TestBase;
import com.rig.qa.pages.ClassManagement;
import com.rig.qa.pages.HomePage;
import com.rig.qa.pages.LoginPage;
import com.rig.qa.pages.SchoolOperation;
import com.rig.qa.util.TestUtil;

public class ClassManagementTest extends TestBase{

	LoginPage loginPage;
	HomePage homePage;
	Sheet AddClassManage;
	SchoolOperation schoolOperation;
	ClassManagement classManagement;
    TestUtil testUtil; 
	String SheetName = "AddClassManage";
    public ClassManagementTest() {
		super();
	}
	
	
	
	@BeforeMethod
	public void SetUp() throws InterruptedException {
		initialization();
		testUtil = new TestUtil();
		schoolOperation = new SchoolOperation();
		classManagement = new ClassManagement();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("EmployeeId"), prop.getProperty("Password"));
		schoolOperation = homePage.ClickOnSchool();
		 schoolOperation.ClickOnClassManagement();
		 
	}
	
	@DataProvider
	public Object[][] getRigTestData() {
		Object data[][] = TestUtil.getTestData(SheetName);
		return data;
	}
	
	
	

	@Test(dataProvider="getRigTestData")
	public void CreateNewClassTest(String SelectGrade, String ClassName, String Section, String SelectSupervisor, String SelectSupervisorSubject, String SelectSubSupervisor, String SelectSubSupervisorSubject, String SelectRoomNumber) throws InterruptedException {
		classManagement.AddClassManagement(SelectGrade, ClassName, Section, SelectSupervisor, SelectSupervisorSubject, SelectSubSupervisor, SelectSubSupervisorSubject, SelectRoomNumber);
		
	
		}
	
	

	
	
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}	
	
	
	
	
}
