package com.bestbuy.storesinfo;

import com.bestbuy.testbase.TestBaseStores;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;


public class StoresDeleteTest extends TestBaseStores {

    @Test
    public void deleteStore() {
        Response response = given()
                .pathParam("id", 8924)
                .when()
                .delete("/{id}");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
