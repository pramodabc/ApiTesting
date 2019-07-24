package ApiTesting;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.given;

public class Getmethod 
{

	@Test
	public void getMethod()
	{
		
		RestAssured.baseURI="http://localhost:3000";
		
		given().contentType("application/json")
		.when().get("/posts")
		.then().log().all();
		
		
		
		
		
	}
	
	
	
}
