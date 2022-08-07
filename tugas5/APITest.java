//Find API to signup for engineer.ai
//User faker to create a dummy email, dummy name, and dummy phone number
//
//Assert to get 200OK




import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class APITest {

	String contentType = "application/json";
	String email;
	String name;
	String phoneNumber;
	String password;
	@Test
	private void signUp() {

		RestAssured.baseURI = "https://api-staging-builder.engineer.ai";
		fakerTest();
		String payload = String.format("{\"user\":"
				+ "{\"email\":\"%s\","
				+ "\"first_name\":\"%s\","
				+ "\"phoneNumber\":\"%s\","
				+ "\"password\":\"%s\"}}", email, name, phoneNumber, password);

		Response responseSignUp = RestAssured.given().contentType(contentType).body(payload).when()
				.post("/users");

		assertEquals(responseSignUp.statusCode(), 200);
		System.out.println(responseSignUp.statusCode());
	}

	//	@Test
	private void fakerTest() {
		Faker faker = new Faker();
		email = faker.internet().emailAddress();
		name = email.substring(0, email.indexOf('@')).replaceAll("\\.", " ");
		phoneNumber = faker.number().digits(11).toString();
		password = faker.internet().password(8,10);

		System.out.println(email);
		System.out.println(name);
		System.out.println(phoneNumber);
		System.out.println(password);
	}
}
