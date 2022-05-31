package com.bestbuy.storesinfo;

import com.bestbuy.model.StoresPojo;
import com.bestbuy.testbase.TestBaseStores;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;


public class StoresPatchTest extends TestBaseStores {

    @Test
    public void updateStoreWithPatch() {
        StoresPojo storesPojo = new StoresPojo();

        storesPojo.setName("Matalan");
        storesPojo.setType("Toys");
        storesPojo.setAddress("21 ShivKrupa");
        storesPojo.setAddress2("Harrow");

        Response response = given()
                .header("Content-Type", "application/json")
                .pathParam("id", 8925)
                .body(storesPojo)
                .when()
                .patch("/{id}");
        response.then().statusCode(200);
        response.prettyPrint();

    }
}
