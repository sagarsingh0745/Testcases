package com.rig.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.rig.qa.base.TestBase;
import com.rig.qa.pages.HomePage;
import com.rig.qa.pages.InventoryManagement;
import com.rig.qa.pages.LoginPage;
import com.rig.qa.util.TestUtil;

public class InventoryManagementTest extends TestBase{
	
	
	LoginPage loginPage;
	HomePage homePage;
	InventoryManagement inventoryManagement;
	TestUtil testUtil; 
	public InventoryManagementTest() {
		super();
	}
	@BeforeMethod
	public void SetUp() throws InterruptedException {
		initialization();
		testUtil = new TestUtil();
		inventoryManagement = new InventoryManagement();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("EmployeeId"), prop.getProperty("Password"));
		homePage.ClickOnInventory();
		
	}
	
	//@Test
	public void ValidateInventoryTitleTest() {
		boolean flag = inventoryManagement.ValidateInventoryTitle();
		Assert.assertTrue(flag);
	}
	
	@Test
	public void SendNameTest() throws InterruptedException {
		inventoryManagement.SendAddName("Thermometer");
	}
	 
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
