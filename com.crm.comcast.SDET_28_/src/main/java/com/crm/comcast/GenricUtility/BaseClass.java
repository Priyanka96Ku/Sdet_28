package com.crm.comcast.GenricUtility;

import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.crm.comcast.ObjectReposatory.HomePage;
import com.crm.comcast.ObjectReposatory.LoginPage;

/**
 * This is the base class which contains all the configuration annotation
 * @author PRIYAMKA
 *
 */

public class BaseClass {
	public WebDriver driver;
	public static WebDriver sdriver;
	public FileUtility fUtil=new FileUtility();
	public  WebDriverUtility wUtility=new WebDriverUtility();
	public JavaUtility jUtility=new JavaUtility();
	public  ExcelUtility eUtility=new ExcelUtility();
	
	@BeforeSuite
	public void configBs() {
		//connection to database
		System.out.println("=====Connect to DB=====");
	}

	
	@BeforeClass
	public void configBc() throws Throwable {
	//launching the browser
	String browser = fUtil.getPropertyFileDate("browser");
	String url = fUtil.getPropertyFileDate("url");
	
	if(browser.equals("chrome")) {
		System.setProperty(IPathConstants.CHROME_KEY, IPathConstants.CHROME_PATH);
		driver=new ChromeDriver();
	}
	else {
		System.out.println("browser is not available");
	}
	sdriver=driver;
	driver.manage().window().maximize();
	 wUtility.waitForPageLoad(driver);
	driver.get(url);
	}
	
	
	@BeforeMethod
	public void configBm() throws Throwable {
		//login application
		
		String username=fUtil.getPropertyFileDate("username");
		String password=fUtil.getPropertyFileDate("password");
		LoginPage login = new LoginPage(driver);
		login.loginToApplication(username, password);
		
	}
	
	@AfterMethod
	public void configAm() {
	HomePage homePage = new HomePage(driver);
	homePage.logout();
	
	
}
	
	@AfterClass
	public void configAc() {
		//closing or quiting the browser
		driver.quit();	
	}
	@AfterSuite
	public void configAs() {
		//closing the database connection
		System.out.println("***Database connection is closed");
		
	}
		
	}
	
	
