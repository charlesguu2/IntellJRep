package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    public static Properties read(String path) throws IOException {
        var fileInputStream=new FileInputStream(path); // it helps us Navigate to the file
        var properties=new Properties();
        properties.load(fileInputStream); // adds all data from the file inside java code()
        return properties;
    }

}
