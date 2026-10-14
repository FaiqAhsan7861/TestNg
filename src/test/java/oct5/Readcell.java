package oct5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readcell {

	public static void main(String[] args) throws Throwable {
		FileInputStream fi = new FileInputStream("C:/Users/USER/Documents/Myfile.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet ws = wb.getSheet("Emp");
		int rc = ws.getLastRowNum();
		System.out.println("No Of Rows Are"+rc);
		for (int i=1;i<=rc;i++)
		{
			String Fname = ws.getRow(i).getCell(0).getStringCellValue();
			String lname = ws.getRow(i).getCell(1).getStringCellValue();
			int emp  = (int) ws.getRow(i).getCell(2).getNumericCellValue();
			System.out.println(Fname+"  "+lname+"    "+emp);
			//write as status pass in status 
			ws.getRow(i).createCell(3).setCellValue("pass");
		}
      //create new workbook
		FileOutputStream fo = new FileOutputStream("c:/Users/USER/Documents/result.xlsx");
		wb.write(fo);
		fo.close();
		wb.close();
		
	}

}
