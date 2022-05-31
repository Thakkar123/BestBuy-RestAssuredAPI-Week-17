package com.bestbuy.categoriesinfo;

import com.bestbuy.testbase.TestBaseCategories;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class CategoriesDeleteTest extends TestBaseCategories {

    @Test
    public void deleteCategories() {
        Response response = given()
                .pathParam("id", "pcmcat84000050001")
                .when()
                .delete("/{id}");
        response.then().statusCode(200);
        response.prettyPrint();
    }

}
