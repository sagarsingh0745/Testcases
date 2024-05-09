package com.rig.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.rig.qa.base.TestBase;
import com.rig.qa.pages.HomePage;
import com.rig.qa.pages.LoginPage;
import com.rig.qa.pages.StudentsManagement;
import com.rig.qa.util.TestUtil;

public class StudentsManagementTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	StudentsManagement studentsManagement;
	TestUtil testUtil; 
	public StudentsManagementTest() {
		super();
	}

	
	
	
	@BeforeMethod
	public void SetUp() throws InterruptedException {
		initialization();
		testUtil = new TestUtil();
		studentsManagement = new StudentsManagement();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("EmployeeId"), prop.getProperty("Password"));
		studentsManagement = homePage.ClickOnStudentsManagement();

		
	}
	
	@Test
	public void ClickOnStudentCreationTest() {
		studentsManagement.ClickOnStudentManagement();
	}
	
	
	@Test
	public void ClickOnStudentRequestManagementTest() {
		studentsManagement.ClickOnStudentRequestManagement();
	}
	
	@Test
	public void ClickOnStudentPromoteTest() {
		studentsManagement.ClickOnStudentPromote();
	}
	
	@Test
	public void ClickOnCertificationGenerationTest() {
		studentsManagement.ClickOnCertificationGeneration();
	}
	
	@Test
	public void ClickOnGradeBookTest() {
		studentsManagement.ClickOnGradeBook();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
