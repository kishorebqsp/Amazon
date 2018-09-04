package Qp;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Xyz.class)
public class Abc {
	
	@Test
	public void openzpp()
	{
		Reporter.log("hello",true);
	}
	@Test
	public void closezpp()
	{
		Reporter.log("bye",true);
		Assert.fail();
	}
	

}
