package com.rig.qa.testcases;

import org.apache.poi.ss.usermodel.Sheet;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.rig.qa.base.TestBase;
import com.rig.qa.pages.HomePage;
import com.rig.qa.pages.LoginPage;
import com.rig.qa.pages.StudentCreation;
import com.rig.qa.pages.StudentsManagement;
import com.rig.qa.util.TestUtil;

public class StudentCreationTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	Sheet EmployeeSheet;
	StudentsManagement studentsManagement;
	StudentCreation studentCreation;
	TestUtil testUtil; 
	String SheetName = "EmployeeSheet";
	public StudentCreationTest() {
		super();
	}

	
	@BeforeMethod
	public void SetUp() throws InterruptedException {
		initialization();
		testUtil = new TestUtil();
		studentsManagement = new StudentsManagement();
		studentCreation = new StudentCreation();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("EmployeeId"), prop.getProperty("Password"));
		studentsManagement = homePage.ClickOnStudentsManagement();
		studentsManagement.ClickOnStudentManagement();
		
	}
	
	@DataProvider
	public Object[][] getRigTestData() {
		Object data[][] = TestUtil.getTestData(SheetName);
		return data;
	}
	
	
	
	
	
	@Test
	public void CreateStudentForm() {
		studentCreation.AddStudentCreation("Sagar", "Singh", "04/15/2002", "09/11/2015", "234554322345", "PLEPS4234A4", "1", "15", "8433874518", "sagar23@gmail.com", "A+", "Third", "Third-A", "Demo",
				"Demo", "Demo", "281122", "Fdemo", "Ldemo", "Odemo", "9690874768", "demo123@gmail.com", "02/02/1987", "A+", "UG", "876534567654", "PLEPS231A4", "Fdemo", "Ldemo", "ODemo", "6396157245", "ksing234@gmail.com", "02/02/1990",
				"AB+", "909087876565", "PLEPS9098A2",
				"FDemo", "LDemo", "9068908756", "876990875690", "PLEPS54478A5");
	}
	
	
	
	
	
	
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
	
	
	

}
