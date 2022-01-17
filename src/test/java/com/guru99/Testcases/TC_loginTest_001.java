package com.guru99.Testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.guru99.pageobjects.LoginPage;

public class TC_loginTest_001 extends BaseClass{
	
	@Test
	public void logintest() {
		

		
		LoginPage lp =new LoginPage(driver);
		lp.setusername(username);
		lgr.info("entered username");
		lp.setpassword(password);
		lgr.info("entered password" );
		lp.clicklogin_btn();
		
		System.out.println(driver.getTitle());
	    Assert.assertTrue(driver.getTitle().equalsIgnoreCase("Dashboard - PHPTRAVEL"), "Passed");
		
	}

}
