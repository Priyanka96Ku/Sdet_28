package com.crm.comcast.ObjectReposatory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.comcast.GenricUtility.WebDriverUtility;

public class ProductInformationPage {
	
	private static final String Productdropdown = null;

	private static final WebElement Productname = null;



	public ProductInformationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//td[@class='dvtSelectedCell']")
	private WebElement proInfoText;
	
	@FindBy(name = "query_string")
	private WebElement searchtext;
	
	@FindBy(xpath = "//input[@class='searchBtn']")
	private WebElement searchbutton;
	
			
	
	//getter method
	
	public WebElement getProInfoText1() {
		return proInfoText;
	}
	
	public WebElement getSearchtext() {
		return searchtext;
	}
	public WebElement getSearchbutton() {
		return searchbutton;
	}
	
	
	

	// business logic

	

	public String getProInfoText() {
		return  proInfoText.getText();
	}
	
	public void clickOnSearch(String pname)
	{
		searchtext.sendKeys(pname);
	}
	public void seachbuttonforproduct()
	{
		searchbutton.click();
	}
		
	
		}


	

