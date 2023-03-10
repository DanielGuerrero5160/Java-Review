package Review11;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class ExcelDemo1 {
    public static void main(String[] args) {
        String path="Files/StudentNames.xlsx";
        try {
            FileInputStream fileInputStream=new FileInputStream(path);
            XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
            Sheet sheet1=xssfWorkbook.getSheet("sheet1");

            int noOfRows=sheet1.getPhysicalNumberOfRows();
            var excelData=new ArrayList<Map<String,String>>();
            Row row0=sheet1.getRow(0);
            for (int i = 1; i < noOfRows; i++) {
                Row row=sheet1.getRow(i);
              Map<String,String> rowMap=new LinkedHashMap<>();
                int noOfCells=row.getPhysicalNumberOfCells();
                for (int j = 0; j < noOfCells; j++) {
                    String key=row0.getCell(j).toString();
                    String value=row.getCell(j).toString();
                    rowMap.put(key,value);

                }
excelData.add(rowMap);

            }
            System.out.println(excelData);

        } catch (Exception e) {
            System.out.println("Please check the path of the file");
        }
        }
    }
