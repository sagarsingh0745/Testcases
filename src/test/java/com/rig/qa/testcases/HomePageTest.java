package com.rig.qa.testcases;



import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.rig.qa.base.TestBase;
import com.rig.qa.pages.AcademicManagement;
import com.rig.qa.pages.AllFunction;
import com.rig.qa.pages.FeedbackManagement;
import com.rig.qa.pages.HRManagement;
import com.rig.qa.pages.HomePage;
import com.rig.qa.pages.InventoryManagement;
import com.rig.qa.pages.LoginPage;
import com.rig.qa.pages.SchoolOperation;
import com.rig.qa.pages.StudentsManagement;
import com.rig.qa.util.TestUtil;

public class HomePageTest extends TestBase{
	
	
	LoginPage loginPage;
	HomePage homePage;
	AllFunction allFunction;
	InventoryManagement inventoryManagement;
	FeedbackManagement feedbackManagement;
	SchoolOperation schoolOperation;
	AcademicManagement academicManagement;
	HRManagement hrManagement;
	StudentsManagement studentsManagement;
	TestUtil testUtil; 
	public HomePageTest() {
		super();
	}

	@BeforeMethod
	public void SetUp() {
		initialization();
		testUtil = new TestUtil();
		allFunction = new AllFunction();
		academicManagement = new AcademicManagement();
		inventoryManagement = new InventoryManagement();
		feedbackManagement = new FeedbackManagement();
		hrManagement = new HRManagement();
		studentsManagement = new StudentsManagement();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("EmployeeId"), prop.getProperty("Password"));
	}
	
	@Test(priority=1)
	public void virifyHomePageTitleTest() {
		String homePageTitle = homePage.virifyHomePageTitle();
		Assert.assertEquals(homePageTitle, "RigAlma-School Management System || Education Management System");
	}
    @Test(priority=2)
	public void ValidateLogoTest() {
		boolean flag = homePage.ValidateLogo();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=3)
	public void ClickOnAllLinkTest() throws InterruptedException {
		allFunction = homePage.ClickOnAllLink();
		
	}
	@Test(priority=4)
	public void ClickOnInventoryTest() throws InterruptedException {
		inventoryManagement = homePage.ClickOnInventory();
	}
	
    @Test(priority=5)
	public void ClickOnFeedbackTest() throws InterruptedException {
		feedbackManagement = homePage.ClickOnFeedback();
	}
	@Test(priority=6)
	public void ClickONSchoolOperation() throws InterruptedException {
		schoolOperation = homePage.ClickOnSchool();
	}
	
	@Test
	public void ClickOnAcademicManagementTest() throws InterruptedException {
		academicManagement	= homePage.ClickOnAcademic();
	}
	
	@Test
	public void ClickOnHRManagementTest() throws InterruptedException {
		hrManagement = homePage.ClickOnHRManagement();
	}
	@Test
	public void ClickOnStudentsManagementTest() throws InterruptedException {
		studentsManagement = homePage.ClickOnStudentsManagement();
	}
	
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
	

}
