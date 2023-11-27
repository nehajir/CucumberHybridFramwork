package Utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtils 
{
	WebDriver driver;
	public ElementUtils(WebDriver driver)
	{
	this .driver=driver;
	}
	
	public void ClickOnElement(WebElement element ,long durationinSecond)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(durationinSecond));
		WebElement we=wait.until(ExpectedConditions.elementToBeClickable(element));
		we.click();
	}
	
	public void TypeTextIntoElement(WebElement element,String Texttobetypes,long durationinsecond)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(durationinsecond));
		WebElement webelement= wait.until(ExpectedConditions.elementToBeClickable(element));
		
		webelement.click();
		webelement.clear();
		webelement.sendKeys(Texttobetypes);
		 
	}
	
	public void SelectOptionsInDropDown(WebElement element,String DropDownOptions,long durationinseconds)
	{
		WebElement webElement= waitForElement(element,durationinseconds);
		Select select = new Select(element);
		
		select.deselectByVisibleText(DropDownOptions);
	}

	private WebElement waitForElement(WebElement element, long durationinseconds) {
		// TODO Auto-generated method stub
		return null;
	}

}
