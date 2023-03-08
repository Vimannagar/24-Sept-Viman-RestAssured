package basics;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class FetchDynamicArrayElements {
	
	@Test
	public void getUsers()
	{
		RestAssured.baseURI = "https://reqres.in/";
		
	Response completeresponse = given()
		
								.when()
		
								.get("api/users?page=2")
			
								.then()
		
								.extract()
		
								.response();
	
	JsonPath jsonpath = completeresponse.jsonPath();
	
int countofelements =	jsonpath.getInt("data.size()");

System.out.println(countofelements);

for(int i=0; i<countofelements; i++)
{
	String emailvalue = jsonpath.getString("data["+i+"].email");
	
	System.out.println(emailvalue);
}


	
	}
	
	
	

}
