package tests;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class Tests_POST {
	
	//@Test
	public void test_1_post() {
		
//		Map<String, Object> map = new HashMap<String, Object>();
//		
//		map.put("Name" , "Amar");
//		map.put("Job", "QA tester");
//		
//		System.out.println(map);
		
		JSONObject request = new JSONObject();
		
		request.put("Name" , "Amar");
		request.put("Job", "QA tester");
		
		System.out.println(request);
		System.out.println(request.toJSONString());
		
		given().
			headers("Content-Type", "application/json").
			contentType(ContentType.JSON).
			accept(ContentType.JSON).
			body(request.toJSONString()).
		when().
			post("https://reqres.in/api/users").
		then().
			statusCode(201);
]][=====]
}
	
	@Test
	public void test_2_put() {
		
		
		JSONObject request = new JSONObject();
		
		request.put("Name" , "Amar");
		request.put("Job", "QA tester");
		
		System.out.println(request);
		System.out.println(request.toJSONString());
		
		given().
			headers("Content-Type", "application/json").
			contentType(ContentType.JSON).
			accept(ContentType.JSON).
			body(request.toJSONString()).
		when().
			put("https://reqres.in/api/users/2").
		then().
			statusCode(200).
			log().all();
		
			
}
	
}
