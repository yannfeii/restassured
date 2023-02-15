import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class TestGet {
    @Test
    void Test() {
        given()
                .log().all()
        .when()
                .get("https://httpbin.ceshiren.com/get")
        .then()
                .log().all()
                .statusCode(200);
    }
}
