package com.demoaut.newtours.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FlightFinder {
	
	private WebDriver driver;
	
	@FindBy(css = "input[value='Business']")
	@CacheLookup 
	private WebElement businessClass;
	
	@FindBy(name="airline")
	@CacheLookup
	private WebElement airline;
	
	@FindBy(name="findFlights")
	@CacheLookup
	private WebElement submit;
	
	public FlightFinder(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	public void findFlight(){
		businessClass.click();//business class is a radio button so click action 
		Select flight = new Select(airline);//airline is a drop down box, so use select action 
		flight.selectByIndex(2);//use select by index if the drop down box has few choices
		submit.click();  
		
	}
}
