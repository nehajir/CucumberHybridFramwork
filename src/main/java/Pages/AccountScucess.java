package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountScucess 
{
	WebDriver driver;
	
	public AccountScucess(WebDriver driver)
	{
		this .driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@id='content']/h1")
	WebElement PageHeading;
	
	public String PageHeadig()
	{
		return PageHeading.getText();
	}
	

}
