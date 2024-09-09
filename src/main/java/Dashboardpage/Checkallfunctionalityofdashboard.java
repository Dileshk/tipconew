package Dashboardpage;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkallfunctionalityofdashboard {
	@FindBy(xpath = "//a[text()='Login']") private WebElement loglcick;;
	@FindBy(xpath = "//input[@placeholder='Email']") private WebElement entmail;
	@FindBy(xpath = "//input[@placeholder='Password']") private WebElement entpass;
	@FindBy(xpath = "//button[text()='Log in']") private WebElement loginbtn;
	
	@FindBy(xpath = "//input[@type='search']") private WebElement trackorder;
	@FindBy(xpath = "//button[@class='track-btn ']") private WebElement trackbtn;
	@FindBy(xpath = "//button[text()='Go to DashBoard']") private WebElement back;
	@FindBy(xpath = "//button[text()='Filter']") private WebElement clickfilter;
	@FindBy(xpath = "//span[@class='checkmark']")private WebElement last7days;
	@FindBy(xpath = "//button[text()='Apply Filters']")private WebElement applyfilterbtn;
	
	
	
	public Checkallfunctionalityofdashboard(WebDriver driver)
	{
	  PageFactory.initElements(driver, this);
	}
	public void clickloginonhome()
	{
		loglcick.click();
	}
	public void entermail(String mail)
	{
		entmail.sendKeys();
	}
	public void enterpass(String pass)
	{
		entpass.sendKeys(pass);
	}
	public void clickloginbtn()
	{
		loginbtn.click();
	}
	public void entordernum(String num)
	{
		trackorder.sendKeys(num);
	}
	public void clicktrackbtn()
	{
		trackbtn.click();
	}
	public void clickbackbtn()
	{
		back.click();
	}
	public void clickfilt()
	{
		clickfilter.click();
	}
	public void clicklast7days()
	{
		last7days.click();
	}
	public void clicktoapply()
	{
		applyfilterbtn.click();
	}

}
