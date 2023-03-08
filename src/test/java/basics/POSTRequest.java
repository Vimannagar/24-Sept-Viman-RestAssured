package basics;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class POSTRequest {
	
	@Test
	public void createUser()
	{
		RestAssured.baseURI = "https://petstore.swagger.io/v2";
		
		Response response = given()
							.body("{\r\n"
				+ "  \"id\": 0,\r\n"
				+ "  \"username\": \"Usertwo\",\r\n"
				+ "  \"firstName\": \"Ron\",\r\n"
				+ "  \"lastName\": \"Dutta\",\r\n"
				+ "  \"email\": \"a@a1.com\",\r\n"
				+ "  \"password\": \"Test@12345\",\r\n"
				+ "  \"phone\": \"9876543211\",\r\n"
				+ "  \"userStatus\": 0\r\n"
				+ "}")
		
							.header("Content-Type", "application/json")
		
							.when()
		
							.post("/user")
		
							.then()
		
							.extract()
		
							.response();
		
		String stringresponse = response.asPrettyString();
		
		System.out.println(stringresponse);
		
	}

}
