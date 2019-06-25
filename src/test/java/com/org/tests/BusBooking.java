package com.org.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.org.base.Base;
import com.relevantcodes.extentreports.LogStatus;

public class BusBooking extends Base {

	@Test(priority=1)
	public void validateSmartBusLink() {
		logger = extent.startTest("To validate Smart Bus Link on Home Page ", "Below given the steps.");
		driver.findElement(By.xpath("//*[@id=\"mobile-home\"]/div[1]/div[1]/div/a[1]")).click();
		logger.log(LogStatus.PASS, "Link is clicked");
	}
	
	@Test(priority=2)
	public void validateDetailsOfCityAndDate() {
		logger = extent.startTest("To validate city details and Date fillup form  ", "Below given the steps.");
		driver.findElement(By.xpath("//*[@id=\"from-city\"]")).sendKeys("Delhi");
		driver.findElement(By.xpath("//*[@id=\"to-city\"]")).sendKeys("Jaipur");
		driver.findElement(By.xpath("//*[@id=\"smart_bus_search_form\"]/div[2]/div/div[2]/a[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"sb_top_header\"]/div/div[1]/div[2]/div[1]/div/div[2]/button")).click();
		logger.log(LogStatus.PASS, "Travel details are added");
	}
	
	@Test(priority=3)
	public void validateSeatBookingProcess() {
		logger = extent.startTest("To validate seat booking process ", "Below given the steps.");
		driver.findElement(By.xpath("//*[@id=\"smartbus-list_pickup_v3\"]/div/div/div[2]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"bpdp_button\"]")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"lower\"]/div/div/div[4]/div[1]/div/div")).click();
		driver.findElement(By.xpath("//*[@id=\"seat_btn\"]")).click();
		logger.log(LogStatus.PASS, "Seat booking process is done");
	}
	
	@Test(priority=4)
	public void validatePasasngerDetailsForm() {
		logger = extent.startTest("To validate passanger details form ", "Below given the steps.");
		//Enter the name and age
		driver.findElement(By.xpath("//*[@id=\"f-name-1\"]")).sendKeys("Arun Salvi");
		driver.findElement(By.xpath("//*[@id=\"paxage-1\"]")).sendKeys("33");
		
		//Click on Continue button
		driver.findElement(By.xpath("//*[@id=\"pax_detail\"]/div[2]/div[2]/a")).click();
		
		//Enter the Email and Mobile 
		driver.findElement(By.xpath("//*[@id=\"cnt-email-1\"]")).sendKeys("arun.salvi.qa@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"cntmob-1\"]")).sendKeys("8239285447");
		
		logger.log(LogStatus.PASS, "passanger details are filled ");
		System.out.println("Redirected to Payment method");
		
	}
	
}
