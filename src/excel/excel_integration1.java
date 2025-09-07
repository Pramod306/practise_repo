package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class excel_integration1 
{
	@DataProvider(name = "exceldata")
	public String[][] testdata() throws IOException
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\pramo\\OneDrive\\Desktop\\Book1.xlsx");
		XSSFWorkbook book = new XSSFWorkbook(fis);
		XSSFSheet sheet = book.getSheet("Sheet1");
		int lastrow = sheet.getLastRowNum();
		short lc = sheet.getRow(0).getFirstCellNum();
		String[][] cred = new String[lastrow+1][lc];
		for(int r=0;r<lastrow;r++)
		{
			XSSFRow row = sheet.getRow(r);
			for(int c=0;c<row.getLastCellNum();c++)
			{
				XSSFCell cell = row.getCell(c);
				String val =  cell.getStringCellValue();
				cred[r][c]= val;
			}
		}
		book.close();
		fis.close();
		return cred;
	}

}
