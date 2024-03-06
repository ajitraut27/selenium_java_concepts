package api_rest_assured;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class get_json_field_in_nested_json {
    public static void main(String[] args) {
        RestAssured.baseURI = "https://reqres.in";

        Response res = given()
                .when()
                .get("/api/users?page=2");

        JsonPath jp = new JsonPath(res.asString());

        String supportUrl = jp.getString("support.url");
        System.out.println("Support Url: " + supportUrl);

        String supportText = jp.getString("support.text");
        System.out.println("Support Text: " + supportText);
    }
}
