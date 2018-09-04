package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import in.amazon.genericlib.Lib;

public class Samsunggalxynote8_page {
	@FindBy(xpath="//span[.='Hello, Bharani']")
	private WebElement elesigninBtn;
	
	@FindBy(xpath="//span[.='Sign Out']")
	private WebElement elesignoutBtn;
	
	public Samsunggalxynote8_page(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void userSigninBtn(WebDriver driver)
	{
		Lib.action(driver,elesigninBtn);
	}
public void signoutBtn()
{
	elesignoutBtn.click();
	
}
}
	

