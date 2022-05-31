package com.restapiexample.dummy.myfirsttest;

import com.restapiexample.dummy.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

/**
 * Created by Jay Vaghani
 */
public class MyFirstTest extends TestBase {

    @Test
    public void getAllStudentInfo() {
//        given()
//                .when()
//                .get("http://localhost:8080/student/list")
//                .then()
//                .statusCode(200);

//        given()
//                .when()
//                .get("http://localhost:8080/student/list");
        Response response = given()
                .when()
                .get("/list");
        response.then().statusCode(200);
        response.prettyPrint();

    }
}
