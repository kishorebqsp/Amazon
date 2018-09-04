package dummy;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Upload {
public WebDriver driver;
@DataProvider(name="vtiger")
public Object[][] abc()
{
	//no of times the data is repeated same no of times test method will
	//get executed
return new Object[][] {{"abc","admin"},{"man","manager"}};
}
//here we are calling the dataprovider with its name
@Test(dataProvider="vtiger")
public void demo(String user,String pass)
{
	driver=new FirefoxDriver();
	driver.get("https://demo.vtiger.com/");
	driver.findElement(By.id("username")).sendKeys(user);
	driver.findElement(By.id("password")).sendKeys(pass);
}
}

	
	
	




