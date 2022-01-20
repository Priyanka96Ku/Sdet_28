package com.crm.comcast.ObjectReposatory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.comcast.GenricUtility.WebDriverUtility;

public class ProductPage extends WebDriverUtility {
	
	public ProductPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(xpath = "//img[@title='Create Product...']")
	private WebElement clickonPlus;
	
	@FindBy(id="27")
	private WebElement checkbox1;
	
	@FindBy(id="30")
	private WebElement checkbox2;
	
	@FindBy(xpath = "(//input[@value='Mass Edit'])[1]")
	private WebElement massedit;
	
	@FindBy(xpath = "//input[@class='crmbutton small delete'][1]")
	private WebElement delete;


	@FindBy(xpath = "//img[@src='themes/softed/images/Home.PNG']")
	private WebElement backtohomepage;
	
	@FindBy(id="bas_searchfield")
	private WebElement searchDropDown;
	
	@FindBy(linkText = "Unit Price")
	private WebElement selectToUnitPrice;
	
	
	
//getters method


	public WebElement getSearchDropDown() {
		return searchDropDown;
	}
	public WebElement getClickonPlus() {
		return clickonPlus;
	}
	public WebElement getBacktohomepage() {
		return backtohomepage;
	}
	public WebElement getMassedit() {
		return massedit;
	}
	public WebElement getCheckbox1() {
		return checkbox1;
	}
	
	public WebElement getCheckbox2() {
		return checkbox2;
	}
	
	public WebElement getDelete() {
		return delete;
	}
	
	
		
		//business logics

		/**
		 * This method will click on createPro PlusImage
		 */
		
		public void clickCreateProImg()
		{
			clickonPlus.click();
		}
		
		public void clickcheckbox()
		{
			checkbox1.click();
			checkbox2.click();
				
			}
		
		public void masseditclick()
		{
			massedit.click();
			backtohomepage.click();
		}
		 
		public void deleteclick()
		{
			delete.click();
		}
		
		public void clickOnDropDownAndSelectUnitPrice(String UP) {
			searchDropDown.click();
			selectOption(UP, selectToUnitPrice);
			
		}
		
		
		}
		

		
	


	
	
	
	
	


