package com.demoaut.newtours.TestScripts;

import java.util.concurrent.TimeUnit;

import org.junit.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

import com.demoaut.newtours.Pages.BookAFlight;
import com.demoaut.newtours.Pages.FlightFinder;
import com.demoaut.newtours.Pages.Login;
import com.demoaut.newtours.Pages.SelectFlight;

public class TicketBookTest {
	
	WebDriver driver;
	
	@BeforeTest
	public void openBrowser(){
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com");
		
	}
	
	@Test
	public void bookingTest(){
		Login lp = new Login(driver);
		FlightFinder ff = new FlightFinder(driver);
		SelectFlight sf = new SelectFlight(driver);
		BookAFlight bf = new BookAFlight(driver);
		/*
		 * we are calling the method that was created in the login class through an object
		 * the driver is the parameter provided. (taken from WebDriver driver).
		 * LOgin(driver) is also the constructor.
		 */
		lp.applicationLogin();
		ff.findFlight();
		sf.SelectFlights();
		bf.BookFlight();
	}

}
