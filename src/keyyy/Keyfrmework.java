package keyyy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

import in.amazon.genericlib.Base_test;
import in.amazon.genericlib.Datadriven;

public class Keyfrmework extends Base_test {

@Test
public void demo() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	String p="./dataEgine/bh.xlsx";
	FileInputStream f=new FileInputStream(p);
	Workbook wb = WorkbookFactory.create(f);
	int row = wb.getSheet("Sheet1").getLastRowNum();
	wb.close();
	Keyword k=new Keyword();
			k.driver=driver;
	for(int i=1;i<=row;i++)
	{
		String k1=Datadriven.getdata(p,"Sheet1", i,0);
		String k2=Datadriven.getdata(p,"Sheet1", i,1);
		String k3=Datadriven.getdata(p,"Sheet1", i,2);
		String k4=Datadriven.getdata(p,"Sheet1", i,3);
		System.out.println("k1:"+k1+" k2:"+k2+" k3"+k3+" k4:"+k4);
			k.k2=k2;
			k.k3=k3;
			if(k1.equals("enter"))
			{
				k.enter();
			}
			else if(k1.equals("click"))
			{
				k.click();
			}
			else
			{
				System.out.println("invalid");
			}
			Thread.sleep(6000);
	}
}
}
