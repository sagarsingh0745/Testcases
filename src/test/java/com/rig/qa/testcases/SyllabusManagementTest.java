package com.rig.qa.testcases;

import org.apache.poi.ss.usermodel.Sheet;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.rig.qa.base.TestBase;
import com.rig.qa.pages.AcademicManagement;
import com.rig.qa.pages.HomePage;
import com.rig.qa.pages.LoginPage;
import com.rig.qa.pages.SullabusManagement;
import com.rig.qa.util.TestUtil;

public class SyllabusManagementTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	Sheet SyllabusManagement;
	AcademicManagement academicManagement;
	SullabusManagement syllabusManagement;
	TestUtil testUtil;
	String SheetName = "SyllabusManagement";
	
	public SyllabusManagementTest() {
		super();
	}
	
	
	@BeforeMethod
	public void SetUp() throws InterruptedException {
		initialization();
		testUtil = new TestUtil();
		academicManagement = new AcademicManagement();
		syllabusManagement = new SullabusManagement();
        loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("EmployeeId"), prop.getProperty("Password"));
		academicManagement = homePage.ClickOnAcademic();
		academicManagement.ClickOnSyllabusManagement();
	}
	
	
	
	@DataProvider
	public Object[][] getRigTestData() {
		Object data[][] = TestUtil.getTestData(SheetName);
		return data;
	}
	
	@Test(dataProvider="getRigTestData")
	public void AddSyllabusManagementTest(String GradeName, String SubjectId, String BookName, int TotelChapterInBook, String Unit, String Topic, String TopicDescripTion,
			String Unit1, String Topic1, String TopicDescripTion1,
			String Unit2, String Topic2, String TopicDescripTion2, 
			String Unit3, String Topic3, String TopicDescripTion3) throws InterruptedException {
		syllabusManagement.AddSlyBusMethod(GradeName, SubjectId, BookName, TotelChapterInBook,
				Unit, Topic, TopicDescripTion,
				Unit1, Topic1, TopicDescripTion1,
				Unit2, Topic2, TopicDescripTion2,
				Unit3, Topic3, TopicDescripTion3);
		}
	
	
	
	   
	
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
	
	
	

}
