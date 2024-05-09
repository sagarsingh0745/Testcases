package com.rig.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.rig.qa.base.TestBase;
import com.rig.qa.util.TestUtil;

public class RoomManagement extends TestBase{

	@FindBy(xpath="//button[@id='demo-customized-button']")
	WebElement AddRoomType;
	
	@FindBy(xpath="//select[@name='type']")
	WebElement SelectRoomType;
	
	@FindBy(xpath="//input[@name='roomName']")
	WebElement RoomName;
	
	@FindBy(xpath="//input[@name='description']")
	WebElement RoomDescription;
	
    @FindBy(xpath="//input[@name='numberOfBenches']")
	WebElement NumberOfBenches;
    
	@FindBy(xpath="//button[@type='submit']")
	WebElement SaveBtn;
	
	@FindBy(css="button.MuiButton-outlined:nth-child(2)")
	WebElement AddRoomTypeBtn;
	

	@FindBy(css="button.MuiButton-outlined:nth-child(1)")
	WebElement InsideAddRoomTypeBtn;

	@FindBy(xpath="//input[@name='roomType']")
	WebElement roomType;
	
	@FindBy(xpath="//input[@name='description']")
	WebElement RoomTypeDecription;
	
	public RoomManagement() {
		PageFactory.initElements(driver, this);
	}
	
	public void ClickOnAddRoomTypeBtn1() {
		AddRoomType.click();
	}

	public void ClickOnRoomType(String SelectRoom1, String EnterRoomName1, String EnterRoomDescriptiom1, String SitOnBench1, String NoOfBenches1 ) throws InterruptedException {
		
		String Common_xpath = "//input[@value=";
		String Unique_xpath = "]";
		AddRoomType.click();
		TestUtil.WaitTime();
		Select select = new Select(driver.findElement(By.name("type")));
		select.selectByVisibleText(SelectRoom1);
		TestUtil.WaitTime();
		RoomName.sendKeys(EnterRoomName1);
		TestUtil.WaitTime();
		RoomDescription.sendKeys(EnterRoomDescriptiom1);
		TestUtil.WaitTime();
		driver.findElement(By.xpath(Common_xpath+SitOnBench1+Unique_xpath)).click();
		TestUtil.WaitTime();
		NumberOfBenches.sendKeys(NoOfBenches1);
		TestUtil.WaitTime();
		SaveBtn.click();
		TestUtil.WaitTime();
	    TestUtil.HandelAlert();
		}
		
		
	
	
	public void AddRoomType(String roomtype, String description)  {
		AddRoomTypeBtn.click();
	
		InsideAddRoomTypeBtn.click();
		
		roomType.sendKeys(roomtype);
		
		RoomTypeDecription.sendKeys(description);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
