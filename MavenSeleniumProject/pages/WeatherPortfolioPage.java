package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class WeatherPortfolioPage extends TestBase {

	@FindBy(xpath="//*[@id=\"page-top\"]/div[3]/section/div[1]/div/div/div/div/div[2]/div[1]/div[1]/a")
	WebElement customize_portfolio;
	
	public WeatherPortfolioPage() {
		PageFactory.initElements(driver, this);
	}
	
	public ExplorePortfolio_1Page navigateToNext() {
		customize_portfolio.click();
		return new ExplorePortfolio_1Page();
		}
}
