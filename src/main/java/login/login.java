package login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login {
//	@FindBy(xpath = "//a[text()='Login']") private WebElement loglcick;;
//	@FindBy(xpath = "//input[@placeholder='Email']") private WebElement entmail;
//	@FindBy(xpath = "//input[@placeholder='Password']") private WebElement entpass;
//	@FindBy(xpath = "//button[text()='Log in']") private WebElement loginbtn;
//	@FindBy(xpath = "//input[@placeholder='Tracking ID']")private WebElement trackorder;
//	@FindBy(xpath = "//input[@type='submit']") private WebElement clicksub;
//	@FindBy(xpath = "(//a[@aria-current='page'])[2]") private WebElement logout;
//	@FindBy(xpath = "//a[text()='Login']") private WebElement loglcick2;
//	@FindBy(xpath = "//a[text()='Forget Password?']") private WebElement forget;
//	@FindBy(xpath = "//input[@type='email']") private WebElement entermail;
//	@FindBy(xpath = "//button[text()='Next']") private WebElement nextbtn;
	@FindBy(xpath = "//input[@placeholder='Email address or phone number']")private WebElement entemail;
	@FindBy(xpath = "//input[@placeholder='Password']")private WebElement entpass;
	@FindBy(xpath = "//button[@type='submit']")private WebElement clickbtn;
	
	//WebDriver driver1;
	
	
	public login(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
//	public void entermail(String email)
//	{
//		entmail.sendKeys(email);
//	}
//	public void entpass(String pass)
//	{
//		entpass.sendKeys(pass);
//	}
//	public void loginbtn()
//	{
//		loginbtn.click();
//	}
//	public void clicklog()
//	{
//		loglcick.click();
//	}
//	public void track(String ID)
//	{
//		trackorder.sendKeys(ID);
//	}
//	public void submit()
//	{
//		clicksub.click();
//	}
//	public void clicklogout()
//	{
//	 logout.click();
//		
//	}
//	public void log2()
//	{
//		loglcick2.click();
//	}
//	public void forget()
//	{
//		forget.click();
//	
//	}
//	public void entmailpopup(String formail)
//
//	{
//		entermail.sendKeys(formail);
//	}
//	public void clicknext()
//	{
//		nextbtn.click();
//	}
	public void mail(String email)
	{
		entemail.sendKeys(email);
	}
	public void pass(String pass)
	{
		entpass.sendKeys(pass);
	}
	public void click()
	{
		clickbtn.click();
	}
}
