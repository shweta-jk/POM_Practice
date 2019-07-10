package com.zohocrm1.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.zohocrm.qa.base.Test_Base;
import com.zohocrm1.qa.utilities.Test_Util;

public class ContactsPage1 extends Test_Base {

	@FindBy(xpath="//*[@id=\"combo\"]")
	WebElement condropdown;
	
	@FindBy(xpath="//span[@class='cbViews' and contains(text(),'Mailing Labels')]")
	WebElement dropvalue;
	
	@FindBy(xpath="//span[@class='lyteDot svgIconsImg' and @data-zcqa='tab_menu_more']")
	WebElement dots;
	
	@FindBy(xpath="//a[@href='/crm/org60000926275/tab/Documents']")
	WebElement documents;
	
	@FindBy(xpath="//span[@id='wsuploadmenu']")
	WebElement upload;
	
	@FindBy(xpath="//li[@id='upload_desktopfile']")
	WebElement filec;
	
	@FindBy(xpath="//span[contains(text(),'Start Upload')]")
	WebElement startupld;
	
	
	//#combo
	//*[@id="combo"]
	
	public ContactsPage1()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void selectcondropdown()
	{
		
		  condropdown.click();
		  dropvalue.click();
		
	}
	
	public void clickondocs()
	{
		dots.click();
		documents.click();
		Test_Util.switchframe("externalIframe");
		upload.click();
		filec.click();
		try {
			Runtime.getRuntime().exec("C:\\Users\\skulkarni74\\Desktop\\fileupload.exe");
			Thread.sleep(10000);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		startupld.click();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.switchTo().defaultContent();
		
		
		
		
	}
	
}
