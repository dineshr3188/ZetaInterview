package test;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.apache.http.HttpStatus;
import org.testng.annotations.BeforeClass;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;




public class BaseTest {

	public String basePath;
	public Properties props;


	@BeforeClass(alwaysRun=true)
	public void loadProperties() throws IOException {
		 props= new Properties();
		FileReader fr= new FileReader("src//main//resources//reqres.properties");
		props.load(fr);
		basePath=props.getProperty("basePath");
	}


	public String postRestAPI(String path,String payload) {
		String response = RestAssured.given().relaxedHTTPSValidation().contentType(ContentType.JSON).body(payload).when().log().all()
				.post(path).then().assertThat().statusCode(HttpStatus.SC_OK).extract().response().asString();
		return response;
	}

	public String getRestAPI(String path) {
		String response = RestAssured.given().relaxedHTTPSValidation().contentType(ContentType.JSON).when().log().all()
				.get(path).then().assertThat().statusCode(HttpStatus.SC_OK).extract().response().asString();
		return response;
	}
	public String updateRestAPI(String path,String payload) {
		String response = RestAssured.given().relaxedHTTPSValidation().body(payload).when().log().all()
				.put(path).then().assertThat().statusCode(HttpStatus.SC_OK).extract().response().asString();
		return response;
	}
	public String deleteRestAPI(String path,String payload) {
		String response = RestAssured.given().relaxedHTTPSValidation().body(payload).when().log().all()
				.post(path).then().assertThat().statusCode(HttpStatus.SC_OK).extract().response().asString();
		return response;
	}
}
