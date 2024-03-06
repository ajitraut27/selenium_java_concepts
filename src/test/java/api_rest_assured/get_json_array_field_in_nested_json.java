package api_rest_assured;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class get_json_array_field_in_nested_json {
    public static void main(String[] args) {
        RestAssured.baseURI = "https://reqres.in";

        Response res = given()
                .when()
                .get("/api/users?page=2");

        JsonPath jp = new JsonPath(res.asString());

        int dataSize = jp.getInt("data.size()");
        System.out.println("Data Size: " + dataSize);

        for (int i = 0; i < dataSize; i++){
            String id = jp.getString("data["+i+"].id");

            if (id.equals("10")){
                String firstNam = jp.getString("data["+i+"].first_name");
                System.out.println("first name: " + firstNam);

                String lastNam = jp.getString("data["+i+"].last_name");
                System.out.println("last name: " + lastNam);

                String email = jp.getString("data["+i+"].email");
                System.out.println("email: " + email);

                String avatr = jp.getString("data["+i+"].avatar");
                System.out.println("avatar: " + avatr);
                break;
            }
        }

        System.out.println(res.then().extract().response().asString());
    }
}
