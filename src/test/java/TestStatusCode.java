import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class TestStatusCode {
    @Test
    void Test1() {
        given()
        .when()
                .get("https://httpbin.ceshiren.com/get?Hello=World")
        .then()
                .log().all()
                .statusCode(200);
    }

}
