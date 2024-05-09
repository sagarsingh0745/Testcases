package com.rig.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.rig.qa.base.TestBase;
import com.rig.qa.pages.FeedbackManagement;
import com.rig.qa.pages.HomePage;
import com.rig.qa.pages.LoginPage;
import com.rig.qa.util.TestUtil;

public class FeedbackManagementTest extends TestBase{

	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil; 
	FeedbackManagement feedbackManagement;
	public FeedbackManagementTest() {
		super();
	}
	
	@BeforeMethod
	public void SetUp() throws InterruptedException {
		initialization();
		testUtil = new TestUtil();
		feedbackManagement = new FeedbackManagement();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("EmployeeId"), prop.getProperty("Password"));
		homePage.ClickOnFeedback();
		
	}
	
	//@Test(priority=1)
	public void ValidateFeedbackTitleTest() {
		boolean flag = feedbackManagement.ValidateTitleFeedback();
		Assert.assertTrue(flag);
	}
	//@Test(priority=2)
	public void ClickOnAddFeedbackTest() {
		feedbackManagement.ClickOnAddFeedback();
	}
	
	@Test(priority=3)
	public void FillingFormTest() throws InterruptedException {
		feedbackManagement.FillingForm("100200010", "2");
	}
	
	
	
	
	
	
	
	
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
	
}
