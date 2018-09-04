package in.amazon.genericlib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Lib {
	
	public static void action(WebDriver driver,WebElement target)
	{
		try {
			Actions a=new Actions(driver);
			a.moveToElement(target).perform();
		}
		catch(Exception e)
		{
			System.out.println("action is not performed");
			
		}
	}

}
