package org.restassureddemo.test;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeTest;
import org.restassureddemo.test.JsonPayload;
import org.testng.annotations.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class Rest_Demo_Post {


    @BeforeTest

    public void getURI(){

        RestAssured.baseURI= "http://localhost:8080";
        RestAssured.basePath ="/department";




    }


    @Test
    public void postData(){
        System.out.println(JsonPayload.readJsonPayload());

        given().contentType("application/json").body(JsonPayload.readJsonPayload())
                .when().post().then().statusCode(200);

    }
}
