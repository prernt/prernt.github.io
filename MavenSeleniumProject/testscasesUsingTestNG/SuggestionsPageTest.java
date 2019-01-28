package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.SuggestionsPage;

public class SuggestionsPageTest extends TestBase {

	SuggestionsPage sp;
	public SuggestionsPageTest() {
	super();
	}
	
	@BeforeMethod
	public void setUp() {
		//initialize();
		 sp = new SuggestionsPage();
	}
	
	@Test(priority=1)
	public void validateSliderValue() {
	Assert.assertTrue(sp.validateSliderValue().equals(50));
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
