package com.bestbuy.storesinfo;

import com.bestbuy.testbase.TestBaseStores;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;


public class StoresGetTest extends TestBaseStores {

    @Test
    public void getAllStoresInfo() {
        Response response = given()
                .when()
                .get();
        response.then().statusCode(200);
        response.prettyPrint();
    }

    @Test
    public void getSingleStoreInfo() {
        Response response = given()
                .pathParam("id", 7)
                .when()
                .get("/{id}");
        response.then().statusCode(200);
        response.prettyPrint();
    }
    @Test
    public void searchStoreWithParameter() {
        HashMap<String,Object> qParams=new HashMap<>();
        qParams.put("$limit",4);
        qParams.put("$skip",2);
        Response response=given()
                .header("Accept", "application/json")
                .queryParams(qParams)
                .when()
                .get();
        response.then().statusCode(200);
        response.prettyPrint();
    }

}
