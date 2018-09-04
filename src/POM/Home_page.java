package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_page {
	@FindBy(id="twotabsearchtextbox")
	private WebElement eleSearchTxtBox;
	
	@FindBy(xpath="//input[@value='Go']")
	private WebElement eleSearchBtn;
	
	public Home_page(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public void serachCreditals(String product)
	{
		eleSearchTxtBox.sendKeys(product);
		eleSearchBtn.click();
	}
	
}
