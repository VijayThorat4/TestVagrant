package com.NDTV.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utilities.PropertiesFile;

public class WeatherClass {
	WebDriver driver;
	public static String city = "Pune";
	
	// Constructor to initialize WebDriver and read city name from properties file
	public WeatherClass(WebDriver driver) {
		this.driver = driver;
		PropertiesFile.readPropertiesFile();
	}

	
	// Locators
	By searchBox = By.id("searchBox");
	By cityCheckboxSelector = By.id(city);
	By cityOnMap = By.xpath("//div[text()=" + "'" + city + "'" + "]");
	By tempLocator = By.xpath("//div[@class=\"leaflet-popup-content\"]/div/span[4]");
	

	
	// Actions to be performed
	public void enterCityName() {
		driver.findElement(searchBox).sendKeys(city);
	}
	
	public void selectCityFromList() {
		driver.findElement(cityCheckboxSelector).click();
	}
	
	public void clickCityOnMap() {
		driver.findElement(cityOnMap).click();
	}
	
	public String fetchTempValue() {
		String data = driver.findElement(tempLocator).getText();    // capturing complete text
		String dataSplitted[] = data.split(" ");     // extracting temperature value
		return dataSplitted[3];
	}
}


