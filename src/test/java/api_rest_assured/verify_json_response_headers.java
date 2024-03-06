package api_rest_assured;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.hamcrest.Matchers;

import static io.restassured.RestAssured.given;

public class verify_json_response_headers {
    public static void main(String[] args) {
        //base URI with Rest Assured class
        RestAssured.baseURI = "https://reqres.in";

        //obtain Response from GET request
        Response resp = given()
                .when()
                .get("/api/users?page=2");

        resp.then()
                .log()
                .all()
                .assertThat()
                .statusCode(200)
                .statusLine("HTTP/1.1 200 OK")
                .header("Content-Type", "application/json; charset=utf-8")
                .header("Content-Encoding","gzip")
                .body("support", Matchers.hasKey("url"))
                .body("data", Matchers.hasSize(6))
                .body("total_pages", Matchers.equalTo(2))
                .body("support.text", Matchers.equalTo("To keep ReqRes free, contributions towards server costs are appreciated!"));
    }
}
