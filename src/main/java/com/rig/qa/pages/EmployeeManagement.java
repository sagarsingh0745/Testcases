package com.rig.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.rig.qa.base.TestBase;
import com.rig.qa.util.TestUtil;

public class EmployeeManagement extends TestBase{

	@FindBy(css=".MuiButton-outlined")
	WebElement AddNewEMPBtn;
	
	
	@FindBy(xpath="//input[@name='firstName']")
	WebElement FirstName;
	
	@FindBy(xpath="//input[@name='lastName']")
	WebElement LastName;
	
	@FindBy(xpath="//input[@name='email']")
	WebElement Email;
	
	@FindBy(xpath="//input[@name='mobile']")
	WebElement Mobile;
	
	
	@FindBy(xpath="//input[@name='aadharCardNumber']")
	WebElement AadharCardNumber;
	
	@FindBy(xpath="//input[@name='panCardNumber']")
	WebElement PanCardNumber;
	
	@FindBy(xpath="//input[@name='currentAddress.addressLine1']")
	WebElement CurrentAddressAddressLine1;
	
	@FindBy(xpath="//input[@name='currentAddress.city']")
	WebElement CurrentAddressCity;
	
	@FindBy(xpath="//input[@name='currentAddress.state']")
	WebElement CurrentAddressState;
	
	@FindBy(xpath="//input[@name='currentAddress.pinCode']")
	WebElement CurrentAddressPinCode;
	
	@FindBy(css="div.MuiFormGroup-root:nth-child(2) > label:nth-child(1) > span:nth-child(1) > input:nth-child(1)")
	WebElement SelectCheckBox;
	
	@FindBy(xpath="/html/body/div/div/main/div/div/form/div[1]/div[5]/div/div/input")
	WebElement SelectDateOfBirth;
	

	@FindBy(xpath="/html/body/div/div/main/div/div/form/div[1]/div[6]/div/div/input")
	WebElement JoiningDate;
	
	@FindBy(css=".MuiButton-text")
	WebElement SubmitBtn;
	
	//input[@value='male']
	
	public EmployeeManagement() {
		PageFactory.initElements(driver, this);
	}
	
	public void CreateNewEmployee(String EntFtName, String ENTLtName, String DOB, String JOIN, String Gndr, String ENTEmail, String ENTMblNO, String ENTAadhar,
			String ENTPanCno, String BloodGrpName, String SLTDprt, String JobRole, String MaritalStatus, String Address, String ENTCity,
			String ENTState, String ENTPinC) throws InterruptedException {
		
		AddNewEMPBtn.click();
		FirstName.sendKeys(EntFtName);
		LastName.sendKeys(ENTLtName);
		TestUtil.WaitTime();
		//driver.findElement(By.xpath("/html/body/div/div/main/div/div/form/div[1]/div[5]/div/div/input")).sendKeys("15/04/2002");
		TestUtil.WaitTime();		
	
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value', arguments[1])" , SelectDateOfBirth, DOB);
		
		js.executeScript("arguments[0].dispatchEvent(new Event('input', { bubbles: true }));", SelectDateOfBirth);
		
		js.executeScript("arguments[0].blur();", SelectDateOfBirth);		

		
		
		
		js.executeScript("arguments[0].setAttribute('value', arguments[1])" , JoiningDate, JOIN);
		
		js.executeScript("arguments[0].dispatchEvent(new Event('input', { bubbles: true }));", JoiningDate);
		
		js.executeScript("arguments[0].blur();", JoiningDate);
		
		
		driver.findElement(By.cssSelector(".css-1tzm1eb > label:nth-child("+Gndr+") > span:nth-child(1) > input:nth-child(1)")).click();
		//driver.findElement(By.xpath("//input[@value="+Gndr+"]")).click();
		//driver.findElement(By.xpath(xpath1+Gndr+xpath2)).click();
		Email.sendKeys(ENTEmail);
		Mobile.sendKeys(ENTMblNO);
		AadharCardNumber.clear();
		TestUtil.WaitTime();
		AadharCardNumber.sendKeys(ENTAadhar);
		PanCardNumber.sendKeys(ENTPanCno);
		Select select = new Select(driver.findElement(By.name("bloodGroup")));
		select.selectByValue(BloodGrpName);
		
		Select select1 = new Select(driver.findElement(By.name("departmentId")));
		select1.selectByVisibleText(SLTDprt);
		
		
		
		
		Select select2 = new Select(driver.findElement(By.name("jobRoleId")));
		select2.selectByVisibleText(JobRole);
		
		
		//.css-a76m80 > label:nth-child(2) > span:nth-child(1) > input:nth-child(1)
		
		driver.findElement(By.cssSelector(".css-a76m80 > label:nth-child("+MaritalStatus+") > span:nth-child(1) > input:nth-child(1)")).click();
		
		//driver.findElement(By.xpath(xpath1+MaritalStatus+xpath2)).click();
		
		CurrentAddressAddressLine1.sendKeys(Address);
		CurrentAddressCity.sendKeys(ENTCity);
		CurrentAddressState.sendKeys(ENTState);
		CurrentAddressPinCode.sendKeys(ENTPinC);
		//SelectCheckBox.click();
		
		TestUtil.scrollDown();
		TestUtil.WaitTime();
		SubmitBtn.click();
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
