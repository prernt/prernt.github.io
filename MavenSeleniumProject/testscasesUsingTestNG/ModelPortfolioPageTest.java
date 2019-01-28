package com.qa.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import com.qa.base.TestBase;
import com.qa.pages.ModelPortfolioPage;
import com.qa.pages.WeatherPortfolioPage;

public class ModelPortfolioPageTest extends TestBase {
	ModelPortfolioPage mpp;
	WeatherPortfolioPage wpp;
	public ModelPortfolioPageTest() {
	super();
	}
	
	@BeforeMethod
	public void setUp() {
		//initialize();
		 mpp = new ModelPortfolioPage();
	}
	
	@Test(priority = 1)
	public void navigating() {
		wpp = mpp.navigateToNext();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
}