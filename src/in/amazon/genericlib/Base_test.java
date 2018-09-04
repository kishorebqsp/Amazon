package in.amazon.genericlib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class Base_test implements Auto_constant  {
	public WebDriver driver;

	
	@BeforeMethod
	public void openapp()
	{
	 driver=new FirefoxDriver();
		//String url = Datadriven.getdata("Sheet1",1,2);
		//driver.get(url);
	String url = Propertyfile.getproperty("url");
	driver.get(url);
	}
	
	@AfterMethod
	public void closeapp(ITestResult testname)
	{
		String name = testname.getName();
		int status = testname.getStatus();
		if(status==2)
		{
			Photo.getphoto(driver,photopath,name);
		}
		else
		{
			Reporter.log("photo not taken");
		}
		driver.close();
	}

}
