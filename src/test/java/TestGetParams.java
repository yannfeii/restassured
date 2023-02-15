import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class TestGetParams {
    @Test
    void Test1() {
        given()
                .log().all()
        .when()
                .get("https://httpbin.ceshiren.com/get?Hello=World")
        .then()
                .log().all()
                .statusCode(200);
    }

    @Test
    void Test2() {
        given()
                .param("Hello","World")
                .param("id","666")
                .log().all()
        .when()
                .get("https://httpbin.ceshiren.com/get")
        .then()
                .log().all()
                .statusCode(200);
    }
}
