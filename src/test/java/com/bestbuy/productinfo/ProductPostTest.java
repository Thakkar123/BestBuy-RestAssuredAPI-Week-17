package com.bestbuy.productinfo;

import com.bestbuy.model.ProductPojo;
import com.bestbuy.testbase.TestBaseProducts;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;


public class ProductPostTest extends TestBaseProducts {

    @Test
    public void createProduct() {

        ProductPojo productPojo=new ProductPojo();
        productPojo.setName("Alkline Battery");
        productPojo.setType("Battery");
        productPojo.setPrice(10);
        productPojo.setShipping(0);
        productPojo.setManufacturer("Kodak");
        productPojo.setUpc("0004445");
        productPojo.setDescription("Long-lasting energy Battery");
        productPojo.setModel("UC-3334");
        productPojo.setUrl("http://www.bestbuy.com/site/kodak1");
        productPojo.setImage("http://img.bystatic.com/BestBuy_US/images/products/4853/48000_sa.jpg");

        Response response = given()
                .header("Content-Type", "application/json")
                .body(productPojo)
                .when()
                .post();
        response.then().statusCode(201);
        response.prettyPrint();


    }
}
