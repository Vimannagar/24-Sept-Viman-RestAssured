package basics;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class Get_SingleUser {
	
	@Test
	public void getSingleUsr()
	{
		RestAssured.baseURI = "https://reqres.in/";
		
		Response response = given()
		
						.log().all()
		
						.when()
		
						.get("/api/users/2")
		
						.then()
		
						.log().all()
		
						.extract()
		
						.response();
		
		
		String stringresp = response.asPrettyString();
		
//	fetch the values from JSON response
		
		JsonPath jp = response.jsonPath();
		
		String emailvalue = jp.getString("data.email");
		
		System.out.println(emailvalue);//janet.weaver@reqres.in
		
		
	}
	

}
