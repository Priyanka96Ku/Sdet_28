package com.crm.comcast.GenricUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * 
 * @author PRIYAMKA
 *
 */

public class FileUtility {
	
	/**
	 * this method will fetch the data from property file based on the key passed
	 * @param Key
	 * @return
	 * @throws IOException
	 */
	
	
		public String getPropertyFileDate(String Key) throws IOException
	{
		FileInputStream file = new FileInputStream(IPathConstants.PROPERTY_FILEPATH);
		Properties property = new Properties();
		property.load(file);
		return property.getProperty(Key);
	}

}
