package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;

import org.testng.annotations.Test;

import com.NDTV.Pages.WeatherClass;

public class PropertiesFile {
	
	public static void readPropertiesFile() {
		Properties prop = new Properties();
		try {
			InputStream input = new FileInputStream("E:\\Project\\Temperature_Comparator\\NDTV_Weather\\src\\main\\java\\Utilities\\config.properties");
			prop.load(input);
			WeatherClass.city = prop.getProperty("city");
			
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
