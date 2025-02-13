package Capstone.AutomationPractice11;
import static io.restassured.RestAssured.*;

import java.io.File;

import org.testng.Assert;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class API {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Response io = get("https://reqres.in/api/users?page=2");
		io.prettyPrint();
		int statuses = io.statusCode();
		System.out.println(statuses);
		Assert.assertEquals(statuses, 200);
		ResponseBody body = io.getBody();
		String converttostring = body.asString();
		System.out.println(converttostring);
		Assert.assertEquals(converttostring.contains("Ferguson"),true,"Name is displaying");
		post();
}
	public static void post() {
		File ot = new File(System.getProperty("user.dir")+"\\House.json");
		Response us = given().contentType(ContentType.JSON).body(ot).post("https://reqres.in/api/users");
		us.prettyPrint();
		System.out.println(us.getStatusCode());
		//updated
	}

}
