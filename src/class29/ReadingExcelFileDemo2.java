package class29;
import utils.ExcelReader;
import java.io.IOException;
public class ReadingExcelFileDemo2 {

        public static void main(String[] args) throws IOException {
            var excelData=   ExcelReader.read("C:\\Users\\charl\\IdeaProjects\\SDET Batch14Java\\Data\\Data.xlsx");
            System.out.println(excelData);

        }
    }

