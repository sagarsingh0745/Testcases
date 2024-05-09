package com.rig.qa.testcases;

import org.apache.poi.ss.usermodel.Sheet;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.rig.qa.base.TestBase;
import com.rig.qa.pages.GradeManagement;
import com.rig.qa.pages.HomePage;
import com.rig.qa.pages.LoginPage;
import com.rig.qa.pages.SchoolOperation;
import com.rig.qa.util.TestUtil;

public class GradeManagementTest extends TestBase{

	
	
	LoginPage loginPage;
	HomePage homePage;
	Sheet RoomCreateSheet;
	SchoolOperation schoolOperation;
	GradeManagement gradeManagement;
    TestUtil testUtil; 
	String SheetName = "GradeManagement";
    public GradeManagementTest() {
		super();
	}
	
	
	@BeforeMethod
	public void SetUp() throws InterruptedException {
		initialization();
		testUtil = new TestUtil();
		schoolOperation = new SchoolOperation();
		gradeManagement = new GradeManagement();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("EmployeeId"), prop.getProperty("Password"));
		schoolOperation = homePage.ClickOnSchool();
		 schoolOperation.ClickOnGreadManagement();
		 
	}
	
	
	@DataProvider
	public Object[][] getRigTestData() {
		Object data[][] = TestUtil.getTestData(SheetName);
		return data;
	}
	
	
	@Test(dataProvider="getRigTestData")
	public void AddGradeManagementTest(String GradeName, String Sequence ) {
		gradeManagement.ClickOnAddGrade(GradeName, Sequence);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
