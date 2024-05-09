package com.rig.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.rig.qa.base.TestBase;

public class StudentsManagement extends TestBase{
	
	@FindBy(css="div.MuiGrid-root:nth-child(1)")
	WebElement StudentManagement;
	
	@FindBy(css="div.MuiGrid-root:nth-child(2)")
	WebElement StudentRequestManagement;
	
	@FindBy(css="div.MuiGrid-root:nth-child(3)")
	WebElement StudentPromote;
	
	@FindBy(css="div.MuiGrid-root:nth-child(4)")
	WebElement CertificationGeneration;
	
	@FindBy(css="div.MuiGrid-root:nth-child(5)")
	WebElement GradeBook;

	public StudentsManagement() {
		PageFactory.initElements(driver, this);
	}
	
	public void ClickOnStudentManagement() {
		StudentManagement.click();
	}
	public void  ClickOnStudentRequestManagement() {
		StudentRequestManagement.click();
	}
	public void ClickOnStudentPromote() {
		StudentPromote.click();
	}
	public void ClickOnCertificationGeneration() {
		CertificationGeneration.click();
	}
	public void ClickOnGradeBook() {
		GradeBook.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
