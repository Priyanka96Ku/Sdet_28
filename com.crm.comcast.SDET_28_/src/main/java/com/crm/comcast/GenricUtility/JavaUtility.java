package com.crm.comcast.GenricUtility;


import java.util.Date;
import java.util.Random;

/**
 * 
 * @author PRIYAMKA
 *
 */

public class JavaUtility {
	
	/**
	 * This method will return random number
	 * @return
	 */
	
	
	public int getRandomNumber() 
	{
		Random ran = new Random();
		int randomNumber=ran.nextInt(5000);
		return randomNumber;
	}
		
/**
 * This method will return systemDateAndTime	
 * @return 
 * @return
 */

public String systemDateAndTime()
{
	Date date = new Date();
	String dateAndTime = date.toString();
	return dateAndTime;
	
	
}
	
}




