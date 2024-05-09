package com.rig.qa.testcases;

import org.apache.poi.ss.usermodel.Sheet;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.rig.qa.base.TestBase;
import com.rig.qa.pages.HomePage;
import com.rig.qa.pages.LoginPage;
import com.rig.qa.pages.RoomManagement;
import com.rig.qa.pages.SchoolOperation;
import com.rig.qa.util.TestUtil;

public class RoomManagementTest extends TestBase{

	LoginPage loginPage;
	HomePage homePage;
	Sheet RoomCreateSheet;
	SchoolOperation schoolOperation;
	RoomManagement roomManagement;
    TestUtil testUtil; 
	String SheetName = "RoomCreateSheet";
    public RoomManagementTest() {
		super();
	}
	
	@BeforeMethod
	public void SetUp() throws InterruptedException {
		initialization();
		testUtil = new TestUtil();
		schoolOperation = new SchoolOperation();
		roomManagement = new RoomManagement();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("EmployeeId"), prop.getProperty("Password"));
		schoolOperation = homePage.ClickOnSchool();
		 schoolOperation.ClickOnRoomManagement();
		 
	}



	@DataProvider
	public Object[][] getRigTestData() {
		Object data[][] = TestUtil.getTestData(SheetName);
		return data;
	}

	@Test(dataProvider="getRigTestData")
	public void AddRoomTest(String RoomType, String RoomName, String RoomDescription, String SitOnBenches, String NoOfBenches ) throws InterruptedException {
		//roomManagement.ClickOnAddRoomTypeBtn1();	
		//roomManagement.ClickOnRoomType("Classroom", "demo", "demo", "3", "30");

	roomManagement.ClickOnRoomType(RoomType, RoomName, RoomDescription, SitOnBenches, NoOfBenches);
	
	}
	

	
	
	//@Test
	public void ClickOnAddRoomTypeTest() throws InterruptedException {
		roomManagement.AddRoomType("demo", "demo");
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
