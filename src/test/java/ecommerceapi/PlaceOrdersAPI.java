package ecommerceapi;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;

public class PlaceOrdersAPI extends BaseData {
	
	@Test
	public void placeOrder()
	{
		RestAssured.baseURI = "https://www.rahulshettyacademy.com";
		
		
		given()
		
		.header("Authorization", tokenid)
		.header("Content-Type", "application/json")
		
		.body(JsonBody.getPlaceOrderBody(productId))
		.log().all()
		
		.when()
		
		.post("/api/ecom/order/create-order")
		
		.then()
		
		.log().all()
		
		.extract()
		
		.response();
		
		
	}

}
