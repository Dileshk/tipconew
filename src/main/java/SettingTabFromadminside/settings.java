package SettingTabFromadminside;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class settings {
	@FindBy(xpath = "//a[text()='Login']") private WebElement loglcick;
	@FindBy(xpath = "//input[@placeholder='Email']") private WebElement entmail;
	@FindBy(xpath = "//input[@placeholder='Password']") private WebElement entpass;
	@FindBy(xpath = "//button[text()='Log in']") private WebElement loginbtn;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[2]/div[2]/div[2]/ul/div[3]/li/a")private WebElement clickonsettingtab;
	@FindBy(xpath = "//h3[text()='Employees']") private WebElement clickonempolyeetab;
	@FindBy(xpath = "//button[text()='+ Add Employee']")private WebElement addemployeetab;
	@FindBy(xpath = "//input[@placeholder='Enter Name']")private WebElement enternameofemployee;
	@FindBy(xpath = "//input[@class='form-control ']")private WebElement enterphonenumberofemployee;
	@FindBy(xpath = "//input[@placeholder='Email']")private WebElement entermailofemployee;
	@FindBy(xpath = "//input[@placeholder='Password']")private WebElement enterpassword;
	@FindBy(xpath = "//input[@placeholder='Confirm Password']")private WebElement enterandconformpassword;
	@FindBy(xpath = "//select[@placeholder='Category']")private WebElement clickoncategorie;
	@FindBy(xpath = "//option[text()='employee']")private WebElement selectemployeeincategorie;
	@FindBy(xpath = "//input[@type='checkbox']")private WebElement clickonpermission;
	@FindBy(xpath = "//button[@class='btn save-btn']")private WebElement clicksavebuttonofemployee;
	
	public  settings (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void logclick()
	{
		loglcick.click();
	}
	public void entmail(String email)
	{
		entmail.sendKeys(email);
	}
	public void entpass(String pass)
	{
		entpass.sendKeys(pass);
	}
	public void loginbtn()
	{
		loginbtn.click();
	}
	public void clickonsettingtab()
	{
		clickonsettingtab.click();
	}
	public void clickonempolyeetab()
	{
		clickonempolyeetab.click();
	}
	public void addemployeetab()
	{
		addemployeetab.click();
	}
	public void enternameofemployee()
	{
		enternameofemployee.sendKeys("sunny");
	}
	public void enterphonenumberofemployee()
	{
		enterphonenumberofemployee.sendKeys("6789543258");
	}
	public void entermailofemployee()
	{
		entermailofemployee.sendKeys("born47@yopmail.com");
	}
	public void enterpassword()
	{
		enterpassword.sendKeys("Demo@123");
	}
	public void enterandconformpassword()
	{
		enterandconformpassword.sendKeys("Demo@123");
	}
	public void clickoncategorie()
	{
		clickoncategorie.click();
	}
	public void selectemployeeincategorie()
	{
		selectemployeeincategorie.click();
	}
	public void clickonpermission()
	{
		clickonpermission.click();
	}
	public void clicksavebuttonofemployee()
	{
		clicksavebuttonofemployee.click();
	}
	
	

}
