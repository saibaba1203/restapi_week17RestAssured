package com.restapiexample.dummy.studentinfo;

import com.restapiexample.dummy.model.EmployeePojo;
import com.restapiexample.dummy.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

/*
 *  Created by Jay
 */
public class EmployeePostTest extends TestBase {

    @Test
    public void createStudent() {

        EmployeePojo employeePojo = new EmployeePojo();
        employeePojo.setEmployee_name("sanket");
        employeePojo.setEmployee_salary(55000);
        employeePojo.setEmployee_age(35);


        Response response= given()
                .header("Content-Type","application/json")
                //  .contentType(ContentType.JSON)

                .body(employeePojo)
                .when()
                .post("/create");
        response.then().statusCode(200);
        response.prettyPrint();

       }
//    @Test
//    public void getSingleStudentInfo() {
//        Response response = given()
//                //.pathParam("user",2)
//                .when()
//                .get("/employee/1");
//        response.then().statusCode(200);
//        response.prettyPrint();
//
//
//    }


}
