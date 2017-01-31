package com.demoaut.newtours.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectFlight {
	
	private WebDriver driver;
	
	@FindBy(css = "input[value='Pangea Airlines$362$274$9:17']")
	@CacheLookup
	private WebElement Pangea;
	
	@FindBy(css = "input[value='Blue Skies Airlines$630$270$12:23']")
	@CacheLookup
	private WebElement BlueSkies;
	
	@FindBy(name="reserveFlights")
	@CacheLookup
	private WebElement reserve;
	
	public SelectFlight(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
		

}
	public void SelectFlights(){
		Pangea.click();
		BlueSkies.click();
		reserve.click();
	}
	}
	
