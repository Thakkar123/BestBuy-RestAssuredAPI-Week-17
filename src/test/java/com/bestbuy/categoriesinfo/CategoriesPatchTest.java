package com.bestbuy.categoriesinfo;

import com.bestbuy.model.CategoriesPojo;
import com.bestbuy.testbase.TestBaseCategories;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class CategoriesPatchTest extends TestBaseCategories {

    @Test
    public void updateCategoriesWithPatch() {
        CategoriesPojo categoriesPojo = new CategoriesPojo();
        categoriesPojo.setName("Playing Games");


        Response response = given()
                .header("Content-Type", "application/json")
                .pathParam("id", "2")
                .body(categoriesPojo)
                .when()
                .patch("/{id}");
        response.then().statusCode(200);
        response.prettyPrint();

    }


}
