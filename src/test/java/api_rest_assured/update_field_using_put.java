package api_rest_assured;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class update_field_using_put extends get_size_of_array_in_nested_json{

    @Test
    public void run1(ITestContext context) {

        String nme = (String) context.getAttribute("first_name");
        System.out.println("name: " + nme);

        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

        String title = "{" +" \"title\": \"tutorials point\"}";

        Response res = given()
                .header("Content-Type", "application/json")
                .body(title)
                .when()
                .put("/posts/1");

        res.then()
                .log()
                .all()
                .assertThat()
                .statusCode(200);
    }
}
