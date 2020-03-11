package org.restassureddemo.test;


import io.restassured.RestAssured;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured.*;
 import       io.restassured.matcher.RestAssuredMatchers.*;
  import      org.hamcrest.Matchers.*;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.request;
import static org.hamcrest.CoreMatchers.equalTo;


public class Rest_Demo_Get {



@Test
    public void get(){

    given().
            when().get("http://localhost:8080/department/HR/allEmployee").then().statusCode(200).log().all().
            body("[0].department.id", equalTo("HR") ).and().body("[0].department.name", equalTo("Talent Search")).and()
.body("[0].name", equalTo("Danish"));


}

    @Test
    public void getPathParam(){

        given().with().pathParam("Department", "HR").when().

                get("http://localhost:8080/department/{Department}").then().statusCode(200).log().all().
                body("id", equalTo("HR") ).and().body("name", equalTo("Talent Search"));


    }



}
