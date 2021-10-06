package com.guru99.pageobjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	
	WebDriver ldriver;
	
	
	public LoginPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(ldriver, this);
	}

	@FindBy(xpath="/html/body/header/div[1]/div/div/div[2]/div/div/a[2]")
	private WebElement loginbutton;
	
	@FindBy(xpath= "/html/body/div[1]/div/div[2]/div[2]/div/form/div[1]/div/input")
	private WebElement Username;
	
	@FindBy(xpath= "/html/body/div[1]/div/div[2]/div[2]/div/form/div[2]/div[1]/input")
	private WebElement password;
	
    @FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div/form/div[3]/button")
    private WebElement login_btn;
    
    public void click_loginbutton() {
    	WebDriverWait wait= new WebDriverWait(ldriver, 10);       
        wait.until(ExpectedConditions.visibilityOf(loginbutton));
    	loginbutton.click();
    }
    
    public void setusername(String uname) {
    	WebDriverWait wait= new WebDriverWait(ldriver, 10);       
        wait.until(ExpectedConditions.visibilityOf(Username));
    	Username.sendKeys(uname);
    	
    }
    
    public void setpassword(String pwd) {
    	WebDriverWait wait= new WebDriverWait(ldriver, 10);       
        wait.until(ExpectedConditions.visibilityOf(password));
    	password.sendKeys(pwd);
    	
    }
    
    public void clicklogin_btn() {
    	login_btn.click();
    }
}
