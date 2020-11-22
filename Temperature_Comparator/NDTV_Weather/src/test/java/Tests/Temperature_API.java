package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Temperature_API {
	static String temp_api;
	
	@Test
	public void getRequest() {
		
		Response response =
		given()
		.when()
			.get("https://api.openweathermap.org/data/2.5/weather?q=Pune&appid=7fe67bf08c80ded756e598d6f8fedaea")
		.then()
			.statusCode(200)
//			.body("main.temp", equalTo("299"))
			.extract().response();
		
//		Confirming data is fetched from correct city
		String city = response.jsonPath().getString("name");
		Assert.assertEquals(city, "Pune");
		
//		Extracting temperature from response
		temp_api = response.jsonPath().getString("main.temp");
		System.out.println("Temperature provided from API is " + temp_api + " Kelvin");
	}

}
