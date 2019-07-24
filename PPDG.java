package ApiTesting;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class PPDG 
{

	@Test
	public void testppdg()
	{
		    
		RestAssured.get("http://localhost:3000/posts");
		
		
		
		
	}
	
	
	
}
