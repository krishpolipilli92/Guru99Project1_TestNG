package com.guru99.Testcases;






import java.io.File;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.guru99.Utilities.ReadConfig;

public class BaseClass {
	ReadConfig rc=new ReadConfig();
	public String url=rc.getapplication();
	public String username=rc.getusername();
	public String password =rc.getpassword();
	public String Chromepath= rc.getchromedriverpath();
	public static WebDriver driver;
	public  Logger lgr;
	
	@Parameters("browser")
	@BeforeClass
	public void setup(String br) {
		
	if(br.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", Chromepath);
		driver=new ChromeDriver();
	}
		 lgr =  LogManager.getLogger(BaseClass.class.getName());
		 driver.get(url);
		 lgr.info("opened url");
		 
		
	}
	
    @AfterClass
	public void teardown() {
		driver.quit();
	}
}
