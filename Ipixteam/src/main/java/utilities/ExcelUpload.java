/*package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import constants.Constant;

public class ExcelUpload {
public static FileInputStream f;
public static XSSFWorkbook w;
public static XSSFSheet sh,sh1;

public static String getStringData(int a,int b,String sheet) throws IOException{
	String filePath=Constant.TESTDATAEXCEL;
	f=new FileInputStream(filePath);
	w=new XSSFWorkbook(f);
	sh=w.getSheet(sheet);
	Row r=sh.getRow(a);
	Cell c=r.getCell(b);
	return c.getStringCellValue();
	
	
}
public static String getIntegerData(int a,int b,String sheet) throws IOException{
	String filePath=Constant.TESTDATAEXCEL;
	f=new FileInputStream(filePath);
	w=new XSSFWorkbook(f);
	sh=w.getSheet(sheet);
	Row r=sh.getRow(a);
	Cell c=r.getCell(b);
	int x=(int) c.getNumericCellValue();
	return String.valueOf(x);
	

}

}
*/
package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUpload {
    private static Workbook workbook;
    private static Sheet sheet;

    // Load Excel file
    public static void loadExcel(String filePath, String sheetName) throws IOException {
        FileInputStream file = new FileInputStream(filePath);
        workbook = new XSSFWorkbook(file);
        sheet = workbook.getSheet(sheetName);
    }

    // Fetch String Data from Excel
    public static String getStringData(int row, int col, String sheetName) throws IOException {
        String filePath = "src/test/resources/newfile.xlsx"; // Adjust path as needed
        loadExcel(filePath, sheetName);
        
        Row sheetRow = sheet.getRow(row);
        if (sheetRow == null) {
            System.out.println("❌ Error: Row " + row + " does not exist in sheet: " + sheetName);
            return "";  // Return an empty string instead of null
        }

        Cell cell = sheetRow.getCell(col);
        if (cell == null) {
            System.out.println("❌ Error: Cell [" + row + ", " + col + "] is empty.");
            return "";
        }

        return cell.getStringCellValue();
    }
}
