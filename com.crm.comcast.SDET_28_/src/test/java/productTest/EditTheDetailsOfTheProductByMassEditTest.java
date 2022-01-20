package productTest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.comcast.GenricUtility.BaseClass;
import com.crm.comcast.GenricUtility.ExcelUtility;
import com.crm.comcast.GenricUtility.FileUtility;
import com.crm.comcast.GenricUtility.IPathConstants;
import com.crm.comcast.GenricUtility.JavaUtility;
import com.crm.comcast.GenricUtility.WebDriverUtility;
import com.crm.comcast.ObjectReposatory.CreateProductPage;
import com.crm.comcast.ObjectReposatory.HomePage;
import com.crm.comcast.ObjectReposatory.LoginPage;
import com.crm.comcast.ObjectReposatory.ProductInformationPage;
import com.crm.comcast.ObjectReposatory.ProductPage;

@Listeners(com.crm.comcast.GenricUtility.ListernerImpClass.class)


public class EditTheDetailsOfTheProductByMassEditTest  extends BaseClass {
	
	@Test (groups= {"smokeTest"})
	public void EdittheDetailsofProductbyMassEdit() throws Throwable
	{

        int randomNumber = jUtility.getRandomNumber();
		String exceptedProductName=eUtility.getStringCellDate(IPathConstants.SHEET_NAME, 7, 3);
		exceptedProductName=exceptedProductName+randomNumber;
		
		//click on product
		HomePage homepage=new HomePage(driver);
		homepage.clickProductLink();
		
		ProductPage productpage=new ProductPage(driver);
		productpage.clickCreateProImg();
		
		//create new product
		CreateProductPage createProduct=new CreateProductPage(driver);
		createProduct.createProduct(exceptedProductName);
		
		//search for product
		ProductInformationPage productinfo=new ProductInformationPage(driver);
		productinfo.clickOnSearch(exceptedProductName);
		productinfo.seachbuttonforproduct();
		
		homepage.clickProductLink();
		productpage.clickcheckbox();
		productpage.masseditclick();
	
		
		
        
		
		
}
}


