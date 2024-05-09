package com.rig.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.rig.qa.base.TestBase;
import com.rig.qa.util.TestUtil;

public class InventoryManagement extends TestBase{

@FindBy(xpath="//div[@id='tableTitle']")
WebElement InventoryTitle;

@FindBy(xpath="//*[@id=\"root\"]/div/main/div/div/div/div[1]/button")
WebElement AddNewButton;

@FindBy(xpath="//input[@PlaceHolder='Name']")	
WebElement AddName;
	
@FindBy(xpath="//div[@aria-labelledby='demo-simple-select-label']")
WebElement ConsumableDropDown;
	
@FindBy(xpath="//div[@aria-labelledby='demo-simple-select-label2']")
WebElement CategoryDropDown;

@FindBy(css=".css-p2qp6x")
WebElement SendButton;

public InventoryManagement() {
	PageFactory.initElements(driver, this);
}
	public boolean ValidateInventoryTitle() {
		return InventoryTitle.isDisplayed();
	}
	
	//public void ClickONAddNewButton() {
	//	AddNewButton.click();
	//}
	
	public void SendAddName(String ftName) throws InterruptedException {
		AddNewButton.click();
		Thread.sleep(3000);
		AddName.sendKeys(ftName);
		Thread.sleep(3000);
		ConsumableDropDown.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[@data-value='false']")).click();
		Thread.sleep(3000);
		CategoryDropDown.click();
		driver.findElement(By.xpath("//li[@data-value='Medical Supplies']")).click();
		Thread.sleep(3000);
		//Select select1 = new Select(driver.findElement(By.xpath("//div[@aria-labelledby='demo-simple-select-label")));
			//	select1.selectByVisibleText(consumable);
		//Select select2 = new Select(driver.findElement(By.xpath("//div[@aria-labelledby='demo-simple-select-label2")));
			//	select2.selectByVisibleText(category);
		SendButton.click();
		Thread.sleep(3000);
		TestUtil.HandelAlert();
		
		
		
		
	}
	
	//public void ClickConsumableDropDown () {
	//	ConsumableDropDown.click();
	//}
	
	//public void ClickCategoryDropDown() {
	//	CategoryDropDown.click();
	//}
	
	//public void  ClickOnSendButton() {
	//	SendButton.click();
	//}
	
	
	
}
