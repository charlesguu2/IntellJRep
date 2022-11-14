package class28;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileDemo1 {
    public static void main(String[] args) throws IOException {

        var path="Data/config.properties"; // location of the file
        var fileInputStream=new FileInputStream(path); // it helps us Navigate to the file
        var properties=new Properties();
        properties.load(fileInputStream); // adds all data from the file inside java code()
        System.out.println(properties.getProperty("browser"));


    }
}
