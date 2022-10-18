package restAssuredTests;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class Get_Request {

	
	@Test
	public void getWeatherDetails() 
	{
		given()
		  .when()
		    .get("https://reqres.in/api/users/2")
		    .then()
		    .statusCode(200)
		    .statusLine("HTTP/1.1 200 OK")
		     //.body("email","janet.weaver@reqres.in")
		    .header("Content-Type","application/json; charset=utf-8");
		
	}

}
