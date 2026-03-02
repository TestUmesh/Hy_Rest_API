package api.test.user;

import api.endpoints.UserEndpoint;
import api.payload.UserPayLoader;
import api.utilites.DataDriven;
import api.validators.ResValidator;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class GetUserByFilterTest {

    @Test(dataProvider = "getUserByFilter", dataProviderClass = DataDriven.class)
    public void validateUserFilter(UserPayLoader pay) {
        Response res = UserEndpoint.filterUserByKey$Value(pay.getPathParam());
        ResValidator.validateStatusCode(res, pay.getStCode());
    }

}
