package com.rig.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.rig.qa.base.TestBase;
import com.rig.qa.pages.AcademicManagement;
import com.rig.qa.pages.HomePage;
import com.rig.qa.pages.LoginPage;
import com.rig.qa.util.TestUtil;

public class AcademicManagementTest extends TestBase{

	
	
	LoginPage loginPage;
	HomePage homePage;
	AcademicManagement academicManagement;
	TestUtil testUtil; 
	public AcademicManagementTest() {
		super();
	}
	
	@BeforeMethod
	public void SetUp() throws InterruptedException {
		initialization();
		testUtil = new TestUtil();
		academicManagement = new AcademicManagement();
        loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("EmployeeId"), prop.getProperty("Password"));
		academicManagement = homePage.ClickOnAcademic();
	}
	
	@Test
	public void SubjectManagementTest() {
		academicManagement.ClickOnSubjectManagement();
	}
 
	@Test
	public void SyllabusManagentTest() {
		academicManagement.ClickOnSyllabusManagement();
	}
 
    @Test
	public void LessonPlanManagementTest() {
		academicManagement.ClickOnLessonPlanManagement();
	}
 
	@Test
	public void QuestionBankManagementTest() {
		academicManagement.ClickOnQuestionBankManagement();
	}
 
	
	
	
	
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
}
