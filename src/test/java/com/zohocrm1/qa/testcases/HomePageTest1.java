package com.zohocrm1.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.zohocrm.qa.base.Test_Base;
import com.zohocrm1.qa.pages.ContactsPage1;
import com.zohocrm1.qa.pages.HomePage1;
import com.zohocrm1.qa.pages.LoginPage1;

public class HomePageTest1 extends Test_Base {
	HomePageTest1 homepaget1;
	HomePage1 homepage1;
	ContactsPage1 contactspage1;
	LoginPage1 loginpage1;
	
	
	public HomePageTest1()
	{
		super();
	}
	
@BeforeMethod	
	public void Setup()
	{
		initialization();
		loginpage1=new LoginPage1();
		homepaget1=new HomePageTest1();
		homepage1=new HomePage1();
		contactspage1=new ContactsPage1();
		homepage1=loginpage1.Login();
	}
	
@Test(priority=1)	
	public void verifyusernametest()
	{
		boolean uname=homepage1.verifyusername();
		Assert.assertTrue(uname);
		
	}

@Test(priority=2)	
	public void verifycontactlinktest()
	{
		contactspage1=homepage1.clickoncontacts();
	}

@AfterMethod
public void teardown()
{
	driver.close();
}
}
