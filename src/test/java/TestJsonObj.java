import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class TestJsonObj {

    @Test
    void testCase(){

        HashMap<String,String> jsonObj = new HashMap<>();
        jsonObj.put("hello","world");

        given()
                .contentType("application/json")
                .body(jsonObj)
                .log().headers()
        .when()
                .post("https://httpbin.ceshiren.com/post")

        .then()
                .log().all()
                .statusCode(200);

    }
}
