package api.test.user;

import api.endpoints.UserEndpoint;
import api.payload.UserPayLoader;
import api.utilites.DataDriven;
import api.utilites.ProReader;
import api.validators.ResValidator;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class GetUserByIdTest {

    @Test(dataProvider = "getUserById", dataProviderClass = DataDriven.class)
    public void validateGetUserByID(UserPayLoader pay) {
        System.out.println("<--------------------------------------------------------------------------------->");
        ProReader.customLogPrints(pay.getTcN0() + ":--" + pay.getTestDesc());
        Response res = UserEndpoint.getSpecificUserDetails(pay.getPathParam());
        ResValidator.validateStatusCode(res, pay.getStCode());
        ResValidator.validateResponseBody(res, pay.getValidation());
        ProReader.customLogPrints(res.asPrettyString());
    }

}
