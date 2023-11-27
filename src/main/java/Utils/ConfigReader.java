package Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	public static Properties initilization() throws IOException
	{
		
		Properties prop= new Properties();
		
		FileInputStream file= new FileInputStream ("E:\\eclipse-workspace\\Tutorial_Ninja\\src\\test\\resources\\config.properties");
	     prop.load(file);
	     
	     return prop;

	}

}
