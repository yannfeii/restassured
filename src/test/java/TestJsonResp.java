import org.junit.jupiter.api.Test;

import static io.restassured.path.json.JsonPath.from;
import static io.restassured.RestAssured.given;

public class TestJsonResp {

    @Test
    void testCase() {

        String jsonStr = given()
                .header("hello", "world")
        .when()
                .get("https://httpbin.ceshiren.com/get")

        .then()
                .log().all()
                .statusCode(200)
                .extract().response().asString();

        String result = from(jsonStr).getString("headers.hello");
        System.out.println(result);
    }
}
