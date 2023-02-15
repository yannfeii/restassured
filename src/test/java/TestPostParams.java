import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class TestPostParams {
    @Test
    void Test1() {
        given()
                .log().all()
        .when()
                .post("https://httpbin.ceshiren.com/post?Hello=World")
        .then()
                .log().all()
                .statusCode(200);
    }

    @Test
    void Test2() {
        given()
                .queryParam("Hello","World")
                .queryParam("id","666")
                .log().all()
        .when()
                .post("https://httpbin.ceshiren.com/post")
        .then()
                .log().all()
                .statusCode(200);
    }
}
