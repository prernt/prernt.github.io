package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.ExplorePortfolio_1Page;
import com.qa.pages.SuggestionsPage;

public class ExplorePortfolio_1PageTest extends TestBase  {
	
	ExplorePortfolio_1Page epp;
	SuggestionsPage sp;
	public ExplorePortfolio_1PageTest() {
	super();
	}
	
	@BeforeMethod
	public void setUp() {
		//initialize();
		 epp = new ExplorePortfolio_1Page();
	}
	
	@Test(priority = 1)
	public void customEnabled() {
	String text_value = epp.validateChangeToReset();
	Assert.assertTrue(text_value.equals("Reset"));
	}
	
	@Test(priority = 2)
	public void addStock() {
	epp.toAddStock();
	}
	
	@Test(priority = 3)
	public void validateAddedStock() {
	String stock = epp.getStockName();
	Assert.assertTrue(stock.equals("BT Group plc"));
	}
	
	@Test(priority = 4)
	public void playWithSlider() {
	epp.moveSlider();
	String slider_value = epp.getSliderValue();
	Assert.assertTrue(slider_value.equals("50"));
	}
	
	@Test(priority = 5)
	public void rebalanceSlider() {
		String slider_value = epp.getSliderValue();
		//Assert.assertTrue(slider_value.equals("50"));
		System.out.print(slider_value);
	}
	
	@Test(priority = 6)
	public void navigationNext() {
		sp = epp.navigation();
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
