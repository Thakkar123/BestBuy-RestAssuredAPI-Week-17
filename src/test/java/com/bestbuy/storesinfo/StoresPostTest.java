package com.bestbuy.storesinfo;

import com.bestbuy.model.StoresPojo;
import com.bestbuy.testbase.TestBaseStores;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class StoresPostTest extends TestBaseStores {

    @Test
    public void createStore() {
        StoresPojo storesPojo = new StoresPojo();

        storesPojo.setName("Debenhams");
        storesPojo.setType("Clothes");
        storesPojo.setAddress("29 Harrow rd");
        storesPojo.setAddress2("Sudbury Town");
        storesPojo.setCity("Harrow");
        storesPojo.setState("MN");
        storesPojo.setZip("88655");
        storesPojo.setLat(23.56666);
        storesPojo.setLng(25.66666);
        storesPojo.setHours("Mon: 10-9; Tue: 10-9; Wed: 10-9; Thurs: 10-9; Fri: 10-9;");


        Response response = given()
                .header("Content-Type", "application/json; charset=utf-8")
                .body(storesPojo)
                .when()
                .post();
        response.then().statusCode(201);
        response.prettyPrint();
//8926
    }
}
