package com.rig.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.rig.qa.base.TestBase;

public class SchoolOperation extends TestBase{
	
	@FindBy(css="div.MuiGrid-root:nth-child(1) > div:nth-child(1)")
	WebElement RoomManagement;
	
	@FindBy(css="div.MuiGrid-item:nth-child(2) > div:nth-child(1)")
	WebElement GreadManagement;
	
	@FindBy(css="div.MuiGrid-root:nth-child(3) > div:nth-child(1)")
	WebElement DepartManagement;
	
	@FindBy(css="div.MuiGrid-item:nth-child(4) > div:nth-child(1)")
	WebElement ClassManagement;
	
	@FindBy(css="div.MuiGrid-item:nth-child(5) > div:nth-child(1)")
	WebElement ManageSchool;
	
	@FindBy(css="div.MuiGrid-item:nth-child(6) > div:nth-child(1)")
	WebElement TimeTableManagement;
	
	@FindBy(css="div.MuiGrid-item:nth-child(7) > div:nth-child(1)")
	WebElement LibraryManagement;
	
	@FindBy(css="div.MuiGrid-item:nth-child(8) > div:nth-child(1)")
	WebElement OnlineClassManagement;
	
	@FindBy(css="div.MuiGrid-item:nth-child(9) > div:nth-child(1)")
	WebElement AnnouncementManagement;
	
	@FindBy(css="div.MuiGrid-item:nth-child(10) > div:nth-child(1)")
	WebElement AddmissionManagement;
	
	@FindBy(css="div.MuiGrid-item:nth-child(11) > div:nth-child(1)")
	WebElement MassegeCenters;
	
	@FindBy(css="div.MuiGrid-item:nth-child(12) > div:nth-child(1)")
	WebElement SubstitutionManagement;
	
	@FindBy(css="div.MuiGrid-item:nth-child(13) > div:nth-child(1)")
	WebElement StudentAttendence;
	
	@FindBy(css="div.MuiGrid-item:nth-child(14) > div:nth-child(1)")
	WebElement StudentHalfDay;
	
	@FindBy(css="div.MuiGrid-item:nth-child(15) > div:nth-child(1)")
	WebElement VisitorManagement;
	
	@FindBy(css="div.MuiGrid-item:nth-child(16) > div:nth-child(1)")
	WebElement LeadManagement;
	

	
	
	
	
	public SchoolOperation() {
		PageFactory.initElements(driver, this);
	}
	
	public void ClickOnRoomManagement() {
		RoomManagement.click();
	}
	
	public void ClickOnGreadManagement() {
		GreadManagement.click();
	}
	public void ClickOnDepartManagement() {
		DepartManagement.click();
	}
	
	public void ClickOnClassManagement() {
		ClassManagement.click();
	}
	public void ClickOnManageSchool() {
		ManageSchool.click();
	}
	
	public void ClickOnTimeTableManagement() {
		TimeTableManagement.click();
	}
	public void ClickOnLibraryManagement() {
		LibraryManagement.click();
	}
	
	public void ClickOnOnlineClassManagement() {
		OnlineClassManagement.click();
	}
	public void ClickOnAnnouncementManagement() {
		AnnouncementManagement.click();
	}
	
	public void ClickOnAddmissionManagement() {
		AddmissionManagement.click();
	}
	public void ClickOnMassegeCenters() {
		MassegeCenters.click();
	}
	
	public void ClickOnSubstitutionManagement() {
		SubstitutionManagement.click();
	}
	public void ClickOnStudentAttendence() {
		StudentAttendence.click();
	}
	
	public void ClickOnStudentHalfDay() {
		StudentHalfDay.click();
	}
	public void ClickOnVisitorManagement() {
		VisitorManagement.click();
	}
	
	public void ClickOntLeadManagement() {
		LeadManagement.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
