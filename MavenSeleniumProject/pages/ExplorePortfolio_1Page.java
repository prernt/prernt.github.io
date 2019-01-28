package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class ExplorePortfolio_1Page extends TestBase {
	
	@FindBy(xpath="//*[@id=\"customise-portfolio\"]/div/div[2]/div/div[1]/div[3]/a")
	WebElement en_control;
	
	@FindBy(xpath="//*[@id=\"customise-portfolio\"]/div/div[2]/div/div[1]/div[2]/a")
	WebElement rebalance;
	
	@FindBy(xpath="//*[@id=\"customise-portfolio\"]/div/div[2]/div/div[1]/div[4]/a")
	WebElement invest;
	
	@FindBy(xpath="//*[@id=\"customise-portfolio\"]/div/div[2]/div/div[3]/div/div[1]/div[4]/div/a")
	WebElement first_add_stock;
	
	@FindBy(xpath="//*[@id=\"customise-portfolio\"]/div/div[2]/div/div[3]/div/div[2]/div[2]/div[2]/input")
	WebElement slider_element;
	
	@FindBy(xpath="//*[@id=\"modal-1\"]/div/div/div[2]/div/div/div[66]/div[4]/button")
	WebElement second_add_stock;
	
	@FindBy(xpath="//*[@id=\"modal-1\"]/div/div/div[3]/button")
	WebElement done_adding_stock;
	
	@FindBy(xpath="//*[@id=\"customise-portfolio\"]/div/div[2]/div/div[3]/div/div[15]/div[3]/a")
	WebElement stock;
	
	public  ExplorePortfolio_1Page() {
		PageFactory.initElements(driver, this);
	}
	
	public String validateChangeToReset() {
		en_control.click();
		return en_control.getText();
	}
	
	public String getStockName() {
		return stock.getText();
	}
	
	public void moveSlider() {
	int x = slider_element.getLocation().getX();	
	Actions action = new Actions(driver);
	action.clickAndHold(slider_element).moveByOffset(x-292, 0).release().build().perform();
	}
	
	public String getSliderValue() {
		return slider_element.getAttribute("value");
	}
	
	public void rebalanceSlider() {
		rebalance.click();
	}
	
	public void toAddStock() {
		first_add_stock.click();
		second_add_stock.click();
		done_adding_stock.click();
	}
	
	public SuggestionsPage navigation() {
		invest.click();
		return new SuggestionsPage();
	}

}
