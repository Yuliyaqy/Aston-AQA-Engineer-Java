
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

public class PostmanEchoTests {

    @Test
    public void testGetRequest() {

        RestAssured.baseURI = "https://postman-echo.com";

        Response response = when()
                .get("/get")
                .then()
                .extract()
                .response();

        assertEquals(response.getStatusCode(), 200);

        assertEquals(response.jsonPath().get("headers.host"), "postman-echo.com");
        assertEquals(response.jsonPath().get("headers.x-forwarded-proto"), "http");

        Object xRequestStart = response.jsonPath().get("headers.x-request-start");
        assertInstanceOf(String.class, xRequestStart, "Фактический результат не является строкой");

        assertEquals(response.jsonPath().get("headers.connection"), "close");

        assertEquals(response.jsonPath().get("headers.x-forwarded-port"), "443");

        Object xAmznTraceId = response.jsonPath().get("headers.x-amzn-trace-id");
        assertInstanceOf(String.class, xAmznTraceId, "Фактический результат не является строкой");

        Object userAgent = response.jsonPath().get("headers.user-agent");
        assertInstanceOf(String.class, userAgent, "Фактический результат не является строкой");

        assertEquals(response.jsonPath().get("headers.accept"), "*/*");

        Response response1 = RestAssured.get("https://postman-echo.com/get");
        String postmanTokenValue1 = response1.getHeader("Postman-Token");

        Response response2 = RestAssured.get("https://postman-echo.com/get");
        String postmanTokenValue2 = response2.getHeader("Postman-Token");

        if(postmanTokenValue1 != null && postmanTokenValue2 != null) {
            if(postmanTokenValue1.equals(postmanTokenValue2)) {
                System.out.println("Значения Postman-Token совпадают.");
            } else {
                System.out.println("Значения Postman-Token не совпадают.");
            }
        } else {
            System.out.println("Одно или оба значения Postman-Token равны null.");
        }

    }

    @Test
    public void testPostRawText() {

        RestAssured.baseURI = "https://postman-echo.com";

        String requestBody = "Maxim";

        given()
                .contentType(ContentType.TEXT)
                .body(requestBody)
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .assertThat()
                .body("data", equalTo(requestBody));

    }

    @Test
    public void testPostFormData() {

        String expectedName = "Maxim";
        String expectedAge = "25";

        String requestBody = "name = " + expectedName + "&age=" + expectedAge;

        Response response = RestAssured.given()
                .contentType(ContentType.URLENC)
                .body(requestBody)
                .post("https://postman-echo.com/post")
                .then()
                .statusCode(200)
                .body("form.name", equalTo(expectedName))
                .body("form.age", equalTo(expectedAge))
                .extract()
                .response();

        int actualStatusCode = response.getStatusCode();
        assertThat(actualStatusCode, equalTo(200));

        String actualName = response.jsonPath().getString("form.name");
        String actualAge = response.jsonPath().getString("form.age");
        assertThat(actualName, equalTo(expectedName));
        assertThat(actualAge, equalTo(expectedAge));

    }

    @Test
    public void testPutRequest() {

        Response response = RestAssured.given()
                .body("{\"name\":\"Timur\", \"age\":\"28\"}")
                .put("https://postman-echo.com/put");
        response.then().statusCode(200);

        response.then().body("name", equalTo("Timur"))
                .body("age", equalTo("28"));

    }

    @Test
    public void testPatchRequest() {

        Response response = RestAssured.given()
                .body("{\"name\":\"Olga Kohan\"}")
                .when()
                .patch("https://postman-echo.com/patch")
                .then()
                .statusCode(200)
                .body("name", equalTo("Olga Kohan"))
                .extract().response();

    }

    @Test
    public void testDeleteRequest() {

        String endpoint = "https://postman-echo.com/delete";

        Response response = RestAssured.given()
                .when()
                .delete(endpoint)
                .then()
                .statusCode(200)
                .body("headers.host", equalTo("postman-echo.com"))
                .extract().response();
        
    }

}
