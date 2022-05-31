package com.restapiexample.dummy.extractingresponsedata;

import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

import static io.restassured.RestAssured.given;


public class SearchJsonPathExample {

    static ValidatableResponse response;
    @BeforeClass
    public static void inIt() {
        RestAssured.baseURI="https://dummy.restapiexample.com";

        response =given()
                .when()
                .get("/api/v1/employees")
                .then().statusCode(200);
    }


    @Test
    public void test001() {
        System.out.println("-------------StartingTest------");
        List<Object> totalRecord=response.extract().path("data");
        System.out.println("Total records are : "+totalRecord.size());
        int dataID=response.extract().path("data[23].id");
        System.out.println("data[23].id : "+dataID);

        String name=response.extract().path("data[23].employee_name");
        System.out.println("Data[23].employee_name : "+name);

        String message=response.extract().path("message");
        System.out.println("Message : "+message);

        String status=response.extract().path("status");
        System.out.println("Status : "+status);


        int idSalary=response.extract().path("data[2].employee_salary");
        System.out.println("Id = 3 has employee_salary is : "+idSalary);

        int idAge=response.extract().path("data[5].employee_age");
        System.out.println("Id = 6 has employee_age : "+idAge);
        String idName=response.extract().path("data[10].employee_name");
        System.out.println("Id = 6 has employee_age : "+idName);

        System.out.println("------------------End of Test---------------------------");
    }
}