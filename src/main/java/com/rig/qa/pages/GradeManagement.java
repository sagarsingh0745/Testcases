package com.rig.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.rig.qa.base.TestBase;

public class GradeManagement extends TestBase {
	
	@FindBy(xpath="//button[@id='demo-customized-button']")
	WebElement AddGradeBtn;
	
	
@FindBy(xpath="//input[@name='gradeName']")
	WebElement GradeNameBox;

@FindBy(xpath="//input[@name='sequence']")
WebElement SequenceBox;	
	
public GradeManagement() {
	PageFactory.initElements(driver, this);
}
	
	public void ClickOnAddGrade(String GrdName, String SqnName) {
		AddGradeBtn.click();
		GradeNameBox.sendKeys(GrdName);
		SequenceBox.sendKeys(SqnName);
	}





	
	
	

}
