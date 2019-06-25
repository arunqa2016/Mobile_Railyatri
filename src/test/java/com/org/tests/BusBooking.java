package com.org.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.org.base.Base;
import com.org.pages.HomePage;
import com.relevantcodes.extentreports.LogStatus;

public class BusBooking extends Base {

	HomePage homePage = new HomePage();
	
	@Test(priority=1)
	public void validateSmartBusLink() {
		logger = extent.startTest("To validate Smart Bus Link on Home Page ", "Below given the steps.");
		homePage.clickOnSmartBusLink();
		logger.log(LogStatus.PASS, "Link is clicked");
	}
	
	@Test(priority=2)
	public void validateDetailsOfCityAndDate() {
		logger = extent.startTest("To validate city details and Date fillup form  ", "Below given the steps.");
		homePage.fillCityAndDate();
		logger.log(LogStatus.PASS, "Travel details are added");
	}
	
	@Test(priority=3)
	public void validateSeatBookingProcess() {
		logger = extent.startTest("To validate seat booking process ", "Below given the steps.");
		homePage.fillSeat();
		logger.log(LogStatus.PASS, "Seat booking process is done");
	}
	
	@Test(priority=4)
	public void validatePasasngerDetailsForm() {
		logger = extent.startTest("To validate passanger details form ", "Below given the steps.");
		homePage.fillPasangerDetails();
		logger.log(LogStatus.PASS, "passanger details are filled ");
		System.out.println("Redirected to Payment method");
		
	}
	
}
