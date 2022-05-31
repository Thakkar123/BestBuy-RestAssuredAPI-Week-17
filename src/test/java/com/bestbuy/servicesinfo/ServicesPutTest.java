package com.bestbuy.servicesinfo;

import com.bestbuy.testbase.TestBaseServices;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class ServicesPutTest extends TestBaseServices {
    @Test
    public void updateServicesWithPut(){
        String payload="{\n" +
                "    \"name\": \"Android Shop\"\n" +
                "}";
        Response response = given()
                .header("Content-Type", "application/json")
                .pathParam("id", 23)
                .body(payload)
                .when()
                .put("/{id}");
        response.then().statusCode(200);
        response.prettyPrint();

    }

}
