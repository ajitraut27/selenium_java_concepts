package api_rest_assured;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;

public class test {
    public static void main(String[] args) {
        RequestSpecification request = (RequestSpecification) RestAssured.given()
                .baseUri("https://reqres.in")
                .contentType(ContentType.JSON)
                .when()
                .get("/api/users?page=2")
                .then()
                .assertThat()
                .body("support", Matchers.hasKey("url"));
    }
}
