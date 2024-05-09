package com.rig.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.rig.qa.util.TestUtil;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase(){
	
		try{
	prop = new Properties();
		
		FileInputStream ip = new FileInputStream("C:\\Users\\Prashant\\eclipse-workspace\\RigAdminPanel\\"
				+ "src\\main\\java\\com\\rig\\qa\\config\\config.properties");
		
		prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	@SuppressWarnings("deprecation")
	public static void initialization() {
		String BrowserName = prop.getProperty("browser");
		if(BrowserName.equals("chrome")) {
			System.setProperty("webdriver.Chrome.driver", "C:\\Users\\Prashant\\Downloads\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(BrowserName.equals("FF")){
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Prashant\\Downloads\\geckodriver.exe");	
			driver = new FirefoxDriver(); 
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
		
		
		
		
	}

}
