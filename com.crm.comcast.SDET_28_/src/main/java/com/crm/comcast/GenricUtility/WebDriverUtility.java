package com.crm.comcast.GenricUtility;

import java.util.Iterator;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {
	
	/**
	 * It will wait 20 seconds till the element load in DOM
	 * @param driver
	 */

	public void waitForPageLoad(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
	}
	/**
	 * This method will wait till element is visible
	 * @param driver
	 * @param element
	 */
	
	public void waitForVisibilityofElement(WebDriver driver,WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOf(element));	
	}
	
	
	/**
	 * This method will wait till element to be clickable
	 * @param driver
	 * @param element
	 */
	
	public void waitForElementToBeClickl(WebDriver driver,WebElement element)
	{
	     WebDriverWait wait = new WebDriverWait(driver,20);
	     wait.until(ExpectedConditions.elementToBeClickable(element));
	     element.click();
	     
	}
	
	/**
	 * This method is used to wait for the element and do click operation
	 * @param element
	 * @throws InterruptedException
	 */

	
	public void waitAndClick(WebElement element) throws InterruptedException {
		
	
	int count=0;
	while(count<50) {
		try {
			element.click();
		}
		catch(Throwable e) {
			Thread.sleep(1000);
			count++;
			
		}
	}
}
	
/**
 * This method will select the element based on index
 * @param element
 * @param index
 */
	
		
public void selectOption(WebElement element,int index)
{
	Select select = new Select(element);
	select.selectByIndex(index);
}


/**
 * This method will select the element based on value
 * @param element
 * @param value
 */


public void selectOption(WebElement element,String value) {
	Select select = new Select(element);
	select.selectByValue(value);
	
}

/**
 * Method is used to select the value based on the text
 * @param text
 * @param element
 */

public void selectOption(String text,WebElement element)
{
	Select select = new Select(element);
	select.selectByVisibleText(text);
	
}

/**
 * This method will verify whether expected option is dropdown list or not 
 * @param element
 * @param expectedOptions
 * @return
 */

public WebElement verifyTheDropDownList(WebElement element,String expectedOptions)
{
	Select select = new Select(element);
	List<WebElement> option = select.getOptions();
	for(WebElement ele:option)
	{
		if(ele.equals(expectedOptions))
		{
			System.out.println("value is not present");
			return ele;
		}
		else
		{
			System.out.println("value is not present in dropdown");
		}
	}
	return null;
		
	}

/**
 * This method perform mouse hovering action
 * @param driver
 * @param element
 */

public void mouseOver(WebDriver driver,WebElement element)
{
	Actions action = new Actions(driver);
	action.moveToElement(element).perform();
}

/**
 * This method perform right click action
 * @param driver
 * @param element
 */

public void rightClick(WebDriver driver,WebElement element)
{
	Actions action = new Actions(driver);
	action.contextClick(element).perform();
}

/**
 * Used to perform Javascript click on webelement
 * @param driver
 * @param element
 */
	

public void jsClick(WebDriver driver,WebElement element) 
{
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].click", element);
	
}

/**
 * Method is used to send the value using javascript executor
 * @param driver
 * @param valueToEnter
 * @param element
 */

public void enterDataUsingJs(WebDriver driver,String valueToEnter,WebElement element)
{
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].value'"+valueToEnter+"'", element);
}


/**
 * This method will switch to different windows using partial title
 * @param driver
 * @param partialWindowTitle
 */

public void switchWindow(WebDriver driver,String partialWindowTitle) {
	Set<String> winIds = driver.getWindowHandles();
	Iterator<String> it = winIds.iterator();
	while(it.hasNext()) {
		String winId=it.next();
		String title=driver.switchTo().window(winId).getTitle();
		if(title.contains(partialWindowTitle)) {
			break;
		}
	}
}

/**
 * This method will screenShot the pictures
 * @param driver
 * @param testCaseName
 * @return
 */

public String screenShot(WebDriver driver,String testCaseName)
{
	JavaUtility jUtil = new JavaUtility();
	String filePath="./errorShots/"+testCaseName+jUtil.systemDateAndTime()+".png";
	TakesScreenshot ts = (TakesScreenshot)driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	File destination =new File(filePath);
	//Files.copy(source,destination);
	source.renameTo(destination);
	return filePath;
	
	
}
/**
 * This method will switch the frames based on the index passed
 * @param driver
 * @param index
 */

public void switchFrames(WebDriver driver,int index)
{
	driver.switchTo().frame(index);
}

/**
 * This method will switch the frames based on the name or ID passed
 * @param driver
 * @param index
 */

public void switchFrames1(WebDriver driver,int index)
{
	driver.switchTo().frame(index);
}

/**
 * This method will switch the frames based on the name or ID passed
 * @param driver
 * @param nameOrId
 */

public void switchFrames(WebDriver driver,String nameOrId)
{
	driver.switchTo().frame(nameOrId);
}

/**
 * This method will switch the frames based on the webelement passed
 * @param driver
 * @param element
 */

public void switchFrames(WebDriver driver,WebElement element)
{
	driver.switchTo().frame(element);
}
/**
 * Method will accepts the alert
 * @param driver
 */

public void acceptAlert(WebDriver driver)
{
	driver.switchTo().alert().accept();
}

/**
 * This method is click on dismiss button in alert popup
 * @param driver
 */

public void dismissAlert(WebDriver driver)
{
	driver.switchTo().alert().dismiss();
}

}




