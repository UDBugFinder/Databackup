package org.testing.TestCases;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Rough_Methods 
{
public static void main(String[] args) {
	Response res=
	given()
	.contentType(ContentType.JSON)
	.when()
	.get(" http://localhost:3000/Apistudent/complex");
	
	System.out.println(" Status code is");
	System.out.println(res.statusCode());
	
	System.out.println(" Response body is ");
	System.out.println(res.asString());
	
}

}
