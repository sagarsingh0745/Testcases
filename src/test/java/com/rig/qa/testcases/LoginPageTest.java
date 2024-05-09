package com.rig.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.rig.qa.base.TestBase;
import com.rig.qa.pages.HomePage;
import com.rig.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	
	public LoginPageTest() throws IOException {
		super();
	}

	
	@BeforeMethod
	public void SetUp() {
		initialization();
		loginPage = new LoginPage();
	}
	
	@Test(priority=1)
	public void loginPageTitleTest() {
		String title = loginPage.ValidateLoginPageTitle();
		Assert.assertEquals(title, "RigAlma-School Management System || Education Management System");
	}
	@Test(priority=2)
	public void ValidateRigLogoTest() {
		boolean flag = loginPage.ValidateRigLogo();
		Assert.assertTrue(flag);
	}
	@Test(priority=3)
	public void LoginTest() {
		homePage = loginPage.login(prop.getProperty("EmployeeId"), prop.getProperty("Password"));
	}
	
	
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
}
