package com.bestbuy.productinfo;

import com.bestbuy.testbase.TestBaseProducts;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;


public class ProductDeleteTest extends TestBaseProducts {

    @Test
    public void deleteProduct() {
        Response response = given()
                .pathParam("id", 9999684)
                .when()
                .delete("/{id}");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
