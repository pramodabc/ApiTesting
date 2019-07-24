package ApiTesting;

import java.util.Random;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static  io.restassured.RestAssured.given;



public class PostMethod 
{
	
	@Test
	
	public void postMethod()
	{
		JSONObject object=new JSONObject();
		
		int random=new Random().nextInt(500);
		
		object.put("id", random);
		object.put("title", "my title" +random);
		object.put("author", "json-server"+random);
		
		
		RestAssured.baseURI="http://localhost:3000";
		given().header("Content-Type","application/json").and().body(object.toJSONString())
		.when().post("/posts")
		.then().statusCode(201).and().log().all();
		
		
		
		
		
	}

}
