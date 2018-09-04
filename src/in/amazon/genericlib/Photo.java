package in.amazon.genericlib;

import java.io.File;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class Photo implements Auto_constant{
	public static String  getphoto(WebDriver driver,String folder,String testcasename)
	{
		String s="";
		try {
		Date d=new Date();
		String date = d.toString().replace(":","-");
		 s = folder+testcasename+date+".png";
		TakesScreenshot t=(TakesScreenshot) driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File(s));
		}
		catch(Exception e)
		{
			Reporter.log("photo is taken");

		}
	
return s;
	

}
}