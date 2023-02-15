import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class TestJsonStr {

    @Test
    void testCase(){

        String jsonStr = "{\"hello\":\"world\"}";

        given()
                .contentType("application/json")
                .body(jsonStr)
                .log().headers()
        .when()
                .post("https://httpbin.ceshiren.com/post")

        .then()
                .log().all()
                .statusCode(200);

    }
}
