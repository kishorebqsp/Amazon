package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import in.amazon.genericlib.Lib;

public class Phone_page {
	@FindBy(xpath="//h2[.='Samsung Galaxy Note 8 (Orchid Grey)']")
	private WebElement phone;
	
	@FindBy(xpath="//span[.='Hello, Bharani']")
	private WebElement elesigninBtn;
	
	@FindBy(xpath="//span[.='Sign Out']")
	private WebElement elesignoutBtn;
	
	
	public Phone_page(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
public void phoneImg()
{
	phone.click();
	
}
public void signinbtn(WebDriver driver)
{
	Lib.action(driver,elesigninBtn);
}
public void signoutBtn()
{
	elesignoutBtn.click();
	
}
}