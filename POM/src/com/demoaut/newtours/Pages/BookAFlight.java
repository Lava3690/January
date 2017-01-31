package com.demoaut.newtours.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookAFlight {
	
	private WebDriver driver;
	
	@FindBy(name="passFirst0")
	@CacheLookup
	private WebElement Firstname;
	
	@FindBy(name="passLast0")
	@CacheLookup
	private WebElement Lastname;
	
	@FindBy(name="creditnumber")
	@CacheLookup
	private WebElement Cardnumber;
	
	@FindBy (name="buyFlights")
	@CacheLookup
	private WebElement Purchase;
	
	public BookAFlight(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	  
				
	}
	
	public void BookFlight(){
		Firstname.sendKeys("Lav");
		Lastname.sendKeys("R");
		Cardnumber.sendKeys("1234567890123456");
		Purchase.click();
	}
	
	
	
	

}
