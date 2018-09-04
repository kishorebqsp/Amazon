package in.amazon.scripts;

import org.testng.annotations.Test;

import POM.Home_page;
import POM.Login_page;
import POM.Phone_page;
import POM.Samsunggalxynote8_page;
import in.amazon.genericlib.Base_test;
import in.amazon.genericlib.Lib;

public class Validlogin extends Base_test{
	@Test
	public void login() throws InterruptedException
	{
		Login_page l=new Login_page(driver);
		l.signinBtn();
		l.emailTxtBox("bharanigramesh28@gmail.com");
		l.continueBtn();
		l.passwordTxtBox("bharaniqsp5");
		l.loginBtn();
		Home_page h=new Home_page(driver);
		h.serachCreditals("sumsung galaxy note 8");
		Phone_page p=new Phone_page(driver);
	Thread.sleep(4000);
		p.signinbtn(driver);
		Thread.sleep(4000);
		p.signoutBtn();
	}
	
	

}
