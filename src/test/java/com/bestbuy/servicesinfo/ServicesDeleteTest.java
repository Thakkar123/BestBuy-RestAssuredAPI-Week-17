package com.bestbuy.servicesinfo;

import com.bestbuy.testbase.TestBaseServices;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;


public class ServicesDeleteTest extends TestBaseServices {

    @Test
    public void deleteService() {
        Response response = given()
                .pathParam("id", 22)
                .when()
                .delete("/{id}");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
