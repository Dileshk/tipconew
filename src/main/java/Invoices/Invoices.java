package Invoices;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Invoices {

	@FindBy(xpath = "//a[text()='Login']") private WebElement clickonloginonhomepage;
	@FindBy(xpath = "//input[@placeholder='Email']")private WebElement entermail;
	@FindBy(xpath = "//input[@placeholder='Password']")private WebElement enterpass;
	@FindBy(xpath = "//button[text()='Log in']")private WebElement clickonloginbtn;
	@FindBy(xpath = "//a[text()='Invoices']") private WebElement clickoninvoicesoninvoicestab;
	@FindBy(xpath = "//button[text()='Filter']")private WebElement clickonfilter;
	@FindBy(xpath = "//span[@class='checkmark']")private WebElement selectcheckboxof7days;
	@FindBy(xpath = "//button[text()='Filter']")private WebElement clickonapplyfilter;
	@FindBy(xpath = "//button[text()='Filter']")private WebElement againclickonfilter;
	@FindBy(xpath = "//button[text()='Cancel']")private WebElement resetfilter;
	@FindBy(xpath = "//button[@id='invoice-tab']")private WebElement clickoninvoices;
	@FindBy(xpath = "//*[@id=\"invoice-tab-pane\"]/div/table/tr[2]/td[7]/svg")private WebElement clicktodownloadinvoices;
	
	
	public Invoices(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clickonloginonhomepage()
	{
		clickonloginonhomepage.click();
	}
	public void entermail(String email)
	{
		entermail.sendKeys(email);
	}
	public void enterpassword(String pass) 
	{
		enterpass.sendKeys(pass);
	}
	public void clickonloginbtn()
	{
		clickonloginbtn.click();
	}
	public void clickoninvoicesoninvoicestab()
	{
		clicktodownloadinvoices.click();
	}
	public void clickonfilter()
	{
		clickonfilter.click();
	}
	public void selectcheckboxesFor7days()
	{
		selectcheckboxof7days.click();
	}
	public void clicktoapplyfilter()
	{
		clickonapplyfilter.click();
	}
	public void againclickonapplyfilter()
	{
		againclickonfilter.click();
	}
	public void resetfilter()
	{
		resetfilter.click();
	}
	public void clickoninvoice()
	{
		clickoninvoices.click();
	}
	public void clicktodownloadinvoices()
	{
		clicktodownloadinvoices.click();
	}
}
