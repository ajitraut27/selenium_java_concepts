package api_rest_assured;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class get_size_of_array_in_nested_json {

    @Test
    public void run(ITestContext context) {
        RestAssured.baseURI = "https://reqres.in";

        Response res = given()
                .when()
                .get("/api/users?page=2");

        JsonPath jp = new JsonPath(res.asString());
        System.out.println(res.prettyPrint());
        int siz = jp.getInt("data.size()");
        System.out.println("Size of data elements: " + siz);

        System.out.println(res.body().jsonPath().getString("data[0].first_name"));
        System.out.println(res.then().extract().body().jsonPath().getString("data[0].first_name"));
        System.out.println(res.body().jsonPath().getJsonObject("data[0].first_name").toString());

        context.setAttribute("first_name", res.body().jsonPath().getString("data[0].first_name"));
    }
}
