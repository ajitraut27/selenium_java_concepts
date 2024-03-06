package api_rest_assured;

import io.restassured.RestAssured;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.testng.Assert;

import java.util.List;

public class get_query_param {
    public static void main(String[] args) {
        RequestSpecification req = RestAssured.given();

        req.baseUri("http://restapi.adequateshop.com");
        req.basePath("/api/Traveler");

        req.queryParam("page", "1");

        req.header("accept", "application/xml");
        Response resp = req.get();
//        resp.prettyPrint();

        resp.then().body("TravelerinformationResponse.travelers.Travelerinformation[2].name", Matchers.equalTo("vano"));

        XmlPath objXmlPath = new XmlPath(resp.asString());
        String name = objXmlPath.get("TravelerinformationResponse.travelers.Travelerinformation[2].name").toString();
        Assert.assertEquals(name, "vano", "Check for name exist");

        List<String> traveList = objXmlPath.getList("TravelerinformationResponse.travelers.Travelerinformation");
        int totalList = traveList.size();
//        System.out.println(totalList);

        List<String> travList = objXmlPath.getList("TravelerinformationResponse.travelers.Travelerinformation.name");

        boolean found = false;
        for (String traveller: travList){

            if (traveller.equals("vano")){
                found = true;
                System.out.println(traveller);
                break;
            }
        }

        Assert.assertEquals(found, true);

    }
}
