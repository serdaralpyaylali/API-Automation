package services;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class PetService {

    public Response getPetById(int petId) {
        return given()
                .when()
                .get("/pet/" + petId)
                .then()
                .extract()
                .response();
    }

    public Response createPet(String body) {
        return given()
                .header("Content-Type", "application/json")
                .body(body)
                .when()
                .post("/pet")
                .then()
                .extract()
                .response();
    }
}
