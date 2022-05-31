package com.bestbuy.categoriesinfo;

import com.bestbuy.model.CategoriesPojo;
import com.bestbuy.testbase.TestBaseCategories;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class CategoriesPutTest extends TestBaseCategories {

    @Test
    public void updateCategoriesWithPut(){
        CategoriesPojo categoriesPojo = new CategoriesPojo();
        categoriesPojo.setName("Play Toys and Bath Toys");
        categoriesPojo.setId("20");

        Response response = given()
                .header("Content-Type", "application/json")
                .pathParam("id", "2")
                .body(categoriesPojo)
                .when()
                .put("/{id}");
        response.then().statusCode(200);
        response.prettyPrint();

    }
}
