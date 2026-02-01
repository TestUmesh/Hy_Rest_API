package api.utilites;

import api.payload.UserPayLoader;
import com.fasterxml.jackson.core.type.TypeReference;
import org.testng.annotations.DataProvider;

import java.util.List;

public class DataDriven {

    @DataProvider(name = "getAllUser")
    public Object[][] getTestcases() {

        List<UserPayLoader> data = JSONFileReader.readJsonFile("testdata/usertescase.json", new TypeReference<>() {
        });
        Object[][] obj = new Object[data.size()][1];
        for (int i = 0; i < data.size(); i++) {
            obj[i][0] = data.get(i);
        }
        return obj;
    }


}
