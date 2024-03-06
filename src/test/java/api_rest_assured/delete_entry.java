package api_rest_assured;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class delete_entry {
    public static void main(String[] args) {
        RequestSpecification reqSpec = RestAssured.given();

        reqSpec.baseUri("https://petstore.swagger.io");
        reqSpec.basePath("/v2/pet/2");

        reqSpec.header("accept", "application/json");

        Response resp = reqSpec.delete();

        System.out.println(resp.prettyPrint());

    }
}
