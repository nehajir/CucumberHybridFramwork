package stepdefinations;

import java.io.IOException;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import DriverFactory.Drivers;
import Pages.AccountScucess;
import Pages.HomePage;
import Pages.RegisterPage;
import Utils.ConfigReader;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class Register 
{
	WebDriver driver;
	HomePage homepage;
	RegisterPage registerpage;
	AccountScucess acountsucess;
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
	@Given("User has nevigated to register account page")
	public void user_has_nevigated_to_register_account_page() 
	{
		HomePage homepage= new HomePage (driver);
		
		homepage.ClickOnMyAccount();
	   
	    homepage.ClickOnRegisterAccount();
	 
			
			
	}

	@When("User enters details in field below")
	public void user_enters_details_in_field_below(DataTable dataTable) 
	{
		Map<String,String > datamap= dataTable.asMap(String.class,String.class);
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		registerpage.firstname(datamap.get("Firstname"));
		registerpage.Lastname(datamap.get("Lastname"));
		registerpage.Email(datamap.get("email"));
		registerpage.Phoneno(datamap.get("phoneno"));
		registerpage.Password(datamap.get("password"));
		registerpage.ConfirmPassword(datamap.get("password"));
		
		
	    
	}

	
	@And("User selects privacy policy")
	public void user_selects_privacy_policy() 
	{
		registerpage.SelectPrivcy();
	}
		

	@And("User clicks on continue button")
	public void user_selects_clicks_on_button() 
	{
		registerpage.SelectContinueButton();
	
	}
	    
	

	@Then("User account should get created sucessfully")
	public void user_account_should_get_created_sucessfully()
	{
      acountsucess= new  AccountScucess (driver);
        
        Assert.assertEquals("Your Account Has Been Created!",acountsucess.PageHeadig() );
	    
	}

	

	@Then("User should get proper warning msg about duplicate account")
	public void user_should_get_proper_warning_msg_about_duplicate_account()
	{
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		Assert.assertTrue(registerpage.DuplicateAccount());
	}

	@When("User dont enters any deatils into filed")
	public void user_dont_enters_any_deatils_into_filed() {
	    
	}

	

	@Then("User should get proper warning msg fro every madnatory field")
	public void user_should_get_proper_warning_msg_fro_every_madnatory_field() 
	{
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		registerpage= new RegisterPage(driver);
		
		Assert.assertTrue(registerpage.getWarningmsg().contains("Warning: You must agree to the Privacy Policy!"));
		
		Assert.assertTrue(registerpage.Firstnamewarning().contains("First Name must be between 1 and 32 characters!"));
		Assert.assertTrue(registerpage.LAstnameWarningmsg().contains("Last Name must be between 1 and 32 characters!"));
		Assert.assertTrue(registerpage.EmailWarning().contains("E-Mail Address does not appear to be valid!"));
		Assert.assertTrue(registerpage.MobNOWarningMsg().contains("Telephone must be between 3 and 32 characters!"));
	    Assert.assertTrue(registerpage.PasswordWarningMsg().contains("Password must be between 4 and 20 characters!"));
	    
	    
	  
	  
	
	 
	
	
	}




}
