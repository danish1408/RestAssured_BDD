package org.restassureddemo.test;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Rest_Demo_Put {


    @BeforeTest

    public void getURI(){



        RestAssured.baseURI= "http://localhost:8080";
        RestAssured.basePath ="department/HR";




    }


    @Test
    public void putData(){
        System.out.println(JsonPayload.readJsonPayload());

        given().contentType("application/json").body(JsonPayload.readJsonPayload())
                .when().put().then().statusCode(200);

    }
}
