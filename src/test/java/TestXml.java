import org.apache.commons.io.IOUtils;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import static io.restassured.RestAssured.given;

public class TestXml {

    @Test
    void testCase() throws IOException {

        File file = new File("src/test/resources/add.xml");
        FileInputStream fileInputStream = new FileInputStream(file);
        String req = IOUtils.toString(fileInputStream,"UTF-8");

        given()
                .contentType("text/xml")
                .body(req)
                .log().headers()
        .when()
                .post("http://dneonline.com/calculator.asmx")

        .then()
                .log().all()
                .statusCode(200);

    }
}
