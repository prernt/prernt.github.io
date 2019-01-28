package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class ModelPortfolioPage extends TestBase {
	
	//Object Repository
	@FindBy(id="btn-explore79")
	WebElement explore_button;
	
	public ModelPortfolioPage() {
		PageFactory.initElements(driver, this);
	}
	
	public WeatherPortfolioPage navigateToNext() {
		explore_button.click();
		return new WeatherPortfolioPage();
		}
}
