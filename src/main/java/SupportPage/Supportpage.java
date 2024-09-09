package SupportPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Supportpage {
	@FindBy(xpath = "//a[text()='Login']") private WebElement clickonloginbtnonhomepage;
	@FindBy(xpath = "//input[@placeholder='Email']") private WebElement entermail;
	@FindBy(xpath = "//input[@placeholder='Password']") private WebElement entpassword;
	@FindBy(xpath ="//button[text()='Log in']") private WebElement clicktosignin;
	@FindBy(xpath = "//a[@class=' active  active']")private WebElement clickonsupporttab;
	
	public Supportpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickonloginbtnonhomepage()
	{
		clickonloginbtnonhomepage.click();
	}
	public void entermail(String email)
	{
		entermail.sendKeys(email);
	}
	public void enterpass(String password)
	{
		entpassword.sendKeys(password);
	}
	public void clicktosignin()
	{
		clicktosignin.click();
	}
	public void clickonsupporttab()
	{
		clickonsupporttab.click();
	}
	
	
	

}



