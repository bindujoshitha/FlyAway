package Flyaway.Project1;

import static io.restassured.RestAssured.given;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class FlyawayRestassured2 {

	public static void main(String[] args) {
		
		RequestSpecification req=new RequestSpecBuilder().setBaseUri(ConstantsFile.url1).build();
		RequestSpecification res=given().spec(req);
		ResponseSpecification response=new ResponseSpecBuilder().expectStatusCode(200).build();
		System.out.println("Status code sucessfully validated ");
		 Response response1=res.when().get().then().statusCode(200).extract().response();
		 String ResponseString = response1.asString();
		 if(ResponseString.contains("Fly Away - Your Bookings")) {
			 System.out.println("Sucessfully Validated the FlyAway Bookings Page");
		 }
		 else {System.out.println("Not Sucessfully Validated the FlyAway Bookings Page");}
		System.out.println("------------------------");
		System.out.println("Output of the get request : ");
		System.out.println(ResponseString);
		System.out.println("------------------------");
	}

}
