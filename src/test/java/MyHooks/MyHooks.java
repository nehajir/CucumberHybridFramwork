package MyHooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import DriverFactory.Drivers;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class MyHooks 
{
	WebDriver driver;
	
	
	
	
	@Before
	public void Setup()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\syllabus_Neha\\Selenium Jars File\\chromeDriver 117\\chromedriver.exe");
		 driver= new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
	}
	
	
	
	
	
	@After
	public void TearDown(Scenario scenario) //for taking faild scenario screenshot.
	{
		String scenarioname=scenario.getName().replaceAll("", "_");
		
		if(scenario.isFailed())
		{
		  
			byte[] screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "Image/png", scenarioname);
		}
		
		driver.close();
	}
	

}
