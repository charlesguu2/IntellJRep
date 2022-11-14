package class28;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelDemo2 {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\charl\\IdeaProjects\\SDET Batch14Java\\Data\\Data.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook file = new XSSFWorkbook(fileInputStream);
        Sheet sheet = file.getSheet("Sheet1");
        int nOfRows = sheet.getPhysicalNumberOfRows(); // returns how many rows are in actual contains the data in sheet
        System.out.println(nOfRows);
        for (int i = 0; i < nOfRows; i++) {
            Row row = sheet.getRow(i);
            int nOfCell = row.getPhysicalNumberOfCells(); // returns the total number of cells that contain data
            for (int j = 0; j < nOfCell; j++) {
                Cell cell=row.getCell(j);
                System.out.print(cell+" ");
            }
            System.out.println();
        }




    }
}
