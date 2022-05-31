package com.bestbuy.servicesinfo;

import com.bestbuy.testbase.TestBaseServices;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class ServicesPostTest extends TestBaseServices {

    @Test
    public void createServices() {
        String payload="{\n" +
                "    \"name\": \"Samsung Shop\"\n" +
                "}";
         Response response = given()
                .header("Content-Type", "application/json")
                .body(payload)
                .when()
                .post();
        response.then().statusCode(201);
        response.prettyPrint();
//23
    }
}
