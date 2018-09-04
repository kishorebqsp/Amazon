package in.amazon.genericlib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class Base_page {
	
	public void presentofelement(WebDriver driver,WebElement element)
	{
		try {
		WebDriverWait w=new WebDriverWait(driver,10);
		w.until(ExpectedConditions.visibilityOf(element));
		Reporter.log("element is present",true);
		}
		
		catch(Exception e)
		{
			Reporter.log("element is not present",true);
			Assert.fail();
		}
		}
		
	public void presentofbutton(WebDriver driver,WebElement element) {
		try
		{
			WebDriverWait wait=new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.elementToBeClickable(element));
			Reporter.log("element is clickable",true);
		}
		catch(Exception e)
		{
			Reporter.log("element is not clickable",true);
			Assert.fail();
		}
	}

	
}