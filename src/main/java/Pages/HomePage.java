package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	
	WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//li[@class='dropdown']/child::a[@title='My Account']")
	WebElement MyAccountDropMenu;
	@FindBy(linkText="Login")
	WebElement LoginButton;
	@FindBy(linkText="Register")
	WebElement RegisterAccount;
	@FindBy(name="search")
	WebElement Searchbox;
	@FindBy(xpath="//button[@class='btn btn-default btn-lg']")
	WebElement SearchButton;
	@FindBy(linkText="HP LP3065")
	WebElement ValidProductDispaly;
	
	@FindBy(xpath="//input[@id='button-search']/following-sibling::p")
	WebElement InvalidProductWarningmsg;
	public void ClickOnMyAccount()
	{
		MyAccountDropMenu.click();
	}
	
	public void ClickONLogin()
	{
		LoginButton.click();
	}
	public void ClickOnRegisterAccount()
	{
		RegisterAccount.click();
		
	}
	public void EnterProductname(String validproduct)
	{
		Searchbox.sendKeys(validproduct);
		
	}
	
	public void ClickOnSearchButton()
	{
		SearchButton.click();
	}
	
	public boolean ValidProductDispaly()
	{
		return ValidProductDispaly.isDisplayed();
	}
	
	public void EnterinvalidProductname(String Invalidproduct)
	{
		Searchbox.sendKeys(Invalidproduct);
		
	}
	public String InvalidProductWarningmsg()
	{
		return InvalidProductWarningmsg.getText();
	}

}
