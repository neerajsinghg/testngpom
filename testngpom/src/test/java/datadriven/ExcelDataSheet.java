package datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataSheet {

	XSSFWorkbook wb;
	XSSFSheet sheet;
	public ExcelDataSheet(String excelPath) throws IOException {
		File file = new File(excelPath);
		FileInputStream fis = new FileInputStream(file);
		wb = new XSSFWorkbook(fis);
	}
	public String getData(int sheetnumber, int row, int coulumn)
	{
		sheet = wb.getSheetAt(sheetnumber);
		String data = sheet.getRow(row).getCell(coulumn).getStringCellValue();
		return data;
	}
	public int GetRowCount(int sheetIndex) {
		int row = wb.getSheetAt(sheetIndex).getLastRowNum();
		row = row+1;
		return row;
		
	}
}
