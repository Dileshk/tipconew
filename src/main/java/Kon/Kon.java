package Kon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kon {
	@FindBy(xpath = "//a[text()='Forgotten password?']")private WebElement click;
	
	public Kon(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
	}
	public void btn()
	{
		click.click();
	}
	

}
