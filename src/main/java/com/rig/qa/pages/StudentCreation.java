package com.rig.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.rig.qa.base.TestBase;

public class StudentCreation extends TestBase{
	
	
	@FindBy(css=".css-1mrv7ac")
	WebElement AddStudendBtn;
	
	@FindBy(xpath="//input[@name='studentFirstName']")
	WebElement StudentFirstName;
	
	@FindBy(xpath="//input[@name='studentLastName']")
	WebElement StudentLastName;
	
	@FindBy(xpath="/html/body/div/div/main/div/div/form/div[2]/div[2]/div/div/div/div/div/div[4]/div/div/input")
	WebElement StudentDOB;
	
	@FindBy(xpath="/html/body/div/div/main/div/div/form/div[2]/div[2]/div/div/div/div/div/div[5]/div/div/input")
	WebElement StudentDOA;
	
	@FindBy(xpath="//input[@name='studentAadharNumber']")
	WebElement StudentAdharNo;
	
	
	@FindBy(xpath="//input[@name='studentPanNumber']")
	WebElement StudentPanNo;
	
	@FindBy(xpath="//input[@name='studentRollNo']")
	WebElement StudentRollNo;
	
	
	@FindBy(xpath="//input[@name='studentPhoneNumber']")
	WebElement StudentPhoneNo;
	

	@FindBy(xpath="//input[@name='studentEmail']")
	WebElement StudentEmailId;
	
	@FindBy(xpath="//input[@name='studentCurrentAddress.addressLine1']")
	WebElement StudentAddressLine1;
	
	@FindBy(xpath="//input[@name='studentCurrentAddress.city']")
	WebElement StudentCity;
	
	@FindBy(xpath="//input[@name='studentCurrentAddress.state']")
	WebElement StudentState;
	
	@FindBy(xpath="//input[@name='studentCurrentAddress.pinCode']")
	WebElement StudentPinCode;
	
	@FindBy(css="div.MuiFormGroup-root:nth-child(2) > label:nth-child(1) > span:nth-child(1) > input:nth-child(1)")
	WebElement CheckBoxSameAddress;
	
	//Guardian Information
	//FatherInformation

	
	@FindBy(css="#panel2bh-header > div:nth-child(2) > svg:nth-child(1)")
	WebElement GuardianForm;
	
	@FindBy(xpath="//input[@name='studentFatherFirstName']")
	WebElement StudentFatherFirstName;
	
	@FindBy(xpath="//input[@name='studentFatherLastName']")
	WebElement StudentFatherLastName;
	
	@FindBy(xpath="//input[@name='studentFatherOccupation']")
	WebElement StudentFatherOccupation;
	
	@FindBy(xpath="//input[@name='studentFatherPhoneNumber']")
	WebElement StudentFatherPhoneNumber;
	
	@FindBy(xpath="//input[@name='studentFatherEmail']")
	WebElement StudentFatherEmail;
	
	@FindBy(xpath="/html/body/div/div/main/div/div/form/div[3]/div[2]/div/div/div/div/div[1]/div[8]/div/div/input")
	WebElement StudentFatherDOB;
	
	
	@FindBy(xpath="//input[@name='studentFatherAadharNumber']")
	WebElement StudentFatherAadharNumber;
	
	
	@FindBy(xpath="//input[@name='studentFatherPanNumber']")
	WebElement StudentFatherPanNumber;
	
	//Mother Information;
	
	
	@FindBy(xpath="//input[@name='studentMotherFirstName']")
	WebElement StudentMotherFirstName;
	
	@FindBy(xpath="//input[@name='studentMotherLastName']")
	WebElement StudentMotherLastName;
	
	@FindBy(xpath="//input[@name='studentMotherOccupation']")
	WebElement StudentMotherOccupation;
	
	@FindBy(xpath="//input[@name='studentMotherPhoneNumber']")
	WebElement StudentMotherPhoneNumber;
	
	@FindBy(xpath="//input[@name='studentMotherEmail']")
	WebElement StudentMotherEmail;
	
	
	
	@FindBy(xpath="/html/body/div/div/main/div/div/form/div[3]/div[2]/div/div/div/div/div[2]/div[8]/div/div/input")
	WebElement M_DOB;
	
	
	@FindBy(xpath="//input[@name='studentMotherAadharNumber']")
	WebElement StudentMotherAadharNumber;
	
	
	@FindBy(xpath="//input[@name='studentMotherPanNumber']")
	WebElement StudentMotherPanNumber;
	
	
	//Guardian Details
	

	@FindBy(xpath="//input[@name='studentGuardianFirstName']")
	WebElement StudentGuardianFirstName;
	
	@FindBy(xpath="//input[@name='studentGuardianLastName']")
	WebElement StudentGuardianLastName;
	
	@FindBy(xpath="//input[@name='studentGuardianPhoneNumber']")
	WebElement StudentGuardianPhoneNumber;
	
	@FindBy(xpath="//input[@name='studentGuardianAadharNumber']")
	WebElement StudentGuardianAadharNumber;
	
	@FindBy(xpath="//input[@name='studentGuardianPanNumber']")
	WebElement StudentGuardianPanNumber;
	
	
	public StudentCreation() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	public void AddStudentCreation(String FtName, String LtName, String DOB, String SchoolJoin, String AdharNo, String PanNo, String StudentGender, String RollNo,
			String SPhoneNO, String SEmail, String S_BloodGrp, String S_Grade, String S_Class, String SAddress, String SCity, String SState, String SPinCode,
			String S_F_FtName, String F_LtName, String O_Name, String F_No, String F_Email, String F_DOB, String F_BloodGrp, String F_Qualification,
			String F_Adhar, String F_PanNo, String M_FtName, String M_LtName, String M_Occupation, String M_No, String M_Email, String Mother_DOB,
			String M_BloodGrp, String M_Adhar, String M_PanNo, String G_FTName, String G_LtName, String G_PhoneNo, String G_Adhar, String G_PanNo) {
		
		AddStudendBtn.click();
		StudentFirstName.sendKeys(FtName);
		StudentLastName.sendKeys(LtName);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value', arguments[1])" , StudentDOB, DOB);
		
		js.executeScript("arguments[0].dispatchEvent(new Event('input', { bubbles: true }));", StudentDOB);
		
		js.executeScript("arguments[0].blur();", StudentDOB);		

		
		
		
		js.executeScript("arguments[0].setAttribute('value', arguments[1])" , StudentDOA, SchoolJoin);
		
		js.executeScript("arguments[0].dispatchEvent(new Event('input', { bubbles: true }));", StudentDOA);
		
		js.executeScript("arguments[0].blur();", StudentDOA);
		
		
		StudentAdharNo.sendKeys(AdharNo);
		StudentPanNo.sendKeys(PanNo);
		
		driver.findElement(By.cssSelector("#panel1bh-content > div:nth-child(1) > div:nth-child(1) > div:nth-child(8) > div:nth-child(1) > "
				+ "div:nth-child(1) > label:nth-child("+StudentGender+") > span:nth-child(1) > input:nth-child(1)")).click();
		
		StudentRollNo.sendKeys(RollNo);
		StudentPhoneNo.sendKeys(SPhoneNO);
		StudentEmailId.sendKeys(SEmail);
		
		
		Select select = new Select(driver.findElement(By.name("studentBloodGroup")));
		select.selectByValue(S_BloodGrp);
	
		
		Select select1 = new Select(driver.findElement(By.name("studentGrade")));
		select1.selectByValue(S_Grade);
		
		
		Select select2 = new Select(driver.findElement(By.name("studentClass")));
		select2.selectByVisibleText(S_Class);
		
		
		
		
		
		
		
		//StudentAddress
		
		
		StudentAddressLine1.sendKeys(SAddress);
		StudentCity.sendKeys(SCity);
		StudentState.sendKeys(SState);
		StudentPinCode.sendKeys(SPinCode);
		CheckBoxSameAddress.click();
		
		//FatherInformation
		
		GuardianForm.click();
		StudentFatherFirstName.sendKeys(S_F_FtName);
		StudentFatherLastName.sendKeys(F_LtName);
		StudentFatherOccupation.sendKeys(O_Name);
		StudentFatherPhoneNumber.sendKeys(F_No);
		StudentFatherEmail.sendKeys(F_Email);
		
	js.executeScript("arguments[0].setAttribute('value', arguments[1])" , StudentFatherDOB, F_DOB);
		
		js.executeScript("arguments[0].dispatchEvent(new Event('input', { bubbles: true }));", StudentFatherDOB);
		
		js.executeScript("arguments[0].blur();", StudentFatherDOB);
		
		Select select3 = new Select(driver.findElement(By.name("studentFatherBloodGroup")));
		select3.selectByValue(F_BloodGrp);
		
		
		Select select4 = new Select(driver.findElement(By.name("studentFatherHighestQualification")));
		select4.selectByValue(F_Qualification);
		
		StudentFatherAadharNumber.sendKeys(F_Adhar);
		StudentFatherPanNumber.sendKeys(F_PanNo);
		
		//MotherInformation
		StudentMotherFirstName.sendKeys(M_FtName);
		StudentMotherLastName.sendKeys(M_LtName);
		StudentMotherOccupation.sendKeys(M_Occupation);
		StudentMotherPhoneNumber.sendKeys(M_No);
		StudentMotherEmail.sendKeys(M_Email);
		
		
		
js.executeScript("arguments[0].setAttribute('value', arguments[1])" , M_DOB, Mother_DOB);
		
		js.executeScript("arguments[0].dispatchEvent(new Event('input', { bubbles: true }));", M_DOB);
		
		js.executeScript("arguments[0].blur();", M_DOB);
		
		
		Select select5 = new Select(driver.findElement(By.name("studentMotherBloodGroup")));
		select5.selectByValue(M_BloodGrp);
		
		
		
		StudentMotherAadharNumber.sendKeys(M_Adhar);
		StudentMotherPanNumber.sendKeys(M_PanNo);
		
		//Guardian Details
		
		StudentGuardianFirstName.sendKeys(G_FTName);
		StudentGuardianLastName.sendKeys(G_LtName);
		StudentGuardianPhoneNumber.sendKeys(G_PhoneNo);
		StudentGuardianAadharNumber.sendKeys(G_Adhar);
		StudentGuardianPanNumber.sendKeys(G_PanNo);
		
	
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
