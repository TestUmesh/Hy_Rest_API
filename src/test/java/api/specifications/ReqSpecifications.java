package api.specifications;

import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class ReqSpecifications {

    public static RequestSpecification withAuthToken(String token) {
        return given()
                .accept(ContentType.JSON).contentType(ContentType.JSON)
                .header("Authorization", "Bearer " + token);

    }

    public static RequestSpecification withOutAuthToken() {
        return given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON);

    }
}
