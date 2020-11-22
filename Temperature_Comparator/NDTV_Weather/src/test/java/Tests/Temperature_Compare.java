package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;


public class Temperature_Compare {
	
	
	@Test
	public void compare_Values() {
		
//		Temperature_GUI.temp_GUI = "30";
//		Temperature_API.temp_api = "303";
		
		// Converting String values to double data type
		double GUI_Temp = Float.parseFloat(Temperature_GUI.temp_GUI);
		double API_Temp = Float.parseFloat(Temperature_API.temp_api);
		
		GUI_Temp = GUI_Temp + 273.15;   //Converting from celsius to kelvin
		
		if (Math.abs(GUI_Temp - API_Temp) < 2) {
			System.out.println("Temerature Variation is within limit");
			Assert.assertTrue(true);
		}else {
			System.out.println("Temperature variation is more than the expected limit");
			Assert.assertTrue(false);
		}
	}
}
