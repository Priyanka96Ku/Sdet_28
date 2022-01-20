package com.crm.comcast.ObjectReposatory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateProductPage {
	public CreateProductPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(name="productname")
	private WebElement productTextField;
	
	@FindBy(id="unit_price")
	private WebElement unitPriceTextField;
	
	
	
	
	
	@FindBy(name = "button")
	private WebElement saveButton;

	
		//getter logic
			

	public WebElement getProductTextField() {
		return productTextField;
	}

	

	public WebElement getUnitPriceTextField() {
		return unitPriceTextField;
	}

	

	public WebElement getSaveButton() {
		return saveButton;
	}



//bussiness logic
	/**
	 * This method will create an organization
	 * @param orgNmae
	 */
	
	public void createProduct(String proName) {
		productTextField.sendKeys(proName);
		
		
	}
	
	public void createunitPrice(String value)
	{
		unitPriceTextField.sendKeys(value);
		saveButton.click();
		
		
		
	}
	
	}



	 
	



	 


		 
