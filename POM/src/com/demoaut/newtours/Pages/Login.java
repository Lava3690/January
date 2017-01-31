package com.demoaut.newtours.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
/*
 * private WebElement x = driver.findElement(By.name("userName"))
 * Equivalent of above line is written below(see @FindBy and private WebElement)
 */

	private WebDriver driver;//whenever we declare variables, we declare as private
	
	@FindBy(name = "userName")
	@CacheLookup
	private WebElement user ;//user,pass and submit are fields or variables created at the class level.not used anywhere else
	
	@FindBy(name = "password")
	@CacheLookup
	private WebElement pass;
	
	@FindBy(name = "login")
	@CacheLookup
	private WebElement submit;
	
	/*
	 * create a constructor - doesn't have a return type. name is same as that of class
	 */
	public Login(WebDriver driver){//webdriver driver is a parameter. driver here is referring to driver from first page(ticketbooktest)
		this.driver = driver;
		/*
		 * attributes of driver from the TicketBookTest will be passed to driver
		 * this.driver is used to differentiate between the driver used on left hand side (webdriver driver)
		 * & driver on right hand side(driver from first page - ticketbooktest.
		 */
		PageFactory.initElements(driver, this);//initialize action
		
	}
	public void applicationLogin(){//the above action is represented by a method.
		user.sendKeys("mercury");//Using the above created variables
 		pass.sendKeys("mercury");
		submit.click();

	}
}



