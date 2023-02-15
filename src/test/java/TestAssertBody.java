import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class TestAssertBody {
    @Test
    void Test() {
        given()
        .when()
                .get("https://httpbin.ceshiren.com/get?Hello=World")
        .then()
                .log().all()
                .body("origin",equalTo("172.17.56.110"))
                .statusCode(200);
    }
    
}
