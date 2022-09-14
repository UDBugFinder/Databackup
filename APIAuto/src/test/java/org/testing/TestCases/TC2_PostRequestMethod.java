package org.testing.TestCases;

import static io.restassured.RestAssured.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class TC2_PostRequestMethod 
{
public static void main(String[] args) throws FileNotFoundException {
	File f=new File("../APIAuto/bodyData.json");// connection created
	FileReader fr=new FileReader(f); //reader object
	JSONTokener jt=new JSONTokener(fr); //tokener object for reading the Json data
	JSONObject js=new JSONObject(jt);// store the data in Jsonobject
	
	Response res=
	given()
	.contentType(ContentType.JSON)
	.body(js.toString())
	.when()
	.post("http://localhost:3000/Apistudent");
	
	System.out.println("Status code is");
	System.out.println(res.statusCode());
	
	System.out.println(" Response data is");
	System.out.println(res.asString());
	
	System.out.println(js.toString());
}
}
