package com.rig.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.rig.qa.base.TestBase;
import com.rig.qa.pages.HomePage;
import com.rig.qa.pages.LoginPage;
import com.rig.qa.pages.SchoolOperation;
import com.rig.qa.util.TestUtil;

public class SchoolOperationTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	
	SchoolOperation schoolOperation;
	TestUtil testUtil; 
	public SchoolOperationTest() {
		super();
	}
	
	@BeforeMethod
	public void SetUp() throws InterruptedException {
		initialization();
		testUtil = new TestUtil();
		schoolOperation = new SchoolOperation();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("EmployeeId"), prop.getProperty("Password"));
		schoolOperation = homePage.ClickOnSchool();
		
	}
	@Test
	public void RoomManagementTest() {
	  schoolOperation.ClickOnRoomManagement();
	}
	
	@Test
	public void GreadManagemendTest() {
		schoolOperation.ClickOnGreadManagement();
	}
	
	@Test
	public void DepartmentManagementTest() {
		schoolOperation.ClickOnDepartManagement();
	}
	
	@Test
	public void ClassManagementTest() {
		schoolOperation.ClickOnClassManagement();
	}
	
	@Test
	public void ManageSchoolTest() {
		schoolOperation.ClickOnManageSchool();
	}
	
	@Test
	public void TimeTableManagementTest() {
		schoolOperation.ClickOnTimeTableManagement();
	}
	
	@Test
	public void LibraryManagementTest() {
		schoolOperation.ClickOnLibraryManagement();
	}
	
	@Test
	public void OnlineClassManagementTest() {
		schoolOperation.ClickOnOnlineClassManagement();
	}

	@Test
	public void AnnouncementManagementTest() {
		schoolOperation.ClickOnAnnouncementManagement();
	}
	
	@Test
	public void AdmissionManagementTest() {
		schoolOperation.ClickOnAddmissionManagement();
	}
	@Test
	public void MassageCentersTest() {
		schoolOperation.ClickOnMassegeCenters();
	}
	@Test
	public void SubstitutionManagementTest() {
		schoolOperation.ClickOnSubstitutionManagement();
	}
	@Test
	public void StudentAttendenceTest() {
		schoolOperation.ClickOnStudentAttendence();
	}
	@Test
	public void StudentHalfDayTest() {
		schoolOperation.ClickOnStudentHalfDay();
	}
	@Test
	public void VisitorManagementTest() {
		schoolOperation.ClickOnVisitorManagement();
	}
	@Test
	public void LeadManagementTest() {
		schoolOperation.ClickOntLeadManagement();
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
}
