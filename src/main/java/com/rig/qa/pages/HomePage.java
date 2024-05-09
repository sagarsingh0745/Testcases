package com.rig.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.rig.qa.base.TestBase;
import com.rig.qa.util.TestUtil;

public class HomePage extends TestBase {

	@FindBy(xpath="//*[@id=\"root\"]/div/header/div/div[1]/span/a/img")
	WebElement RigLogo;
	
	@FindBy(xpath="//a[@href='/dashboard/all']")
	WebElement AllLink;
	
	@FindBy(xpath="//a[@href='/dashboard/quickAccess']")
	WebElement QuickAccessSelects;
	
	@FindBy(xpath="//a[@href='/dashboard/SchoolOperation']")
	WebElement SchoolData;
	
	@FindBy(xpath="//a[@href='/dashboard/AcademicManagement']")
	WebElement AcademicData;

	@FindBy(xpath="//a[@href='/dashboard/studentManagement']")
	WebElement StudentData;
	
	@FindBy(xpath="//a[@href='/dashboard/inventoryManagement']")
	WebElement Inventory;
	
	@FindBy(xpath="//a[@href='/dashboard/FeedbackManagement']")
	WebElement feedback;
	
	@FindBy(xpath="//a[@href='/dashboard/HrManagement']")
	WebElement HrManagement;
	

	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean ValidateLogo() {
		return RigLogo.isDisplayed();
	}
	
	public String virifyHomePageTitle() {
		return driver.getTitle();
	}
	public AllFunction ClickOnAllLink() throws InterruptedException {
		TestUtil.WaitTime();
		AllLink.click();
		return new AllFunction();
	}
	
	public QuickAccess ClickOnQuickAccess() {
		QuickAccessSelects.click();
		return new QuickAccess();
	}
	public SchoolOperation ClickOnSchoolOperation() {
		SchoolData.click();
		return new SchoolOperation();
	}
	public AcademicManagement ClickOnAcademic() throws InterruptedException {
		TestUtil.WaitTime();
		AcademicData.click();
		
		return new AcademicManagement();
	}
	public StudentsManagement ClickOnStudentsManagement() throws InterruptedException {
		TestUtil.WaitTime();
		StudentData.click();
		return new StudentsManagement();
	}
	
	public InventoryManagement ClickOnInventory() throws InterruptedException {
		TestUtil.WaitTime();
		TestUtil.scrollDownLeftLinkBar();
		Inventory.click();
		return new InventoryManagement();
	}
	
	public FeedbackManagement ClickOnFeedback() throws InterruptedException {
		TestUtil.WaitTime();
		TestUtil.scrollDownLeftLinkBar();
		feedback.click();
		return new FeedbackManagement();
	}
	
	public SchoolOperation ClickOnSchool() throws InterruptedException {
		TestUtil.WaitTime();
		SchoolData.click();
		return new SchoolOperation();
	}
	
	public HRManagement ClickOnHRManagement() throws InterruptedException {
		TestUtil.WaitTime();
		TestUtil.scrollDownLeftLinkBar();
		HrManagement.click();
		return new HRManagement();
	}
	
	
	
	
	
	
	
	
	
	
}
