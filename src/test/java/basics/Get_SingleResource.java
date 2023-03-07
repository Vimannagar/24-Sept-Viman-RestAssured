package basics;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Get_SingleResource {
	
	
	@Test
	public void getSingleuser()
	{
		RestAssured.baseURI = "https://reqres.in/";
		
		Response response = given()
				
				.log().all()

				.when()

				.get("/api/unknown/2")

				.then()

				.log().all()

				.extract()

				.response();
		
		String stringresp = response.asPrettyString();
		
		
		JsonPath jp = new JsonPath(stringresp);
		
		
		String stringvalue = jp.getString("support.text");
		
		System.out.println(stringvalue);
		
		

	}

}
