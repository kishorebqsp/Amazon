package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import in.amazon.genericlib.Base_page;

public class Login_page extends Base_page{
	@FindBy(xpath="//span[.='Hello. Sign in']")
	private WebElement eleSigninBtn;
	
	@FindBy(id="ap_email")
	private WebElement eleEmailTxtBox;
	
	@FindBy(id="continue")
	private WebElement eleContinueBtn;
	
	@FindBy(id="ap_password")
	private WebElement elePasswordTxtBox;
	
	@FindBy(id="signInSubmit")
	private WebElement eleLoginBtn;
	
	public Login_page(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
public void signinBtn()
{
	eleSigninBtn.click();
}
 public void emailTxtBox(String email)
 {

	eleEmailTxtBox.sendKeys(email);
 }
 public void continueBtn()
 {
	eleContinueBtn.click();
 }
 public void passwordTxtBox(String password)
 {
	elePasswordTxtBox.sendKeys(password);
 }
 public void loginBtn()
 {
	eleLoginBtn.click();
}
 
 
	
	}
