package org.restassureddemo.test;

import io.restassured.http.ContentType;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Properties;

import static io.restassured.RestAssured.given;

public class Rest_Demo_PostSerialization {

    public Properties prop;

    @Test

    public void createNewDepartmentSerialization(){

        JsonPayloadSerialization js= new JsonPayloadSerialization();

      prop=  js.readJsonPayload();

      Department dep= new Department();

      dep.setId(prop.getProperty("id"));
      dep.setName(prop.getProperty("name"));
      dep.setDescription(prop.getProperty("description"));

      given().contentType(ContentType.JSON).body(dep)
                .when().post("http://localhost:8080/department").then().statusCode(200);



    }





}
