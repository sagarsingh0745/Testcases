package com.rig.qa.util;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.rig.qa.base.TestBase;

public class TestUtil extends TestBase {
	
    public static long PAGE_LOAD_TIMEOUT = 20; 
	public static long IMPLICIT_WAIT = 20;

public static void WaitTime() throws InterruptedException {
	Thread.sleep(3000);
}

public TestUtil() {
	PageFactory.initElements(driver, this);
}

public static void scrollDown() {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,1400)");
	
}
public static void scrollDownLeftLinkBar(){
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("document.querySelector(\".scrollbar-container\").scrollTop=500");
}

public static void HandelAlert () {
	Alert alert = driver.switchTo().alert();
	alert.accept();
}

public void selectDateByJS(String DateVal,WebElement element ) {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].setAttribut('value','"+DateVal+"');", element);
}

//static Xls_Reader reader;
//public static ArrayList<Object[]> getDataFromExcel() {
//	ArrayList<Object[]> myData = new  ArrayList<Object[]>();
//	try {
//		reader  = new Xls_Reader("C:\\Users\\Prashant\\eclipse-workspace\\RigAdminPanel\\src\\main\\java\\com\\rig\\qa\\testdata\\RigRoom.xlsx");
//	}catch (Exception e) {
//		e.printStackTrace();
//	}
//	
//	for(int rowNum = 2; rowNum<= reader.getRowCount("RoomCreateSheet"); rowNum++) {
//		
//		String RoomType = reader.getCellData("RoomCreateSheet", "RoomType", rowNum);
//		String RoomName = reader.getCellData("RoomCreateSheet", "RoomName", rowNum);
//		String RoomDescription = reader.getCellData("RoomCreateSheet", "RoomDescription", rowNum);
//		String SitOnBenches = reader.getCellData("RoomCreateSheet", "SitOnBenches", rowNum);
//		String NoOfBenches = reader.getCellData("RoomCreateSheet", "NoOfBenches", rowNum);
//		
//		Object ob[] = {RoomType, RoomName, RoomDescription, SitOnBenches, NoOfBenches};
//		myData.add(ob);
//		
//	}
//	return myData;
//	
//}
public static String TESTDATA_SHEET_PATH = "C:\\Users\\Prashant\\eclipse-workspace\\RigAdminPanel\\"
		+ "src\\main\\java\\com\\rig\\qa\\testdata\\RigRoom.xlsx";

static Workbook book;
static Sheet sheet;




public static Object[][] getTestData(String sheetName) {
	FileInputStream file = null;
	try {
		file = new FileInputStream(TESTDATA_SHEET_PATH);
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
	try {
		book = WorkbookFactory.create(file);
	} catch (IOException e) {
		e.printStackTrace();
	}
	sheet = book.getSheet(sheetName);
	Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
	// System.out.println(sheet.getLastRowNum() + "--------" +
	// sheet.getRow(0).getLastCellNum());
	for (int i = 0; i < sheet.getLastRowNum(); i++) {
		for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
			data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
			// System.out.println(data[i][k]);
		}
	}
	return data;
}







































}
