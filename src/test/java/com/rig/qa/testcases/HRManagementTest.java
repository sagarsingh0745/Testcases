package com.rig.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.rig.qa.base.TestBase;
import com.rig.qa.pages.HRManagement;
import com.rig.qa.pages.HomePage;
import com.rig.qa.pages.LoginPage;
import com.rig.qa.util.TestUtil;

public class HRManagementTest extends TestBase{

	LoginPage loginPage;
	HomePage homePage;
	HRManagement hrManagement;
	TestUtil testUtil; 
	public HRManagementTest() {
		super();
	}
	
	@BeforeMethod
	public void SetUp() throws InterruptedException {
		initialization();
		testUtil = new TestUtil();
		hrManagement = new HRManagement();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("EmployeeId"), prop.getProperty("Password"));
		homePage.ClickOnHRManagement();
	}
	
	@Test
	public void ClickOnEmployeeManagementTest() {
		hrManagement.ClickOnEmployeeManagement();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
