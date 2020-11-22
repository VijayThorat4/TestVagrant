package Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.NDTV.Pages.HomePage;
import com.NDTV.Pages.WeatherClass;

public class Temperature_GUI {
	static String temp_GUI;
	
	@Test
	public void Fetch_GUI_Temp() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver2.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ndtv.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
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
