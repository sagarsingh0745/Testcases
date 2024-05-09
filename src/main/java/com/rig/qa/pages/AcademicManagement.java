package com.rig.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.rig.qa.base.TestBase;

public class AcademicManagement extends TestBase{

	@FindBy(css="div.MuiGrid-root:nth-child(1) > div:nth-child(1)")
	WebElement SubjectManagement;
	//div.MuiGrid-item:nth-child(2) > div:nth-child(1)
	@FindBy(css="div.MuiGrid-item:nth-child(2) > div:nth-child(1)")
	WebElement SyllabusManagement;
	
	@FindBy(css="div.MuiGrid-root:nth-child(3) > div:nth-child(1)")
	WebElement LessonPlanManagement;
	
	@FindBy(css="div.MuiGrid-root:nth-child(4) > div:nth-child(1)")
	WebElement QuestionBankManagement;
	
	
	public AcademicManagement() {
		PageFactory.initElements(driver, this);
	}
	
	public void ClickOnSubjectManagement() {
		SubjectManagement.click();
	}
	
	public void ClickOnSyllabusManagement() {
		SyllabusManagement.click();
	}
	
	public void ClickOnLessonPlanManagement() {
		LessonPlanManagement.click();
	}
	
	public void ClickOnQuestionBankManagement() {
		QuestionBankManagement.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
