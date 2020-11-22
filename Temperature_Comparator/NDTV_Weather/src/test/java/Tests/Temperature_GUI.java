package Tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.NDTV.Pages.HomePage;
import com.NDTV.Pages.WeatherClass;

public class Temperature_GUI extends Base{
	static String temp_GUI;
	
	@BeforeMethod
	public void setup() {
		initialization();
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}

	
	@Test
	public void Fetch_GUI_Temp() {
	
		// Actions on Home Page
		HomePage home = new HomePage(driver);
		
		// Initial popup depends on browser setting, so using try catch block
		try {			
			home.expandMenu();
			home.selectWeather();
		}
		catch(Exception e) {
			home.dismissInitialPopup();
			home.expandMenu();
			home.selectWeather();		
		}

		
		// Actions on Weather Page
		WeatherClass weather = new WeatherClass(driver);
		weather.enterCityName();
		weather.selectCityFromList();
		weather.clickCityOnMap();
		temp_GUI = weather.fetchTempValue();
		System.out.println("Temperature from NDTV Weature is " + temp_GUI + " Celsius");
		
	}

}
