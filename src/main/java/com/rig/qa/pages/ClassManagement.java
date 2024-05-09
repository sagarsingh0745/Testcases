package com.rig.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.rig.qa.base.TestBase;
import com.rig.qa.util.TestUtil;

public class ClassManagement extends TestBase{

	@FindBy(css=".MuiButton-outlined")
	WebElement AddClassBtn;
	
	@FindBy(xpath="//select[@name='gradeId']" )
	WebElement SelectGrade;
	
	@FindBy(xpath="//input[@name='className']" )
	WebElement EnterClassName;
	
	@FindBy(xpath="//input[@name='section']" )
	WebElement EnterSection;
	
	
	@FindBy(xpath="//select[@name='supervisor']" )
	WebElement SelectSupervisor;
	
	@FindBy(xpath="//select[@name='supervisorSubjectId']" )
	WebElement SelectSupervisorSubjectId;
	
	@FindBy(xpath="//select[@name='subSupervisor']" )
	WebElement SelectSubSupervisor;
	
	@FindBy(xpath="//select[@name='subSupervisorSubjectId']" )
	WebElement SelectSubSupervisorSubjectId;
	
    
	@FindBy(xpath="//select[@name='roomId']" )
	WebElement SelectRoomId;	
	
	@FindBy(xpath="//button[@type='submit']" )
	WebElement SaveBTN;
	
//	@FindBy(css="#\\:r2l\\:")
//	WebElement SaveBtn;
	
	public ClassManagement() {
		PageFactory.initElements(driver, this);
	}
	
	public void AddClassManagement(String SltGrade, String ClassNm, String Sctin, String Sltsupervisor,
	String SltSupervisorSubjectId,String SltSubSupervisor, String SltSubSupervisorSubjectId, String SltRoomId) throws InterruptedException{
		
		
		AddClassBtn.click();
		TestUtil.WaitTime();
		Select select = new Select(driver.findElement(By.name("gradeId")));
		select.selectByValue(SltGrade);
		TestUtil.WaitTime();
		EnterClassName.sendKeys(ClassNm);
	
		EnterSection.sendKeys(Sctin);
		TestUtil.WaitTime();
		
		Select select1 = new Select(driver.findElement(By.name("supervisor")));
		select1.selectByValue(Sltsupervisor);
		TestUtil.WaitTime();
		Select select2 = new Select(driver.findElement(By.name("supervisorSubjectId")));
		select2.selectByValue(SltSupervisorSubjectId);
		TestUtil.WaitTime();
		Select select3 = new Select(driver.findElement(By.name("subSupervisor")));
		select3.selectByValue(SltSubSupervisor);
		TestUtil.WaitTime();
		Select select4 = new Select(driver.findElement(By.name("subSupervisorSubjectId")));
		select4.selectByValue(SltSubSupervisorSubjectId);
		TestUtil.WaitTime();
		Select select5 = new Select(driver.findElement(By.name("roomId")));
		select5.selectByValue(SltRoomId);
		TestUtil.WaitTime();
	   
		SaveBTN.click();
	
		TestUtil.WaitTime();
		TestUtil.HandelAlert();
	}
	
	
	
	
	
	
	
	
	
	
	
}
