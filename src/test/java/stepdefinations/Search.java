package stepdefinations;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import DriverFactory.Drivers;
import Pages.HomePage;
import Utils.ConfigReader;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import junit.framework.Assert;

public class Search 
{
	WebDriver driver;
	HomePage homepage;
	@Before
	public void Setup() throws IOException
	{
		Properties prop=ConfigReader.initilization();
		System.setProperty("webdriver.chrome.driver", "E:\\syllabus_Neha\\Selenium Jars File\\chromeDriver 117\\chromedriver.exe");
		driver=Drivers.initilixation(prop.getProperty("Browser"));
		driver.get(prop.getProperty("URL"));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
	}
	@Given("User opan an applications")
	public void user_opan_an_applications() 
	{

	 
	    
	}

	@When("User enters valid product {string} into searchbox filed")
	public void user_enters_valid_product_into_searchbox_filed(String validproduct) 
	{
		 homepage = new HomePage(driver);
		 homepage.EnterProductname(validproduct);
		
		
	    
	}

	@When("User clicks on search button")
	public void user_clicks_on_search_button() 
	{
		homepage.ClickOnSearchButton();
	   
	}

	@Then("User should get valid product display in search result")
	public void user_should_get_valid_product_display_in_search_result() 
	{
		Assert.assertTrue(homepage.ValidProductDispaly());
		
	   
	}

	@When("User enters invalid product {string} into searchbox filed")
	public void user_enters_invalid_product_into_searchbox_filed(String invalidProduct) 
	{
		 homepage = new HomePage(driver);
		 homepage.EnterinvalidProductname(invalidProduct);
	}

	@Then("User should get message about no product matching")
	public void user_should_get_message_about_no_product_matching() 
	{
		
	    Assert.assertTrue(homepage.InvalidProductWarningmsg().contains("There is no product that matches the search criteria."));
	}

	@When("User  dont enters any product name  into searchbox filed")
	public void user_dont_enters_any_product_name_into_searchbox_filed()
	{
		HomePage homepage= new HomePage(driver);
	    
	}




}
