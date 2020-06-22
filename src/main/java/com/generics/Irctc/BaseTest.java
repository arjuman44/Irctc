package com.generics.Irctc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements Autoconstants {
	
public static WebDriver driver;
	
	@BeforeMethod
	public void OpenBrowser()
	{
		System.setProperty(chrome_key, chrome_value);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
		
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		//driver.quit();
	}


}
