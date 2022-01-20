package com.crm.comcast.ObjectReposatory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.comcast.GenricUtility.WebDriverUtility;

public class HomePage extends WebDriverUtility{
	
	//initialization of elements
	
	 WebDriver driver;
	 public HomePage(WebDriver driver) {
		 PageFactory.initElements(driver, this);
		 this.driver=driver;	 
	 }
	 
	 //declaration of elements
	 
	@FindBy(linkText = "Products")
	private WebElement productLink;
	
	@FindBy(id = "alpha_14")
	private WebElement characterButton;
	 
	 @FindBy (xpath="//img[@src='themes/softed/images/user.PNG']" )
     private WebElement logoutImg;
	 
	 @FindBy(linkText="Sign Out")
	 private WebElement signOutLink;
	 
	 @FindBy(id="bas_searchfield")
	 private WebElement searchText;
	 
	 //getters methods
	 
	 public WebElement getProductLink() {
			return productLink;
		}


		public WebElement getCharacterButton() {
		return characterButton;
	}


		public WebElement getLogoutImg() {
			return logoutImg;
		}

		

		public WebElement getSignOutLink() {
			return signOutLink;
		}
			
			
			public WebElement getSearchText() {
				return searchText;
			}	


	//business logics 
	

	/**
	 * This method will click on Product link
	 */
	
	public void clickProductLink() {
		productLink.click();
			
	}
	/**
	 * This method will perform logout action
	 */
	
	public void logout() {
		mouseOver(driver,logoutImg);
		signOutLink.click();
	}
		
		
		public void clickCharacterButton() {
			characterButton.click();
		}
		
		public void searchText() {
			searchText.click();
		}


	
			
		}
		
		

	 
	 
	 
	 
	
	


