package Tests;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Base {
	public static WebDriver driver;
	
	public static void initialization() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver2.exe");
		driver = new ChromeDriver();
		driver.get("https://www.ndtv.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	public void failed(String methodName) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File snap = ts.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(snap, new File ("E:\\Project\\Temperature_Comparator\\NDTV_Weather\\Screenshot" + methodName + "_failed.jpg"));
	}
}
