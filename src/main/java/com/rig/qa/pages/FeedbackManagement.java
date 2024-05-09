package com.rig.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.rig.qa.base.TestBase;
import com.rig.qa.util.TestUtil;

public class FeedbackManagement extends TestBase{

	@FindBy(xpath="//*[@id=\"root\"]/div/main/div/div/div/div[1]/h4")
	WebElement ValidateTitle;
	
	@FindBy(xpath="//button[@id='demo-customized-button']")
	WebElement AddFeedback;
	
	@FindBy(xpath="//input[@name='studentId']")
	WebElement IdSearch;
	
	@FindBy(css="button.MuiButton-sizeMedium:nth-child(2)")
	WebElement ButtonSearch;
					
	@FindBy(xpath="//input[@name='action']")
	WebElement ActionPlaceHolder;

	@FindBy(xpath="//input[@name='description']")
	WebElement Description;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement SaveBtn;
		
	public FeedbackManagement() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean ValidateTitleFeedback() {
		return ValidateTitle.isDisplayed();
	}
	public void ClickOnAddFeedback() {
		AddFeedback.click();
	}
	public void FillingForm(String StudentId, String Reating ) throws InterruptedException {
		AddFeedback.click();
		TestUtil.WaitTime();
		IdSearch.sendKeys(StudentId);
		TestUtil.WaitTime();
		ButtonSearch.click();
		TestUtil.WaitTime();
		Select select = new Select(driver.findElement(By.name("for")));
		select.selectByValue("Behavioral");
		TestUtil.WaitTime();
		
		Select select1 = new Select(driver.findElement(By.name("isActionable")));
		select1.selectByValue("false");
		TestUtil.WaitTime();
		ActionPlaceHolder.sendKeys("Demo");
		TestUtil.WaitTime();
		Description.sendKeys("Demo");
		TestUtil.WaitTime();
		Select select2 = new Select(driver.findElement(By.name("rating")));
		select2.selectByValue(Reating);
		TestUtil.WaitTime();
		SaveBtn.click();
		TestUtil.WaitTime();
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
