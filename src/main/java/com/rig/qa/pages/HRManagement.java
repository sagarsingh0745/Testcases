package com.rig.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.rig.qa.base.TestBase;

public class HRManagement extends TestBase{
	
	@FindBy(css="div.MuiGrid-root:nth-child(1)")
	WebElement EmployeeManagement;
	
	@FindBy(css="div.MuiGrid-item:nth-child(2)")
	WebElement LeaveManagement;
	
	@FindBy(css="div.MuiGrid-root:nth-child(3)")
	WebElement SalaryManagement;
	
	@FindBy(css="div.MuiGrid-root:nth-child(4)")
	WebElement EmployeeAttendence;
	
	@FindBy(css="div.MuiGrid-root:nth-child(5)")
	WebElement SalaryComponent;
	
	@FindBy(css="div.MuiGrid-root:nth-child(6)")
	WebElement RFSManagement;

	public HRManagement() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void ClickOnEmployeeManagement() {
		EmployeeManagement.click();
	}
	
	public void ClickOnLeaveManagement() {
		LeaveManagement.click();
	}
	
	public void ClickOnSalaryManagement() {
		SalaryManagement.click();
	}
	
	public void ClickOnEmployeeAttendence() {
		EmployeeAttendence.click();
	}
	
	public void ClickOnSalaryComponent() {
		SalaryComponent.click();
	}
	
	public void ClickOnRFSManagement() {
		RFSManagement.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
