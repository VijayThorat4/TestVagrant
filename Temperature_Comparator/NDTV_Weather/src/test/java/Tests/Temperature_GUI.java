package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.NDTV.Pages.HomePage;

public class Temperature_GUI {
	
	@Test
	public void Fetch_GUI_Temp() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver2.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ndtv.com/");
		driver.manage().window().maximize();
		
		HomePage home = new HomePage(driver);
		home.dismissInitialPopup();
		home.expandMenu();
		home.selectWeather();
	}

}
