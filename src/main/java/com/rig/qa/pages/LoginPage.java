package com.rig.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.rig.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	@FindBy(xpath="//img[@alt='Rig Alma']")
	WebElement RigLogo;
	
	@FindBy(xpath="//input[@name='employeeId']")
	WebElement employeeid;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath="//input[@name='remember']")
	WebElement Remember;
	
 	@FindBy(xpath="//button[@type='submit']")
	WebElement loginbtn;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String ValidateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public boolean ValidateRigLogo() {
		return RigLogo.isDisplayed();
	}
	public HomePage login(String empid, String pwd) {
		employeeid.sendKeys(empid);
		password.sendKeys(pwd);
		Remember.click();
		loginbtn.click();
		return new HomePage();
	}
	
	
	
	
	
	
	
	
	
	

}
