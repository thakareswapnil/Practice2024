package InterviewQuestions2;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XlUtilities {
	public FileInputStream fi;
	public XSSFWorkbook workbook;
	public XSSFSheet sheet;
	public XSSFRow row;
	public XSSFCell cell;
	String path;

	XlUtilities(String path) {
		this.path = path;
	}

	public int getrowcount(String name) throws IOException {

		fi = new FileInputStream(path);
		workbook = new XSSFWorkbook(fi);
		sheet = workbook.getSheet(name);
		int rownumber = sheet.getLastRowNum();
		fi.close();
		workbook.close();

		return rownumber;

	}

	public int getcellcount(String sheetname, int rownumber) throws IOException {
		fi = new FileInputStream(path);
		workbook = new XSSFWorkbook(fi);
		sheet = workbook.getSheet(sheetname);
		row = sheet.getRow(rownumber);
		int cellnumber=row.getLastCellNum();
		fi.close();
		workbook.close();
		return cellnumber;

	}
	public String celldata(String sheetname,int rownumber,int cellnumber) throws IOException {
		fi=new FileInputStream(path);
		workbook=new XSSFWorkbook(fi);
		sheet=workbook.getSheet(sheetname);
		row=sheet.getRow(rownumber);
		cell=row.getCell(cellnumber);
		String Celldata=cell.getStringCellValue();
		
		return Celldata;
		
		
	}

}
