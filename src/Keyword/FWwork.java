package Keyword;

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

public class FWwork extends Base_test {
@Test
public void demo() throws EncryptedDocumentException, InvalidFormatException, IOException, org.apache.poi.openxml4j.exceptions.InvalidFormatException
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
		String K1 = Datadriven.getdata(p,"Sheet1",i,0);
		String K2 = Datadriven.getdata(p,"Sheet1",i,1);
		String K3 = Datadriven.getdata(p,"Sheet1",i,2);
		String K4 = Datadriven.getdata(p,"Sheet1",i,3);
		k.k2=K2;
		k.k3=K3;
if(K1.equals("enter"))
{
	k.enter();
}
else if(K1.equals("click"))
{
	k.click();
}
else
{
	System.out.println("invalid");
}
}
	
	
}
}
