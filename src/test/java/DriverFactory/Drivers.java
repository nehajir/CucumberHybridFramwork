package DriverFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Drivers 
{

	static WebDriver driver;
	
	
	public static WebDriver initilixation(String brousername)
	{
	
		
		
		if(brousername.equals("chrome"))
		{
			 driver = new ChromeDriver();
		}
		else if(brousername.equals("firefox"))
		{
			driver= new FirefoxDriver();
			
		}
		
		
		return driver;
		
	}
	
	

	

}
