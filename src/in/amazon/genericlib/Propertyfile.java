package in.amazon.genericlib;

import java.io.FileInputStream;
import java.util.Properties;

public class Propertyfile implements Auto_constant{

	public static String getproperty(String key)
	{
		String v="";
		try {
		Properties p=new Properties();
		p.load(new FileInputStream(filepath));
		 v = p.getProperty(key);
		}
		catch(Exception e)
		{
			
		}
		return v;
	}
}
