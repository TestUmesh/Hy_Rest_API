package api.utilites;

import api.endpoints.Path;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ProReader {

    public static String readProp(String key) throws IOException {
        File file = new File(Path.ConfigPath);
        FileInputStream ip = new FileInputStream(file);
        Properties pro = new Properties();
        pro.load(ip);
        return pro.getProperty(key);

    }

    public static void writeProp(String key, String value) throws IOException {
        File file = new File(Path.ConfigPath);
        FileInputStream ip = new FileInputStream(file);
        Properties pro = new Properties();
        pro.load(ip);
        pro.setProperty(key, value);
        FileOutputStream out = new FileOutputStream(file);
        pro.store(out, key);


    }


    public static void customLogPrints(String str) {
        System.out.println(str);
    }
}
