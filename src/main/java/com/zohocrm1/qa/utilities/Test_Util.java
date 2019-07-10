package com.zohocrm1.qa.utilities;

import org.openqa.selenium.By;

import com.zohocrm.qa.base.Test_Base;

public class Test_Util extends Test_Base {
	
	
	public static void switchframe(String nameid)
	{
		driver.switchTo().frame(nameid);
	}
	
	
	public static void signout()
	{
		driver.findElement(By.xpath("//img[@id='topdivuserphoto_22163000000062013']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Sign Out')]")).click();
	}

}
