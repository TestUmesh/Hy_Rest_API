package api.validators;

import api.utilites.ProReader;
import io.restassured.response.Response;
import org.testng.Assert;

import java.util.Map;

public class ResValidator {

    public static void validateStatusCode(Response response, int StCode) {
        System.out.println("Actual Status Code :" + response.getStatusCode());
        Assert.assertEquals(response.getStatusCode(), StCode);


    }

    public static void validateResponseMessage(Response response, String key, String expString) {
        System.out.println("Actual Message:" + response.jsonPath().getString("key"));
        Assert.assertEquals(response.jsonPath().getString(key), expString);
    }


    public static void validateResponseTime(Response response) {
        long actualTime = response.getTime();
        System.out.println("actualTime=" + actualTime);
        Assert.assertTrue(actualTime < 3000, "time is std time");
    }

    public static void validateResponseBody(Response response, Map<String, Object> mapObj) {
        // to loop the value in key value pair
        mapObj.forEach((searchKey, compareValue) -> {
            Object actualResult = response.jsonPath().get(searchKey);
            // check weather object is null or not then continue next line
            Assert.assertNotNull(actualResult);

            // to check obj type is int
            if (compareValue instanceof Integer) {
                Assert.assertTrue(Integer.parseInt(actualResult.toString()) > 0);
                ProReader.customLogPrints("Actual results :" + actualResult.toString());
            }
            // to check obj is String
            if (compareValue instanceof String) {
                Assert.assertTrue(actualResult.toString().contains(compareValue.toString()));
                ProReader.customLogPrints("Actual results :" + actualResult.toString());
            }


        });

    }

}
