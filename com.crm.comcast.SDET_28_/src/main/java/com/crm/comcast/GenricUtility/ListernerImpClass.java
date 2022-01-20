package com.crm.comcast.GenricUtility;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListernerImpClass implements ITestListener {

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) {

		
		String testCaseName = result.getMethod().getMethodName();
		System.out.println(testCaseName);
		
		//take screen-shot code
		EventFiringWebDriver event = new EventFiringWebDriver(BaseClass.sdriver);
	    File source = event.getScreenshotAs(OutputType.FILE);
        File destination = new File("./errorShots/" + testCaseName+ ".png");
	try {
		FileUtils.copyFile(source, destination);
		//source.renameTo(destination);
	} catch (Exception e)
	{
		e.printStackTrace();
	}
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

		
}