package wan;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ban {
	@FindBy(xpath = "//span[@class='nav-drop-title-wrap']")private WebElement click;
	
	@FindBy(xpath = "//span[text()='SAP']")private WebElement cnaother;
	
	@FindBy(xpath = "//input[@placeholder='Email address or phone number']")private WebElement email;
	@FindBy(xpath = "//input[@placeholder='Password']")private WebElement pass;
	public ban(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void mustang()
	{
		click.click();
	}
	public void nun()
	{
		cnaother.click();
	}
	public void enteremail(String name)
	{
		email.sendKeys(name);
	}
	public void enterpass(String code)
	{
		pass.sendKeys(code);
	}

}
