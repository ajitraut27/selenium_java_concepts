package api_rest_assured;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;

import static io.restassured.RestAssured.given;

public class validate_response_in_xml_format {
    public static void main(String[] args) {

        String jsonRequestData = "{\n" +
                "  \"id\": 0,\n" +
                "  \"category\": {\n" +
                "    \"id\": 0,\n" +
                "    \"name\": \"string\"\n" +
                "  },\n" +
                "  \"name\": \"doggie\",\n" +
                "  \"photoUrls\": [\n" +
                "    \"string\"\n" +
                "  ],\n" +
                "  \"tags\": [\n" +
                "    {\n" +
                "      \"id\": 0,\n" +
                "      \"name\": \"string\"\n" +
                "    }\n" +
                "  ],\n" +
                "  \"status\": \"available\"\n" +
                "}";

        RequestSpecification reqSpec = RestAssured.given();
        reqSpec.baseUri("https://petstore.swagger.io");
        reqSpec.basePath("/v2/pet");

        reqSpec.header("accept", "application/xml");        // "accept": receive response in this format
        reqSpec.header("Content-Type", "application/json"); // json body in request
        reqSpec.body(jsonRequestData);

        Response resp = reqSpec.post();
        resp.prettyPrint();

        Assert.assertEquals(resp.statusCode(), 200, "Check response code msg");
    }
}
