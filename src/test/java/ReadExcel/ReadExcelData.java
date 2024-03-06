package ReadExcel;

import org.apache.poi.xssf.usermodel.*;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;

public class ReadExcelData {
    XSSFWorkbook excelWorkBook = null;
    XSSFSheet excelSheet;
    @Test
    public void getCellData() throws Exception {
        try{
            FileInputStream fis = new FileInputStream(new File(System.getProperty("user.dir") + "/src/test/resources/Book1.xlsx"));
            excelWorkBook = new XSSFWorkbook(fis);
            excelSheet = excelWorkBook.getSheet("Sheet1");
        }catch(Exception e){
            e.printStackTrace();
        }

        int rows = excelSheet.getLastRowNum();
        int columns = excelSheet.getRow(0).getLastCellNum();

        for (int i = 1; i <= rows; i++){
            for (int j = 0; j < columns; j++){
                System.out.print(excelSheet.getRow(i).getCell(j).toString() + " ");
            }
            System.out.println();
        }

        excelWorkBook.close();
    }
}
