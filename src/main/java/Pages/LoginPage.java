package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement emailbox;
	@FindBy(xpath="//input[@id='input-password']")
	WebElement Passwordbox;
	@FindBy(xpath="//input[@class='btn btn-primary']")
	WebElement ClickButton;
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")
	WebElement WarningMsg;
	
	
	public void EnterEmailAddress(String emailtext)
	{
		emailbox.sendKeys(emailtext);
	}
	
	public void EnterPassword(String password)
	{
		Passwordbox.sendKeys(password);
		
	}
	public void ClickOnButton()
	{
		ClickButton.click();
	}
	
	public boolean WArningMsgAboutCredentialsMismatch()
	{
		return WarningMsg.isDisplayed();
	}

}
