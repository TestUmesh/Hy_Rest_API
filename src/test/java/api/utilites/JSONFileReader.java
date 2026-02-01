package api.utilites;


import api.endpoints.Path;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.List;

public class JSONFileReader {


    public static <T> List<T> readJsonFile(String file, TypeReference<List<T>> ref) {
        try {
            File files = new File(Path.jsonReaderPath + File.separator + file);
            System.out.println(files.getAbsolutePath());
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(files, ref);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("file not able to read");
        }
    }
}

