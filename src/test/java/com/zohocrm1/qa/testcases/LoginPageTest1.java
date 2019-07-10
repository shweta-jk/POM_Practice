package com.zohocrm1.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.zohocrm.qa.base.Test_Base;
import com.zohocrm1.qa.pages.HomePage1;
import com.zohocrm1.qa.pages.LoginPage1;

public class LoginPageTest1 extends Test_Base {
	
	public LoginPageTest1()
	{
		super();
	}
	
	
	LoginPage1 loginpage1;
	HomePage1 homepage1;
	
	
	
	
	
@BeforeMethod

public void Setup()
{
	initialization();
	loginpage1=new LoginPage1();
	
}

@Test(priority=1)
public void verifyLogintest()
{
	loginpage1.Login();
}

@Test(priority=2)
public void verifypagetitle()
{ 	SoftAssert sassert=new SoftAssert();
	String title1=loginpage1.Getpagetitle();
	sassert.assertEquals(title1, "Zoho CRM - Home Page","Title is not same");
	sassert.assertAll();
}
	
@AfterMethod
public void teardown()
{
	driver.close();;
	
}
		
	

}
