package ecommerceapi;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.io.File;
public class Add_Product extends BaseData
{
	
	@Test
	public void addProductToApp()
	{
		RestAssured.baseURI = "https://www.rahulshettyacademy.com";
		
		
Response resp = given()
		.header("Authorization", tokenid)
		.param("productName", "Trousers")
		.param("productAddedBy", userid)
		.param("productCategory", "fashion")
		.param("productSubCategory", "Shirt")
		.param("productPrice", "1500")
		.param("productDescription", "Allen Solly")
		.param("productFor", "Men")
		.multiPart("productImage", new File("F:\\Desktop\\VimanNagar\\May 21\\24SeptVimanRestAssured\\Test trouser image.png"))
		.log().all()
		
		.when()
		
		.post("api/ecom/product/add-product")
		
		.then()
		
		.log().all()
		
		.extract()
		
		.response();

	JsonPath jp = resp.jsonPath();

	productId = jp.getString("productId");
		
		
		
		
		
		
	}

}
