package org.testing.TestCases;
import static io.restassured.RestAssured.*;//RestAssured is the name of the class

import io.restassured.http.ContentType;
import io.restassured.response.Response;
//io.restassured is the package & * means all so we are importing
// All static Method
public class TC1_GetMethod
{
public static void main(String[] args) 
{
	Response res= 
	given()//we have not write "." behind b'coz given() is a Static method
	.contentType(ContentType.JSON)
	.when()
	.get("http://localhost:3000/SeleniumStudents");
	// it is not mandatory to write the Then Keyword
	
	System.out.println("status code is ");
	System.out.println(res.statusCode());
	
	System.out.println("Response data is ");
	System.out.println(res.asString()); // here we are converting our response in
	// .. String format
	
}
}
