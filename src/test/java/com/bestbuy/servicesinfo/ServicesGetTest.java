package com.bestbuy.servicesinfo;

import com.bestbuy.testbase.TestBaseServices;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;


public class ServicesGetTest extends TestBaseServices {

    @Test
    public void getAllServicesInfo() {
        Response response = given()
                .when()
                .get();
        response.then().statusCode(200);
        response.prettyPrint();
    }

    @Test
    public void getSingleServiceInfo() {
        Response response = given()
                .pathParam("id", 3)
                .when()
                .get("/{id}");
        response.then().statusCode(200);
        response.prettyPrint();
    }

    @Test
    public void searchServicesWithParameter() {
        HashMap<String,Object> qParams=new HashMap<>();
        qParams.put("$limit",3);
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
