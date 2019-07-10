package com.zohocrm1.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.zohocrm.qa.base.Test_Base;
import com.zohocrm1.qa.pages.ContactsPage1;
import com.zohocrm1.qa.pages.HomePage1;
import com.zohocrm1.qa.pages.LoginPage1;
import com.zohocrm1.qa.utilities.Test_Util;

public class ContactsPageTest1 extends Test_Base{
	
	LoginPage1 loginpage1;
	HomePage1 homepage1;
	ContactsPage1 contactspage1;
	
	
	
	public ContactsPageTest1()
	{
		super();
	}
	
	
	@BeforeMethod
	public void SetUp()
	{
		initialization();
		loginpage1=new LoginPage1();
		homepage1=new HomePage1(); 
		contactspage1=new ContactsPage1();
		loginpage1.Login();
		homepage1.clickoncontacts();
		
		
		
	}
	
	@Test(priority=1)
	public void verifyselcontact()
	{
		
		contactspage1.selectcondropdown();
	}
	
	@Test(priority=2)
	public void verifyclickondocs()
	{
		contactspage1.clickondocs();
		
		
	}
	
	
	//@Test(priority=3)
	
	@AfterMethod
	public void teardown()
	{
		/*
		 * Test_Util.signout(); driver.close();
		 */
		
	}
	

}
