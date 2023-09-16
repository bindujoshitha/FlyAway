package Flyaway.Project1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class TakeInput {
	public String url() throws IOException {
	ConstantsFile obj=new ConstantsFile();
	FileInputStream fs=new FileInputStream(obj.Testworkbook1);
	XSSFWorkbook workbook=new XSSFWorkbook(fs);
	XSSFSheet sheet=workbook.getSheetAt(0);
	Row row=sheet.getRow(1);
	Cell cell=row.getCell(0);
	System.out.println(sheet.getRow(1).getCell(0));
	XSSFCell value=sheet.getRow(1).getCell(0);
	String Text=value.toString();
	return Text;
	}
}
