package com.rig.qa.testcases;

import org.apache.poi.ss.usermodel.Sheet;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.rig.qa.base.TestBase;
import com.rig.qa.pages.AcademicManagement;
import com.rig.qa.pages.HomePage;
import com.rig.qa.pages.LoginPage;
import com.rig.qa.pages.SubjectManagement;
import com.rig.qa.util.TestUtil;

public class SubjectManagementTest extends TestBase{
	
	
	LoginPage loginPage;
	HomePage homePage;
	Sheet SubjectManage;
	AcademicManagement academicManagement;
	SubjectManagement subjectManagement;
	TestUtil testUtil;
	String SheetName = "SubjectManage";
	
	public SubjectManagementTest() {
		super();
	}
	
	
	@BeforeMethod
	public void SetUp() throws InterruptedException {
		initialization();
		testUtil = new TestUtil();
		academicManagement = new AcademicManagement();
		subjectManagement = new SubjectManagement();
        loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("EmployeeId"), prop.getProperty("Password"));
		academicManagement = homePage.ClickOnAcademic();
		academicManagement.ClickOnSubjectManagement();
	}
	
	@DataProvider
	public Object[][] getRigTestData() {
		Object data[][] = TestUtil.getTestData(SheetName);
		return data;
	}
	
	
	
	@Test(dataProvider="getRigTestData")
	public void AddSubjectManageTest(String GradeName, String SubjectName, String SubjectCode, String SlotsPerWeek, String SubjectHead, String ViceSubjectHead) throws InterruptedException {
		subjectManagement.AddNewSubject(GradeName, SubjectName, SubjectCode, SlotsPerWeek, SubjectHead, ViceSubjectHead);
	}
	
	
	
	
	
	
	
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
	
	
	
	
}
