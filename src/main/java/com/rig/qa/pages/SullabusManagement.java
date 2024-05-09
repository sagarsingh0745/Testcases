package com.rig.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.rig.qa.base.TestBase;
import com.rig.qa.util.TestUtil;

public class SullabusManagement extends TestBase{

	@FindBy(css="button.MuiButton-sizeMedium:nth-child(1)")
	WebElement AddSullabusBtn;
	
	@FindBy(xpath="//select[@name='gradeId']")
	WebElement SltGrade;
	
	
	@FindBy(xpath="//select[@name='subjectId']")
	WebElement SltSubjectId;
	
	@FindBy(css="div.MuiGrid-root:nth-child(3) > div:nth-child(1) > button:nth-child(1)")
	WebElement AddBook;
	
	@FindBy(xpath="//input[@name='booksAssigned[0]']")
	WebElement EntBookName;
	
	@FindBy(css="div.MuiGrid-root:nth-child(4) > div:nth-child(1) > button:nth-child(1)")
	WebElement AddUnit;
	
	@FindBy(xpath="//input[@name='unit[0].unitName']")
	WebElement EntUnitName;
	@FindBy(xpath="//input[@name='unit[0].topic[0].topicName']")
	WebElement EntTopicName;
	@FindBy(xpath="//input[@name='unit[0].topic[0].topicDescription']")
	WebElement EntTopicDescriptionName;
	
	@FindBy(xpath="//input[@name='unit[1].unitName']")
	WebElement Ent1UnitName;
	@FindBy(xpath="//input[@name='unit[1].topic[1].topicName']")
	WebElement Ent1TopicName;
	@FindBy(xpath="//input[@name='unit[1].topic[1].topicDescription']")
	WebElement Ent1TopicDescriptionName;
	
	
	@FindBy(xpath="//input[@name='unit[2].unitName']")
	WebElement Ent2UnitName;
	@FindBy(xpath="//input[@name='unit[2].topic[2].topicName']")
	WebElement Ent2TopicName;
	@FindBy(xpath="//input[@name='unit[2].topic[2].topicDescription']")
	WebElement Ent2TopicDescriptionName;
	
	@FindBy(xpath="//input[@name='unit[3].unitName']")
	WebElement Ent3UnitName;
	@FindBy(xpath="//input[@name='unit[3].topic[3].topicName']")
	WebElement Ent3TopicName;
	@FindBy(xpath="//input[@name='unit[3].topic[3].topicDescription']")
	WebElement Ent3TopicDescriptionName;
	
	
	public SullabusManagement() {
		PageFactory.initElements(driver, this);
	}
	
	public void AddSlyBusMethod(String SltGrade, String SltsubjectId, String BkName, int total, String UnitName, String TpcName, String TpcDscrptName, 
			String UnitName1, String TpcName1, String TpcDscrptName1, 
			String UnitName2, String TpcName2, String TpcDscrptName2,
			String UnitName3, String TpcName3, String TpcDscrptName3) throws InterruptedException {
		
		AddSullabusBtn.click();
		
		Select select = new Select(driver.findElement(By.name("gradeId")));
		select.selectByValue(SltGrade);
		TestUtil.WaitTime();
		
		Select select1 = new Select(driver.findElement(By.name("subjectId")));
		select1.selectByVisibleText(SltsubjectId);
		TestUtil.WaitTime();
		AddBook.click();
		TestUtil.WaitTime();
		EntBookName.sendKeys(BkName);
		TestUtil.WaitTime();
		
		for(int i = 0; i<=total; i++) {
			
		AddUnit.click();
		
		
		}
		TestUtil.WaitTime();
		EntUnitName.sendKeys(UnitName);
		EntTopicName.sendKeys(TpcName);
		EntTopicDescriptionName.sendKeys(TpcDscrptName);
		TestUtil.WaitTime();
		Ent1UnitName.sendKeys(UnitName1);
		Ent1TopicName.sendKeys(TpcName1);
		Ent1TopicDescriptionName.sendKeys(TpcDscrptName1);
		TestUtil.WaitTime();
		TestUtil.WaitTime();
		Ent2UnitName.sendKeys(UnitName2);
		Ent2TopicName.sendKeys(TpcName2);
		Ent2TopicDescriptionName.sendKeys(TpcDscrptName2);
		TestUtil.WaitTime();
		Ent3UnitName.sendKeys(UnitName3);
		Ent3TopicName.sendKeys(TpcName3);
		Ent3TopicDescriptionName.sendKeys(TpcDscrptName3);
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
