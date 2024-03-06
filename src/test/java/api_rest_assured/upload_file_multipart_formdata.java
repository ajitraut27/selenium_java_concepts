package api_rest_assured;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.io.File;

public class upload_file_multipart_formdata {
    public static void main(String[] args) {

        String petId = "1";
        File imgFile = new File("/Users/Ajit/Downloads/download.jpeg");

        RequestSpecification reqSpec = RestAssured.given();

        reqSpec.baseUri("https://petstore.swagger.io");
        reqSpec.basePath("/v2/pet/"+petId+"/uploadImage");

        reqSpec.multiPart("file", imgFile);
        reqSpec.header("accept", "application/json");

        reqSpec.body(imgFile);

        Response resp = reqSpec.post();
        resp.prettyPrint();

    }
}
