package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage
{
	WebDriver driver;
	
	public RegisterPage(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="input-firstname")
	WebElement FirstnameField;
	
	@FindBy(id="nput-lastname")
	WebElement LastnameField;
	@FindBy(id="input-email")
	WebElement EmailField;
	@FindBy(id="input-telephone")
	WebElement TelephoneField;
	@FindBy(id="input-password")
	WebElement passwordField;
	@FindBy(id="input-confirm")
	WebElement ConfirmPasswordField;
	@FindBy(xpath="//input[@name='agree']")
	WebElement PrivacyPolicy;
	@FindBy(xpath="//input[@class='btn btn-primary']")
	WebElement ContinueButton;
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")
	WebElement DuplicayeAccountWarningmsg;
	@FindBy(xpath="//div[contains(@class,'alert-dismissible')]")
	WebElement Warningmsg;
	@FindBy(xpath="//div[contains(text(),'First Name must be between 1 and 32 characters!')]")
	WebElement FirstnameWarningmsg;
	@FindBy(xpath="//input[@class='form-control']/following-sibling::div[contains(text(),'Last Name must be between 1 and 32 characters!')]")
	WebElement LAstnameWarningmsg;
	@FindBy(xpath="//input[@id='input-email']/following-sibling::div")
	WebElement EmailWarning;
	@FindBy(xpath="//input[@id='input-telephone']/following-sibling::div")
	WebElement MobNOWarningMsg;
	@FindBy(xpath="//input[@id='input-password']/following-sibling::div")
	WebElement PasswordWarningMsg;
	
	public void firstname(String Firstname)
	{
		FirstnameField.sendKeys(Firstname);
	}
	
	public void Lastname(String Lastname)
	{
		LastnameField.sendKeys(Lastname);
	}
	public void Email(String email)
	{
		EmailField.sendKeys(email);
	}
	
	public void Phoneno(String phoneno)
	{
		TelephoneField.sendKeys(phoneno);
	}
	public void Password(String password)
	{
		passwordField.sendKeys(password);
	}
	public void ConfirmPassword(String confirmpassword)
	{
		ConfirmPasswordField.sendKeys(confirmpassword);
	}
	
	public void SelectPrivcy()
	{
		 PrivacyPolicy.click();
	}
	
	public void SelectContinueButton()
	{
		ContinueButton.click();
	}
	
	public boolean DuplicateAccount()
	{
		return DuplicayeAccountWarningmsg.isDisplayed();
	}
	
	public String getWarningmsg()
	{
		return Warningmsg.getText();
	}
	public String Firstnamewarning()
	{
		return FirstnameWarningmsg.getText();
	}
	public String  LAstnameWarningmsg()
	{
		return LAstnameWarningmsg.getText();
	}
	public String EmailWarning()
	{
		return EmailWarning.getText();
	}
	public String MobNOWarningMsg()
	{
		return MobNOWarningMsg.getText();
	}
	public String PasswordWarningMsg()
	{
		return PasswordWarningMsg.getText();
	}
	
	
	

}
