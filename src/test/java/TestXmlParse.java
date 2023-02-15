import org.apache.commons.io.IOUtils;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class TestXmlParse {

    @Test
    void testCase() throws IOException {

        File file = new File("src/test/resources/add.xml");
        FileInputStream fileInputStream = new FileInputStream(file);
        String req = IOUtils.toString(fileInputStream,"UTF-8");

        given()
                .contentType("text/xml")
                .body(req)
        .when()
                .post("http://dneonline.com/calculator.asmx")

        .then()
                .log().all()
                .body("//AddResult.text()",equalTo(16))
                .statusCode(200);

    }
}

