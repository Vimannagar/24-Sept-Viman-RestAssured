package basics;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;

public class CreateUser {
	
//	taking the json from other class:
	
	
	@Test
	public void createUser()
	{
		RestAssured.baseURI = "https://petstore.swagger.io/v2";
		
		given()
		
		.header("Content-Type", "application/json")
		
		.body(JsonBody.createUserBody())
		
		.log().all()
		
		.when()
		
		.post("/user")
		
		.then()
		.log().all()
		.extract()
		
		.response();
		
		
	}

}
