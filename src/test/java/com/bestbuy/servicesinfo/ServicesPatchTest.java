package com.bestbuy.servicesinfo;

import com.bestbuy.testbase.TestBaseServices;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class ServicesPatchTest extends TestBaseServices {

    @Test
    public void updateServicesWithPatch() {
        String payload="{\n" +
                "    \"name\": \"Android Shop Wholesales\"\n" +
                "}";
        Response response = given()
                .header("Content-Type", "application/json")
                .pathParam("id", 23)
                .body(payload)
                .when()
                .patch("/{id}");
        response.then().statusCode(200);
        response.prettyPrint();

    }
}
