package serializationanddeserialization;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import pojo.RequestBody;
import pojo.ResponseBody;

public class CreateUser {
	
	
	@Test
	public void createUser()
	{
		
		RequestBody rb = new RequestBody();
		
		rb.setId(0);
		rb.setUsername("testuserone");
		rb.setFirstName("Aaron");
		rb.setLastName("Finch");
		rb.setEmail("aaron.finch@gmail.com");
		rb.setPassword("Test@1234");
		rb.setPhone("8887776654");
		rb.setUserStatus(0);
		
		
		
		RestAssured.baseURI = "https://petstore.swagger.io/v2";
		
ResponseBody responsebody = given()
		
		.header("Content-Type", "application/json")
		
		.body(rb)// serialization
		
		.log().all()
		
		.when()
		
		.post("/user")
		
		.then()
		
		.log().all()
		
		.extract()
		
		.response()
		
		.as(ResponseBody.class);//de serialization

String message = responsebody.getMessage();

System.out.println(message);

int code = responsebody.getCode();

System.out.println(code);




		
		
	}


}
