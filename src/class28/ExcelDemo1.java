package class28;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelDemo1 {
    public static void main(String[] args) throws IOException {

        //we need to know path of file
        String path="C:\\Users\\charl\\IdeaProjects\\SDET Batch14Java\\Data\\Data.xlsx";
        //navigate to this path
       FileInputStream fileInputStream = new FileInputStream(path);
       // that special class that can handle the xlsx files
        XSSFWorkbook excelfile = new XSSFWorkbook(fileInputStream);
        Sheet sheet=excelfile.getSheet("Sheet1");
        Row row=sheet.getRow(0);
        System.out.println(row.getCell(0));
    }
}
