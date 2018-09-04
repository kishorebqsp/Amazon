package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {

	public static void main(String[] args) {
System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demo.vtiger.com/");
		
		Page p=new Page(driver);
		driver.navigate().refresh();
		p.username("dgfhjfdghjfdhjdfh");
	
	}

}
