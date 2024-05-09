package com.rig.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.rig.qa.base.TestBase;
import com.rig.qa.util.TestUtil;

public class SubjectManagement extends TestBase{

	
	@FindBy(css=".css-1mrv7ac")
	WebElement AddSubject;
	
	@FindBy(xpath="//select[@name='gradeIds']")
	WebElement SelectGrade;
	
	@FindBy(xpath="//input[@name='subjectName']")
	WebElement EnterSubjectName;
	

	@FindBy(xpath="//input[@name='subjectCode']")
	WebElement EnterSubjectCode;

	@FindBy(xpath="//input[@name='slotsPerWeek']")
	WebElement EnterSlotsPerWeek;
	
	@FindBy(css="div.css-1r1q8ko:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2)")
	WebElement SubjectHeaD;
	
				@FindBy(xpath="//input[@name='isExamSubject']")
			WebElement isExamSubject;
			
				
				@FindBy(xpath="//input[@name='isMandatory']")
				WebElement IsMandatory;			
	@FindBy(xpath="//*[@id=\":r23:\"]")
	WebElement SubjectHead;
//	#\:r23\:
//		#\:r1o\:
//			div.css-1r1q8ko:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2)
	@FindBy(css="#\\:r1t\\:")
	WebElement ViceSubjectHead;
	
	public SubjectManagement() {
		PageFactory.initElements(driver, this);
	}
	
	
    public void AddNewSubject(String SltGrade, String EntSubject, String EntSubjectCode, String EntSlotPerWeek, String SuBjectHead, String VSubjectHead) throws InterruptedException {
    	AddSubject.click();
    	Select select = new Select(driver.findElement(By.name("gradeIds")));
		select.selectByValue(SltGrade);
		
		EnterSubjectName.sendKeys(EntSubject);
		
		EnterSubjectCode.sendKeys(EntSubjectCode);
		
		EnterSlotsPerWeek.sendKeys(EntSlotPerWeek);
		 TestUtil.WaitTime();
//		 SubjectHeaD.click();
//		 TestUtil.WaitTime();
//		 SubjectHead.sendKeys(SuBjectHead);
////		 Select select1 = new Select(driver.findElement(By.cssSelector("#\\:r1r\\:")));
////			select1.selectByValue(VSubjectHead);
//		 
//		 TestUtil.WaitTime();
//		//ViceSubjectHead.click();
//		
//		ViceSubjectHead.sendKeys(VSubjectHead);
//		
		 isExamSubject.click();
		 IsMandatory.click();
		
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
