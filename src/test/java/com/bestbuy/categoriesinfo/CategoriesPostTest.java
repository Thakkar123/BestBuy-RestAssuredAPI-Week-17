package com.bestbuy.categoriesinfo;

import com.bestbuy.model.CategoriesPojo;
import com.bestbuy.testbase.TestBaseCategories;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class CategoriesPostTest extends TestBaseCategories {

    @Test
    public void createCategories() {
        CategoriesPojo categoriesPojo = new CategoriesPojo();
        categoriesPojo.setName("Play Toys");
        categoriesPojo.setId("2");

        Response response = given()
                .header("Content-Type", "application/json")
                .body(categoriesPojo)
                .when()
                .post();
        response.then().statusCode(201);
        response.prettyPrint();

    }

}
