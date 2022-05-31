package com.bestbuy.productinfo;

import com.bestbuy.testbase.TestBaseProducts;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;


public class ProductGetTest extends TestBaseProducts {

    @Test
    public void getAllProductsInfo() {
        Response response = given()
                .when()
                .get();
        response.then().statusCode(200);
        response.prettyPrint();
    }

    @Test
    public void getSingleProductInfo() {
        Response response = given()
                .pathParam("id", 9999683)
                .when()
                .get("/{id}");
        response.then().statusCode(200);
        response.prettyPrint();
    }
    @Test
    public void searchProductWithParameter() {
        HashMap<String,Object> qParams=new HashMap<>();
        qParams.put("$limit",3);
        qParams.put("$skip",1);
        Response response=given()
                .header("Accept", "application/json")
                .queryParams(qParams)
                .when()
                .get();
        response.then().statusCode(200);
        response.prettyPrint();
    }

}
