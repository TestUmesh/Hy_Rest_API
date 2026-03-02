package api.endpoints;

import api.specifications.ReqSpecifications;
import io.restassured.response.Response;

public class UserEndpoint {

    public static Response getUserDetails() {
        return ReqSpecifications.withOutAuthToken()
                .get(Routes.getUser);
    }

    public static Response getSpecificUserDetails(int id) {
        return ReqSpecifications.
                withOutAuthToken().pathParam("id", id)
                .get(Routes.getSingleUser);
    }

    public static Response getSpecificUserDetailsBySearch(String search) {
        return ReqSpecifications.withOutAuthToken()
                .queryParam("q", search)
                .get(Routes.getSearchUser);
    }

    public static Response filterUserByKey$Value(String key, String value) {
        return ReqSpecifications.withOutAuthToken()
                .queryParam("key", key).queryParam("value", value)
                .get(Routes.getFilterUser);
    }

}
