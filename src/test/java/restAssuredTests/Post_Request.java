package restAssuredTests;

import java.util.HashMap;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat; 
import static org.hamcrest.Matchers.*;

import io.opentelemetry.sdk.logs.data.Body;
import io.restassured.RestAssured;
import io.restassured.internal.assertion.BodyMatcher;
import io.restassured.internal.assertion.BodyMatcherGroup;

public class Post_Request {

	public static HashMap<String, String> map=new HashMap<String, String>();
	
	
	@BeforeClass
	public void postData() {
		
		map.put("name",RestUtils.getName());
		map.put("salary",RestUtils.getSalary());
		map.put("age",RestUtils.getAge());
		System.out.println(map);
		RestAssured.baseURI="https://dummy.restapiexample.com/api/v1";
		RestAssured.basePath="/create";
	}
	@Test
	public void testPost() {
		
		given()
		.contentType("application/json")
		.body(map)
		
		.when()
		    .post()
		    
		    .then()
		     
		     .statusCode(200);
		    
		      assertThat("message",equalTo("Successfully! Record has been added."));
		     
		
	}
		}

