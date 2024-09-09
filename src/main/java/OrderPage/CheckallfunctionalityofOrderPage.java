package OrderPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckallfunctionalityofOrderPage {
	@FindBy(xpath = "//a[text()='Login']") private WebElement loglcick;
	@FindBy(xpath = "//input[@placeholder='Email']") private WebElement entmail;
	@FindBy(xpath = "//input[@placeholder='Password']") private WebElement entpass;
	@FindBy(xpath = "//button[text()='Log in']") private WebElement loginbtn;
	@FindBy(xpath = "//a[text()='Orders']") private WebElement orderbtn;
	@FindBy(xpath = "//div[@role='button']") private WebElement createorder;
	@FindBy(xpath = "//input[@class='form-control check-box']") private WebElement entcompanyname;
	@FindBy(xpath = "//div[@class='dropdown companyDropDown']") private WebElement selectcompany;
	@FindBy(xpath = "//input[@name='pickupname']") private WebElement entnameb2b;
	@FindBy(xpath = "(//input[@class='form-control '])[1]") private WebElement entphonenumberb2b;
	@FindBy(xpath = "//input[@placeholder='PickUp Pincode']") private WebElement entepincodeofb2b;
	@FindBy(xpath = "(//input[@class='form-control '])[2]") private WebElement entaddressb2b;
	@FindBy(xpath = "//input[@name='pickupcity']") private WebElement entcitynameb2b;
	@FindBy(xpath = "//input[@name='pickupstate']") private WebElement entstateb2b;
	@FindBy(xpath = "//input[@name='delivername']") private WebElement entnameofrec;
	@FindBy(xpath = "(//input[@class='form-control '])[3]") private WebElement entnumofrec;
	@FindBy(xpath = "//input[@placeholder='Delivered Pincode']") private WebElement entepinofrec;
	@FindBy(xpath = "(//input[@placeholder='Search Places'])[2]") private WebElement entaddressofrec;
	@FindBy(xpath = "//input[@name='delivercity']") private WebElement entcitynameofrec;
	@FindBy(xpath = "//input[@name='deliverstate']") private WebElement entstateofrec;
	@FindBy(xpath = "//select[@class='form-control mt-1   ']") private WebElement clickentordertype;
	@FindBy(xpath = "//option[@value='PREPAID']") private WebElement selectprepaid;
	@FindBy(xpath = "//button[text()='Next']") private WebElement clicktonext;
	@FindBy(xpath = "//input[@placeholder='Weight']") private WebElement enterweight;
	@FindBy(xpath = "//input[@placeholder='L']") private WebElement entlength;
	@FindBy(xpath = "//input[@placeholder='B']") private WebElement enterbreadth;
	@FindBy(xpath = "//input[@placeholder='H']") private WebElement enterht;
	@FindBy(xpath = "//select[@class='form-control mt-1']") private WebElement clickondeleverytype;
	@FindBy(xpath = "(//select[@class='form-control mt-1']//option)[2]") private WebElement selectdeliverytype;
	@FindBy(xpath = "(//select[@placeholder='Select'])[2]")private WebElement selectpkgtype;
	@FindBy(xpath = "((//select[@placeholder='Select'])[2]//option)[2]") private WebElement selectenvelop;
	@FindBy(xpath = "//input[@placeholder='Product Price']") private WebElement prductprice;
	@FindBy(xpath = "//select[@class='form-control']")private WebElement selectproducttype;
	@FindBy(xpath = "//option[@value='Clothes']")private WebElement selectproduct;
	@FindBy(xpath = "//input[@placeholder='Quantity ']")private WebElement entquantity;
	@FindBy(xpath = "//input[@placeholder='Add Order Tag']")private WebElement addtag;
	@FindBy(xpath = "(//button[@class='btn next-btn'])[2]")private WebElement clicknextofwt;
	@FindBy(xpath = "//button[text()='Proceed To Pay']") private WebElement proceedtopay;
	@FindBy(xpath = "//div[@class='col-9']") private WebElement clicktowallet;
	@FindBy(xpath = "//button[text()='Continue']")private WebElement clickcontinue;
	public CheckallfunctionalityofOrderPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	public void logclickbtn()
	{
		loglcick.click();
	}
	public void entermail(String email)
	{
		entmail.sendKeys(email);
	}
	public void enterpass(String pass)
	{
		entpass.sendKeys(pass);
	}
	public void clickloginbtn()
	{
		loginbtn.click();
	}
	public void clickonorderbtn()
	{
		orderbtn.click();
	}
	public void clickoncreateorder()
	{
		createorder.click();
	}
	public void enterB2Bcompanyname(String cnameb2b)
	{
		entcompanyname.sendKeys(cnameb2b);
	}
	public void selectcompanyname()
	{
		selectcompany.click();
	}
	public void enternameofb2b(String b2bname)
	{
		entnameb2b.sendKeys(b2bname);
	}
	public void entphonenumOfb2b(String numb2b)
	{
		entphonenumberb2b.sendKeys(numb2b);
	}
	public void enterpincodeOfB2B(String pinb2b)
	{
		entepincodeofb2b.sendKeys(pinb2b);
	}
	public void enteraddressofb2b(String addressofb2b)
	{
		entaddressb2b.sendKeys(addressofb2b);
	}
	//public void entercitynameOfb2b(String b2bcity)
	//{
	//	entcitynameb2b.sendKeys(b2bcity);
	//}
	//public void enterstateOfb2b(String stateb2b)
	//{
	//	entstateb2b.sendKeys(stateb2b);
	//}
	public void enternameofrecivier(String nameofreciver)
	{
		entnameofrec.sendKeys(nameofreciver);
	}
	public void enternumberOfreciver(String numofreciver)
	{
		entnumofrec.sendKeys(numofreciver);
	}
	public void enterpincodOfreciver(String pinreciver)
	{
		entepinofrec.sendKeys(pinreciver);
	}
	public void enteraddressOfreciver(String addressofrec)
	{
		entaddressofrec.sendKeys(addressofrec);
	}
	//public void entercitynameOfreciver(String cityofrec)
	//{
	//	entcitynameofrec.sendKeys(cityofrec);
	//}
	//public void enterstateofrec(String stateofrec)
	//{
	//	entstateofrec.sendKeys(stateofrec);
	//}
	public void clickonordertype()
	{
		clickentordertype.click();
	}
	public void selectprepaid()
	{
		selectprepaid.click();
	}
	public void clicktonext()
	{
		clicktonext.click();
	}
	public void enterweight(String wt)
	{
		enterweight.sendKeys(wt);
	}
	public void enterlength(String L)
	{
		entlength.sendKeys(L);
	}
	public void enterbreadth(String B)
	{
		enterbreadth.sendKeys(B);
	}
	public void enterheight(String H)
	{
		enterht.sendKeys(H);
	}
	public void clickondeliverytype()
	{
		clickondeleverytype.click();
	}
	public void clickonsamedaydelivery()
	{
		selectdeliverytype.click();
	}
	public void selectpkgtype()
	{
		selectpkgtype.click();
	}
	public void selectenvelop()
	{
		selectenvelop.click();
	}
	public void enterproductprice(String price)
	{
		prductprice.sendKeys(price);
	}
	public void producttype()
	{
		selectproducttype.click();
	}
	public void selectproduct()
	{
		selectproduct.click();
	}
	public void entquantity(String quantity)
	{
		entquantity.sendKeys("1");
	}
	public void Addtag(String tag)
	{
		addtag.sendKeys(tag);
	}
	public void clicknextpageofwt()
	{
		clicknextofwt.click();
	}
	public void clickonproceedtopay()
	{
		proceedtopay.click();
	}
	public void clickonwalletbalance()
	{
		clicktowallet.click();
	}
	public void clickoncontinue()
	{
		clickcontinue.click();
	}
	
	

}
