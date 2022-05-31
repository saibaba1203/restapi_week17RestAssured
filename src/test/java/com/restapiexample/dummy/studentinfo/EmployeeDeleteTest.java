package com.restapiexample.dummy.studentinfo;
import io.restassured.response.Response;
import com.restapiexample.dummy.testbase.TestBase;
import org.junit.Test;
import static io.restassured.RestAssured.given;

public class EmployeeDeleteTest extends TestBase {

    @Test
    public void deleteSingleStudentInfo(){
        Response response = given()
                .pathParam("id", "21")
                .when()
                .delete("/delete/{id}");
        response.then().statusCode(200);
        response.prettyPrint();
    }


}
