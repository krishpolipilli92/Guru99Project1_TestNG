package com.guru99.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadConfig {

	Properties pro;
	public ReadConfig() 
	{
		File src= new File("./Config_files/config.properties");
		
			
			try 
			{
				FileInputStream fis = new FileInputStream(src);
				pro=new Properties();
				pro.load(fis);
			} catch (Exception e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}	
public String getapplication() {
		
		String baseurl=pro.getProperty("url");
		return baseurl;
		
	}
public String getchromedriverpath() {
	String chrmpath= pro.getProperty("ChromeDriverpath");
	return chrmpath;
}
public String getusername() {
	String usrname= pro.getProperty("username");
	return usrname;
}
public String getpassword() {
	String pwd= pro.getProperty("password");
	return pwd;
}

}
