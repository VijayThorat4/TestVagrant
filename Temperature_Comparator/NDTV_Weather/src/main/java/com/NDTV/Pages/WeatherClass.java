package com.NDTV.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WeatherClass {
	WebDriver driver;
	
	// Locators
	By searchBox = By.id("searchBox");
	By cityCheckboxSelector = By.id("Pune");
	By cityOnMap = By.xpath("//div[text()=\"Pune\"]");
	By tempLocator = By.xpath("//div[@class=\"leaflet-popup-content\"]/div/span[4]");
	
	// Constructor to initialize WebDriver
	public WeatherClass(WebDriver driver) {
		this.driver = driver;
	}
	
	// Actions to be performed
	public void enterCityName() {
		driver.findElement(searchBox).sendKeys("Pune");
	}
	
	public void selectCityFromList() {
		driver.findElement(cityCheckboxSelector).click();
	}
	
	public void clickCityOnMap() {
		driver.findElement(cityOnMap).click();
	}
	
	public String fetchTempValue() {
		String data = driver.findElement(tempLocator).getText();
		String dataSplitted[] = data.split(" ");
		return dataSplitted[3];
	}
}


