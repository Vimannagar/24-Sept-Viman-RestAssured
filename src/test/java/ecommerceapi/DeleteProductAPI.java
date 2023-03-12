package ecommerceapi;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;

public class DeleteProductAPI extends BaseData{
	
	
	@Test
	public void deleteProductFromApp()
	{
		RestAssured.baseURI = "https://www.rahulshettyacademy.com";
		
		given()
		
		.log().all()
		
		.header("Authorization", tokenid)
		
		.pathParam("prdid", productId)
		
		.when()
		
		.delete("api/ecom/product/delete-product/{prdid}")
		
		.then()
		
		.log().all()
		
		.extract()
		
		.response();
		
		
		
		
		
	}

}
