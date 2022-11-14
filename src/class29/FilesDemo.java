package class29;

import utils.ConfigReader;
import utils.ExcelReader;

import java.io.IOException;

public class FilesDemo {
    public static void main(String[] args) throws IOException {
        String path ="C:\\Users\\charl\\IdeaProjects\\SDET Batch14Java\\Data\\config.properties";
        var properties = ConfigReader.read(path);
        System.out.println(properties.get("browser"));

        String excelPath="C:\\Users\\charl\\IdeaProjects\\SDET Batch14Java\\Data\\Data.xlsx";
        var excelData = ExcelReader.read(excelPath);
        System.out.println(excelData);
    }
}
