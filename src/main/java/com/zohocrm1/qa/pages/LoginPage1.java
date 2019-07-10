package com.zohocrm1.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zohocrm.qa.base.Test_Base;

public class LoginPage1  extends Test_Base{
	
	@FindBy(xpath="//a[contains(text(),'LOGIN')]")
	WebElement login;
	
	

	@FindBy(xpath="//input[@name='lid']")
	WebElement username;
	

	@FindBy(xpath="//input[@name='pwd']")
	WebElement password;
	
	

	@FindBy(xpath="//div[@id='signin_submit']")
	WebElement signin;
	
	
	public LoginPage1()
	{
		PageFactory.initElements(driver, this);
		
	}
	
	
	public HomePage1 Login()
	{
		login.click();
		username.sendKeys(prop.getProperty("username"));
		password.sendKeys(prop.getProperty("password"));
		signin.click();
		return new HomePage1();
		
	}
	
	public String Getpagetitle()
	{
		return(driver.getTitle());
	}
	
	
	
	
	
	

}
