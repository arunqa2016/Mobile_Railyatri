package com.org.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.org.base.Base;

public class HomePage extends Base {

	public void clickOnSmartBusLink() {
		driver.findElement(By.xpath(prop.getProperty("smartBus_Link"))).click();
	}
	
	public void fillCityAndDate() {
		driver.findElement(By.xpath(prop.getProperty("from_city"))).sendKeys(prop.getProperty("city_from"));
		driver.findElement(By.xpath(prop.getProperty("to_city"))).sendKeys(prop.getProperty("city_to"));
		driver.findElement(By.xpath(prop.getProperty("date"))).click();
		driver.findElement(By.xpath(prop.getProperty("search_button"))).click();
		
	}
	
	public void fillSeat() {
		driver.findElement(By.xpath(prop.getProperty("bus_list"))).click();
		driver.findElement(By.xpath(prop.getProperty("boarding_point"))).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.findElement(By.xpath(prop.getProperty("select_seat"))).click();
		driver.findElement(By.xpath(prop.getProperty("select_seat"))).click();
		driver.findElement(By.xpath(prop.getProperty("continue_1"))).click();
		
	}
	
	public void fillPasangerDetails() {
		//Enter the name and age
		driver.findElement(By.xpath(prop.getProperty("name"))).sendKeys(prop.getProperty("Passanger_Name"));
		driver.findElement(By.xpath(prop.getProperty("age"))).sendKeys(prop.getProperty("Age"));
				
		//Click on Continue button
		driver.findElement(By.xpath(prop.getProperty("continue_2"))).click();
				
		//Enter the Email and Mobile 
		driver.findElement(By.xpath(prop.getProperty("email"))).sendKeys(prop.getProperty("Email"));
		driver.findElement(By.xpath(prop.getProperty("mobile"))).sendKeys(prop.getProperty("Mobile"));
		
		driver.findElement(By.xpath(prop.getProperty("continue_3"))).click();
		
	}
	
}
