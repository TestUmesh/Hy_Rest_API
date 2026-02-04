package api.test.user;

import api.endpoints.Routes;
import api.endpoints.UserEndpoint;
import api.payload.UserPayLoader;
import api.utilites.DataDriven;
import api.utilites.ProReader;
import api.validators.ResValidator;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class GetAllUserTest {
    @Test(dataProvider = "getAllUser", dataProviderClass = DataDriven.class)
    public void validateUserDetails(UserPayLoader users) {
        ProReader.customLogPrints(Routes.getUser);
        ProReader.customLogPrints(users.getTcN0() + ":--" + users.getTestDesc());
        Response response = UserEndpoint.getUserDetails();
        ResValidator.validateStatusCode(response, users.getStCode());
        ResValidator.validateResponseBody(response, users.getValidation());


    }


}
