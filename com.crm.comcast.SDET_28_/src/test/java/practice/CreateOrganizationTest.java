package practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CreateOrganizationTest {
	public static void main(String[]args) throws IOException
	{

	//get the data from property file
		FileInputStream fis = new FileInputStream("./src/test/resource/data1.properties");
		Properties property = new Properties();
		property.load(fis);
		
		String browser=property.getProperty("browser");
		String url=property.getProperty("url");
		String username=property.getProperty("username");
		String password=property.getProperty("password");
		
		System.setProperty("webdriver.chrome.driver", "./src/main/resource/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
		driver.findElement(By.name("user_name")).sendKeys(username);
		driver.findElement(By.name("user_password")).sendKeys(password);
		driver.findElement(By.id("submitButton")).click();
		
		driver.findElement(By.linkText("Organizations")).click();
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
		driver.findElement(By.name("accountname")).sendKeys("Testyantra software");
		driver.findElement(By.name("button")).click();
		
		WebElement profileImg = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		 Actions action = new Actions(driver);
		action.moveToElement(profileImg).perform();
		driver.findElement(By.linkText("Sign Out")).click();
		
		
		driver.quit();
	}
		
		
		
		

}
