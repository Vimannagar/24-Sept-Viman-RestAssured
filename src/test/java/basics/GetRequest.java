package basics;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class GetRequest {
	
	
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
	
	String stringresponse = completeresponse.asPrettyString();
	
	System.out.println(stringresponse);
	
	int stscode = completeresponse.getStatusCode();// to get the status code of response received
	
	System.out.println("status code is "+stscode);
	
	 long resptime = completeresponse.getTime();// to get the response time
	 
	 System.out.println(resptime);
	 
	JsonPath jp = completeresponse.jsonPath();
	
	int pagevalue = jp.getInt("page");
	
	System.out.println(pagevalue);//2
	
	String lastnameforfirstindex = jp.getString("data[1].last_name");
	
	System.out.println(lastnameforfirstindex);
	 
	
//	WAP to fetch all the value of firstname for all index positions
	
	for(int i=0; i<6; i++)
	{
		String firstname = jp.getString("data["+i+"].first_name");
		
		System.out.println(firstname);
	}
	
	
	
	
	
	
	}
	

}
