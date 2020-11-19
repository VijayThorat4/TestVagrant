package com.NDTV.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	WebDriver driver;
	
	// All locators belonging to home page that are required for this project
	By initialPopup = By.xpath("//a[text()=\"No Thanks\"]");
	By menuExpander = By.id("h_sub_menu");
	By weatherOption = By.xpath("//a[text()=\"WEATHER\"]");
	
	// Constructor to initialize WebDriver
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	// Method to perform actions on locators
	public void dismissInitialPopup() {
		driver.findElement(initialPopup).click();
	}
	
	public void expandMenu() {
		driver.findElement(menuExpander).click();
	}

	public void selectWeather() {
		driver.findElement(weatherOption).click();
	}
}
