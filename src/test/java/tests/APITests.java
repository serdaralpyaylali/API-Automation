package tests;

import base.BaseAPI;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import services.PetService;

public class APITests extends BaseAPI {

    PetService petService = new PetService();

    @Test
    public void getPet_positive() {

        Response response = petService.getPetById(1);

        Assert.assertEquals(response.getStatusCode(), 200);
        Assert.assertNotNull(response.jsonPath().get("id"));
    }

    @Test
    public void getPet_negative() {

        Response response = petService.getPetById(999999999);

        Assert.assertEquals(response.getStatusCode(), 404);
    }
}
