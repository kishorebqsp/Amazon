package in.amazon.genericlib;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Datadriven {
	
	public static String getdata(String path,String sheet,int row,int cell)
	{
		String s="";
		try {
		FileInputStream f=new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(f);
		 s = wb.getSheet(sheet).getRow(row).getCell(cell).toString();
		}
		catch(Exception e)
		{
			
		}
		return s;
	}
}
