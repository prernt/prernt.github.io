package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class SuggestionsPage extends TestBase {

	@FindBy(xpath="//*[@id=\"suggestion-page-body\"]/div/div/div[4]/div[2]/div/div/ul/li[1]/div/div/div[3]/span[1]")
	WebElement verifySliderValue;
	
	public  SuggestionsPage() {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement validateSliderValue() {
		
		return verifySliderValue;
		
	}
}
