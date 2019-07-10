package com.zohocrm1.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zohocrm.qa.base.Test_Base;

public class HomePage1 extends Test_Base {
	
	@FindBy(xpath="//span[@id='show-uName']")
	WebElement verusername;
	
	
	@FindBy(xpath="//a[contains(text(),'Contacts')]")
	WebElement contacts;
	
	
	
	
	public HomePage1()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	public boolean verifyusername()
	{
		 boolean usernamedisp=verusername.isDisplayed();
		 
		 return usernamedisp;
			
	}
	
	public ContactsPage1 clickoncontacts()
	{
		contacts.click();
		return new ContactsPage1();
	}
	

}
