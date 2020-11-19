package com.NDTV.Pages;

import org.openqa.selenium.By;

public class WeatherClass {
	By searchBox = By.id("searchBox");
	By cityCheckboxSelector = By.id("Pune");
	By cityOnMap = By.xpath("//div[text()=\"Pune\"]");
	By tempLocator = By.xpath("//div[@class=\"leaflet-popup-content\"]/div/span[4]");
}
