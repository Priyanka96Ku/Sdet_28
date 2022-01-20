package practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateProduct {
	@BeforeClass
	public void bc() {
		System.out.println("launch the browser");
	}
	
	@AfterClass
	public void ac() {
		System.out.println("quite the browser");
	}
	@BeforeMethod
	public void bm() {
		System.out.println("Login to application");
		
	}
	@AfterMethod
	public void af() {
		System.out.println("Logout application");
		
	}
	
	@Test(priority=1)
	public void org() {
		
		System.out.println("Navigate to product");
		
		System.out.println("create the product");
		
		System.out.println("verify product");
		
		
	}
	
	@Test(priority=2)
	public void contact() 
	{
       System.out.println("Navigate to product");
		
		System.out.println("create the product");
		
		System.out.println("verify product");
		
		
	}
	
	@Test(priority=3)
	public void product() 
	{
       System.out.println("Navigate to product");
		
		System.out.println("create the product");
		
		System.out.println("verify product");
	}
		
	
	
	
		
	}
	


