package stepdefinations;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import DriverFactory.Drivers;
import Pages.AccountPage;
import Pages.HomePage;
import Pages.LoginPage;
import Utils.ConfigReader;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class Login
{
	WebDriver driver;
	 LoginPage loginpage;
	 AccountPage accountpage;
	
	@Before
	public void Setup() throws IOException
	{
		Properties prop=ConfigReader.initilization();
		//System.setProperty("webdriver.chrome.driver", "E:\\syllabus_Neha\\Selenium Jars File\\chromeDriver 117\\chromedriver.exe");
		driver=Drivers.initilixation(prop.getProperty("Browser"));
		
		driver.get(prop.getProperty("URL"));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
	}
	@After
	public void TearDown()
	{
		driver.close();
	}
	@Given("User has navigated to login page")
	public void user_has_nevigate_to_login_page() 
	{
		HomePage homepage= new HomePage(driver);
		homepage.ClickOnMyAccount();
		homepage.ClickONLogin();
	
	}
	

	@When("User enters valid email {string} in emailbox")
	public void user_enters_valid_email_in_emailbox(String emailtext) 
	{
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

	    LoginPage loginpage= new LoginPage(driver);
	    
	    loginpage.EnterEmailAddress(emailtext);
	    
	}

	@And("User enters valid password {string} in passwordbox")
	public void user_enters_valid_password_in_passwordbox(String password) 
	{
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		 loginpage.EnterPassword(password);
	    
	}

	@And("User clicks on login button")
	public void user_clocks_on_login_button()
	{
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	     loginpage.ClickOnButton();
	    
	}

	@Then("User should get logged into applicarion")
	public void user_should_get_logged_into_applicarion() 
	{
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
	      accountpage= new AccountPage(driver);
		
		Assert.assertTrue(accountpage.DisplayStatusOFEditYourAccount());
	}
	
	
	
	

	@When("User enters invalid email {string} into email box")
	public void user_enters_invalid_email_into_email_box(String invalidemailtext) 
	{
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		loginpage= new LoginPage(driver);
		
		loginpage.EnterEmailAddress(invalidemailtext);
	    
	}

	@And("User enters invalid password {string}into password box")
	public void user_enters_invalid_password_into_password_box(String invalidpassword) 
	{
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		loginpage.EnterPassword(invalidpassword);
	    
	    
	}

	
   @Then("User should get proper warning message about credentials mismatch")
	public void user_should_get_proper_warning_message_about_credentials_mismatch() 
	{
	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
	    
	    
	   Assert.assertTrue(loginpage.WArningMsgAboutCredentialsMismatch());
	}

	

	

	

	@When("User dont enters email into emailbox")
	public void user_dont_enters_email_into_emailbox() 
	{
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		loginpage = new LoginPage(driver);
		
		loginpage.EnterEmailAddress("");
	}

	@When("User dont enters password into passwordbox")
	public void user_dont_enters_password_into_passwordbox() 
	{
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		loginpage.EnterPassword("");
	    
	}


}
