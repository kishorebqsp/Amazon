package Sample6;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Hub {
@Parameters({"browser,ip"})
	@Test
	public void demo(String browsername,int ip) throws MalformedURLException{
		URL node=new URL("http://+ip+:4444/wd/hub");
		DesiredCapabilities browser=new DesiredCapabilities();
		browser.setBrowserName(browsername);
	//	RemoteWebDriver driver=new RemoteWebDriver(remoteAddress, capabilities)
		RemoteWebDriver driver=new RemoteWebDriver(node,browser);
		driver.get("http://localhost/login.do");
		driver.findElement(By.id("username")).sendKeys("fdhgfj");
		

}
}