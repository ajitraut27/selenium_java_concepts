package api_rest_assured;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.testng.Assert;

public class validate_request_in_xml_format {
    public static void main(String[] args) {

        String xmlRequestData = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "<Pet>\n" +
                "\t<id>0</id>\n" +
                "\t<Category>\n" +
                "\t\t<id>0</id>\n" +
                "\t\t<name>string</name>\n" +
                "\t</Category>\n" +
                "\t<name>doggie</name>\n" +
                "\t<photoUrls>\n" +
                "\t\t<photoUrl>string</photoUrl>\n" +
                "\t</photoUrls>\n" +
                "\t<tags>\n" +
                "\t\t<Tag>\n" +
                "\t\t\t<id>0</id>\n" +
                "\t\t\t<name>string</name>\n" +
                "\t\t</Tag>\n" +
                "\t</tags>\n" +
                "\t<status>available</status>\n" +
                "</Pet>";

        RequestSpecification reqSpect = RestAssured.given();

        reqSpect.baseUri("https://petstore.swagger.io");
        reqSpect.basePath("/v2/pet");

        reqSpect.header("accept", "application/xml");
        reqSpect.header("Content-Type", "application/xml");     // request in xml format

        reqSpect.body(xmlRequestData);

        Response resp = reqSpect.post();

        resp.prettyPrint();

        Assert.assertEquals(resp.statusCode(), 200);

        resp.then()
            .body("Pet.name", Matchers.equalTo("doggie"));
    }
}
