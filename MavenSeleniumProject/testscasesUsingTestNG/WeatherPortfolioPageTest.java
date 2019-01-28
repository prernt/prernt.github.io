package com.qa.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.ExplorePortfolio_1Page;
import com.qa.pages.WeatherPortfolioPage;

public class WeatherPortfolioPageTest extends TestBase {

	WeatherPortfolioPage wpp;
	ExplorePortfolio_1Page epp;
	
	public WeatherPortfolioPageTest() {
	super();
	}
	
	@BeforeMethod
	public void setUp() {
		//initialize();
		 wpp = new WeatherPortfolioPage();
	}
	
	@Test(priority = 1)
	public void navigating() {
		epp = wpp.navigateToNext();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
