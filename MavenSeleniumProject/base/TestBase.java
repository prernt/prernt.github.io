package com.qa.base;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	
	public TestBase() { 
	
		System.setProperty("webdriver.chrome.driver", "C:/Users/MICROSOFT/Downloads/chromedriver.exe");
		driver = new ChromeDriver(); 
	
	driver.manage().window().maximize(); //maximize window
	driver.manage().deleteAllCookies(); //delete cookies
	
	driver.get("https://sfo-demo.herokuapp.com/model-portfolio");
	
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	
	
	}
}