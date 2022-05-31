package com.bestbuy.storesinfo;

import com.bestbuy.model.StoresPojo;
import com.bestbuy.testbase.TestBaseStores;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class StoresPutTest extends TestBaseStores {
    @Test
    public void updateStoresWithPut(){
        StoresPojo storesPojo = new StoresPojo();

        storesPojo.setName("M&S");
        storesPojo.setType("Clothes");
        storesPojo.setAddress("27 Harrow rd");
        storesPojo.setAddress2("Sudbury");
        storesPojo.setCity("Harrow");
        storesPojo.setState("MN");
        storesPojo.setZip("88635");
        storesPojo.setLat(22.33333);
        storesPojo.setLng(25.68666);
        storesPojo.setHours("Mon: 10-9; Tue: 10-9; Wed: 10-9; Thurs: 10-9; Fri: 10-9;Sat: 8-9;");

        Response response = given()
                .header("Content-Type", "application/json")
                .pathParam("id", 8925)
                .body(storesPojo)
                .when()
                .put("/{id}");
        response.then().statusCode(200);
        response.prettyPrint();

    }

}
