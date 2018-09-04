package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page {
	@FindBy(id="username")
	private WebElement usernametb;
	
	public Page(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void username(String us)
	{
		usernametb.sendKeys(us);
	}

}
