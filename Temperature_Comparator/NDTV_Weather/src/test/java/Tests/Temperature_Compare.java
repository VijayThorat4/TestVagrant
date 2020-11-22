package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;


public class Temperature_Compare {
	
	public void compare_Values() {
		
		float GUI_Temp = Float.parseFloat(Temperature_GUI.temp_GUI);
		float API_Temp = Float.parseFloat(Temperature_API.temp_api);
		
	}

}
