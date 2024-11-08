package TestNgReadExcelFile;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.usermodel.Cell;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReadExcelFile {


    @Test
    public void DemoTest() throws IOException {
        // 1. Convert the physical file into Java understandable stream (FileInputStream)
        FileInputStream fileInputStream = new FileInputStream("./data/EmpDetails.xlsx");

        // 2. Create the workbook and store it
        Workbook workbook = WorkbookFactory.create(fileInputStream);

        // 3. Using workbook, get the sheet
        Sheet sheet = workbook.getSheet("RegisterDetails");

        // 4. Using sheet, get row
        Row row = sheet.getRow(1);

        // 5. Using row, get the column (cell)
        Cell column = row.getCell(0);

        // 6. Using column, get the data
        String data1 = column.getStringCellValue();
     // Optimized Code
     		String data2 = workbook.getSheet("RegisterDetails").getRow(1).getCell(1).getStringCellValue();
     		String data3 = workbook.getSheet("RegisterDetails").getRow(1).getCell(2).getStringCellValue();
     		double data4 = workbook.getSheet("RegisterDetails").getRow(1).getCell(3).getNumericCellValue();

     	// Display On data
     		 System.out.println("Data from Excel: " + data1);
    		Reporter.log(data2, true);
    		Reporter.log(data3, true);
    		Reporter.log("+91" + data4, true);

    		// How To Write The Data From ExcelFile:
    			// Step1:Write the Data ()
    			workbook.getSheet("Registerdetails").createRow(2).createCell(6).setCellValue("Learning Selenium From Harry");
    			
    			// Step2:Convert The data From Java To File(FileOutputStream Class)
    			FileOutputStream fos = new FileOutputStream("./data/EmpDetails.xlsx");

    			// Step3:Save/Store The Data.
    			workbook.write(fos);

        // Close the file input stream and workbook
        workbook.close();
        fileInputStream.close();
        System.out.println("Execution Completed");

}
}
