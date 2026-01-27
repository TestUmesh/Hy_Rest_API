package api.endpoints;

import java.io.File;

public interface Path {

    String baseUrl = "https://dummyjson.com/";
    String rootPath = System.getProperty("user.dir");
    String jsonReaderPath = rootPath + File.separator + "src" + File.separator + "test" + File.separator + "resources";
    String ConfigPath = rootPath + "/src/main/resources/Config.properties";
}
