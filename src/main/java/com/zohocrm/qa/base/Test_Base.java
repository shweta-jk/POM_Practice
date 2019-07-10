package com.zohocrm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test_Base {
	
	public static WebDriver driver;
	public static Properties prop;
	
	FileInputStream fis;
	
	public Test_Base()
	{
		try {
			
			prop=new Properties();
	
			fis=new FileInputStream("C:\\Users\\skulkarni74\\eclipse-workspace\\POM_Practice_Project\\src\\main\\java\\com\\zohocrm1\\qa\\config\\config.properties");
			prop.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public static void initialization()
	{
		//System.out.println(prop.getProperty("browser"));
		String browsername=prop.getProperty("browser");
		if(browsername.equals("Chrome"))
		{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\skulkarni74\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		}
		else if(browsername.equals("Firefox"))
		{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\skulkarni74\\Downloads\\geckodriver");
		driver=new FirefoxDriver();
		}
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
		
		
			
	}

}

