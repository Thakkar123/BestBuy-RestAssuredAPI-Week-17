package com.bestbuy.categoriesinfo;

import com.bestbuy.testbase.TestBaseCategories;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class CategoriesGetTest extends TestBaseCategories {

   @Test
    public void getAllCategoriesInfo(){
       Response response = given()
               .when()
               .get();
       response.then().statusCode(200);
       response.prettyPrint();
   }

   @Test
    public void getSingleCategoryInfo(){

      Response response = given()
              .pathParam("id", "abcat0020004")
              .when()
              .get("/{id}");
      response.then().statusCode(200);
      response.prettyPrint();
   }
   @Test
   public void searchCategoryWithParameter() {
      HashMap<String,Object> qParams=new HashMap<>();
      qParams.put("$limit",2);
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
