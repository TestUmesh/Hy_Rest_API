package api.test.user;

import api.endpoints.UserEndpoint;
import api.payload.UserPayLoader;
import api.utilites.DataDriven;
import api.validators.ResValidator;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class GetUserBySearchTest {


    @Test(dataProvider = "getUserBySearch", dataProviderClass = DataDriven.class)
    public void validateGetUserBySearch(UserPayLoader pay) {
        Response res = UserEndpoint.getSpecificUserDetailsBySearch(pay.getQueryParam());
        res.then().log().all();

        ResValidator.validateResponseBody(res, pay.getValidation());

    }
}
