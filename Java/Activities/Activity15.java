package activities;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class Activity15 {

    private static String FILE_NAME = "resources/TestSheet.xlsx";

    public static void main(String[] args) throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Java datatypes");

        Object[][] obj = {
                {"Datatype", "Type", "Size(in bytes)"},
                {"int", "Primitive", 2},
                {"float", "Primitive", 4},
                {"double", "Primitive", 8},
                {"char", "Primitive", 1},
                {"String", "Non-Primitive", "No fixed size"}
        };

        int rowNum = 0;

        for(Object[] obj1:obj){
            Row row = sheet.createRow(rowNum++);

            int colNum=0;

            for(Object field:obj1){
                Cell cell = row.createCell(colNum++);
                if(field instanceof String){
                    cell.setCellValue((String) field);
                }else if(field instanceof Integer){
                    cell.setCellValue((Integer) field);
                }
            }
        }

        FileOutputStream outputStream = new FileOutputStream(FILE_NAME);
        workbook.write(outputStream);
    }
}
