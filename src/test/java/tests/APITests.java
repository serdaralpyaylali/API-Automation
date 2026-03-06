package tests;

import base.BaseAPI;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import services.PetService;

public class APITests extends BaseAPI {

    PetService petService = new PetService();
    int petId = 301;
    String createBody= """
            {
              "id": %d,
              "category": {
                "id": 0,
                "name": "string"
              },
              "name": "Test Dog",
              "photoUrls": [
                "string"
              ],
              "tags": [
                {
                  "id": 0,
                  "name": "string"
                }
              ],
              "status": "available"
            }
            """.formatted(petId);
    String updateBody = """
        {
          "id": %d,
          "name": "UpdatedDog",
          "status": "available"
        }
        """.formatted(petId);


    @Test
    public void getPet_positive() {
        Response response = petService.getPetById(1);

        Assert.assertEquals(response.getStatusCode(), 200);
        Assert.assertNotNull(response.jsonPath().get("id"));
    }


    @Test
    public void lifeCycleTest() {
        //Create
        Response createResponse = petService.createPet(createBody);
        Assert.assertEquals(createResponse.statusCode(), 200, "The pet is not created.");

        //Verify Create
        Response getResponse = petService.getPetById(petId);

        Assert.assertEquals(getResponse.getStatusCode(), 200);
        Assert.assertNotNull(getResponse.jsonPath().get("id"));

        //Update
        Response updateResponse = petService.createPet(updateBody);

        Assert.assertEquals(updateResponse.statusCode(), 200);
        Assert.assertNotNull(updateResponse.jsonPath().get("id"));

        //Delete
        Response deleteResponse = petService.deletePet(petId);
        Assert.assertEquals(deleteResponse.statusCode(), 200);
        Assert.assertNotNull(deleteResponse.jsonPath().get("message"));

        //Verify Delete
        Response negativeResponse = petService.getPetById(petId);
        Assert.assertEquals(negativeResponse.statusCode(), 404,"The requested Pet id is not not reachable.");

    }
}
