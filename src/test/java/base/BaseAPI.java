package base;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;
import config.ConfigReader;

public class BaseAPI {

    @BeforeClass
    public void setup() {
        RestAssured.baseURI = ConfigReader.get("base.url");
    }
}
