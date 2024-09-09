package OrderPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Orderstagesfromadminside {
	@FindBy(xpath = "//a[text()='Login']") private WebElement loglcick;
	@FindBy(xpath = "//input[@placeholder='Email']") private WebElement entmail;
	@FindBy(xpath = "//input[@placeholder='Password']") private WebElement entpass;
	@FindBy(xpath = "//button[text()='Log in']") private WebElement loginbtn;
	@FindBy(xpath = "//a[text()='Orders']") private WebElement orderbtn;
	@FindBy(xpath = "//select[@class='form-select']")private WebElement assignTodeliveryboy;
	@FindBy(xpath = "//option[text()='sravani']")private WebElement pickupdeliveryboyname;
	@FindBy(xpath = "//button[text()='Confirm']") private WebElement clicktoconfirm;
	@FindBy(xpath = "//button[text()='Ready To Pickup']") private WebElement clickonnextstage;
	@FindBy(xpath = "//*[@id=\"readyforpickup-tab-pane\"]/table/tr[2]/td[1]/b")private WebElement clicktovieworder;
	@FindBy(xpath = "//button[text()='Add Remark']") private WebElement addremark;
	@FindBy(xpath = "//div[@class='popupinner']//textarea")private WebElement clickonremarktextbox;
	@FindBy(xpath = "//textarea[@placeholder='Write Here....']") private WebElement writeremark;
	@FindBy(xpath = "//button[@class='save-btn']") private WebElement clickonsave;
	@FindBy(xpath = "//button[text()='View Remark']") private WebElement clicktoviewremark;
	@FindBy(xpath = "//div[@class='close-btn']") private WebElement clickoncrossbtn;
	@FindBy(xpath = "//button[@class='btn btn-ship   ']")private WebElement clickontrack;
	@FindBy(xpath = "//button[@class='btn back-btn']") private WebElement backfromtrackpage;
	@FindBy(xpath = "//button[@class='btn back-btn']") private WebElement backfromreadytopickupview;
	@FindBy(xpath="//button[text()='Filter']")private WebElement clickonfilterbutton;
	@FindBy(xpath = "(//span[@class='checkmark'])[1]") private WebElement clickondomesticcheckbox;
	@FindBy(xpath = "((//span[@class='checkmark']))[3]")private WebElement clickonprepaidcheckbox;
	@FindBy(xpath = "//select[@class='form-select']")private WebElement listofdileveryboy;
	@FindBy(xpath = "//option[text()='sravani']") private WebElement selectdeliveryboy;
	@FindBy(xpath = "(//span[@class='checkmark'])[5]")private WebElement selectB2Bcheckbox;
	@FindBy(xpath = "//button[text()='Apply Filters']") private WebElement clickonapplyfilter;
	@FindBy(xpath="//button[text()='Filter']")private WebElement clickonfilterbuttontoreset;
	@FindBy(xpath = "//input[@type='reset']")private WebElement clickonresetbutton;
	
	
	@FindBy(xpath = "//div[@class='download-item d-flex align-items-center justify-content-center  ']")private WebElement downloadcsvfile;
	@FindBy(xpath = "(//button[text()='Picked Up'])[2]")private WebElement clickactiononreadytopickuppage;
	@FindBy(xpath = "//button[@id='pickup-tab']") private WebElement pickupsatge;
	@FindBy(xpath = "(//b[@type='button'])[36]") private WebElement clickonvieworderinpickupstage;
	@FindBy(xpath = "//button[@class='btn btn-ship   ']")private WebElement trackorderinpickuppage;
	@FindBy(xpath = "//button[text()='Back']") private WebElement backfromtrackinpickupstage;
	@FindBy(xpath = "//button[text()='Add Remark']")private WebElement clickonaddremarkinpickup;
	@FindBy(xpath = "//textarea[@class='w-100 p-2']")private WebElement clickontextboxofremark;
	@FindBy(xpath = "//textarea[@class='w-100 p-2']") private WebElement writeonremarkbox;
	@FindBy(xpath = "//button[@class='save-btn']")private WebElement clickonsaveofremark;
	//@FindBy(xpath = "")private WebElement clickonsavebutton;
	
	@FindBy(xpath = "//*[@id=\"receivedathub-tab-pane\"]/table/tr[2]/td[1]/b")private WebElement vieworderinrecivedAthub;
	@FindBy(xpath = "//button[text()='Add Remark']")private WebElement clickonaddremarkinrecivedathubbutton;
	@FindBy(xpath = "//textarea[@class='w-100 p-2']")private WebElement clickontextboxofremarkateceviedathub;
	@FindBy(xpath = "//textarea[@class='w-100 p-2']") private WebElement writeonremarkboxinreceveivedAthub;
	@FindBy(xpath = "//button[@class='save-btn']")private WebElement clickonsaveofremarkinrecathub;
//	@FindBy(xpath = "//button[text()='View Remark']")private WebElement viewremarkinrecivedathub;
	@FindBy(xpath = "//button[@class='btn btn-ship   ']")private WebElement trackorderinrecivedAthubpage;
	@FindBy(xpath = "//button[text()='Back']") private WebElement backfromtrackinrecivedAthubpagehhhhhhh;
	@FindBy(xpath = "//button[@class='btn back-btn']")private WebElement backfromviewofrecivedatvieworder;
	@FindBy(xpath = "//button[@id='receivedathub-tab']") private WebElement recievedathubstage;
	@FindBy(xpath = "//*[@id=\"receivedathub-tab-pane\"]/table/tr[2]/td[1]/b") private WebElement viewOrderinrecivedAthubsatage;
	@FindBy(xpath = "//button[text()='View Remark']")private WebElement clickonviewremarkinrecivedathubstage;
	@FindBy(xpath = "//button[text()='Add Remark']")private WebElement clickonaddremarkrecivedathubstage;
	@FindBy(xpath = "//textarea[@class='w-100 p-2']")private WebElement clickontextboxOfrecivedathubstage;
	@FindBy(xpath = "//textarea[@class='w-100 p-2']") private WebElement writeonremarkboxinrecivedathubstage;
	@FindBy(xpath = "//button[@class='save-btn']")private WebElement clickonsaveofremarkinrecivedathubstage;
	@FindBy(xpath = "//button[text()='Track']") private WebElement clickontrackinrecivedathubstage;
	@FindBy(xpath = "//button[text()='Back']")private WebElement backtrackfromrecivedathubstage;
	@FindBy(xpath = "//*[@id=\"receivedathub-tab-pane\"]/table/tr[2]/td[7]/div")private WebElement  clickonbookedorderinrecivedAthub;
	@FindBy(xpath = "(//div[@class=' css-19bb58m'])[2]") private WebElement clicktoselectdeliverypartner;
	@FindBy(xpath = "//button[@id='booked-tab']") private WebElement vieworderinbookedstage;
	@FindBy(xpath = "//*[@id=\"booked-tab-pane\"]/table/tr[2]/td[1]/b")private WebElement clicktovieworderinbookedstage;
	@FindBy(xpath = "//button[text()='Track']") private WebElement clickontrackorderinbookedstage;
	@FindBy(xpath = "//button[text()='Back']") private WebElement clickonbackfromtrackorderinbookedsatge;
	@FindBy(xpath = "//button[text()='Add Remark']")private WebElement clickonaddremarkinoutfordelivrystage;
	@FindBy(xpath = "//textarea[@class='w-100 p-2']")private WebElement clickonwriteremarkinoutfordeliverystge;
	@FindBy(xpath = "//textarea[@class='w-100 p-2']") private WebElement writeremarkonoutfordeliverysatge;
	@FindBy(xpath = "//button[text()='Save']") private WebElement clickonsavebuttoninoutfordeliverystage;
	@FindBy(xpath = "//button[@id='delivered-tab']") private WebElement clickondeliverdstage;
	@FindBy(xpath = "//*[@id=\"delivered-tab-pane\"]/table/tr[2]/td[1]/b") private WebElement vieworderindeliverdstage;
	@FindBy(xpath = "//button[text()='Track']")private WebElement clickontrackindeliverdstage;
    @FindBy(xpath = "")private WebElement clicktovieworderindeliverdstage;
    
	//@FindBy(xpath = "//button[@class='btn back-btn']")private WebElement clicktobackfrombookedstage;
	
	
	
	
	public Orderstagesfromadminside(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickonloginbtn()
	{
		loglcick.click();
	}
	public void entermail(String Amail)
	{
		entmail.sendKeys(Amail);
	}
	public void entpass(String pass)
	{
		entpass.sendKeys(pass);
	}
	public void loginbtn()
	{
		loginbtn.click();
	}
	public void clickonorderbtn()
	{
		orderbtn.click();
	}
	public void clickondeliveryboylist()
	{
		assignTodeliveryboy.click();
	}
	public void pickupddeliveryboyname()
	{
		assignTodeliveryboy.click();
	}
	public void clickonconfirm()
	{
		clicktoconfirm.click();
	}
	public void gotoreadytopickupstage()
	{
		clickonnextstage.click();
	}
	public void clickonordernumandview()
	{
		clicktovieworder.click();
	}
	//public void addremarkfororder()
//	{
	//	addremark.click();
	//}
	//public void clickonremarktextbox()
	//{
	//	clickonremarktextbox.click();
//	}
	//public void writeremark()
	//{
	//	addremark.sendKeys("teting1 stage ready to pickup remark");
	//}
	//public void clickonsave()
  //  {
		
		//clickonsave.click();
	//}
	public void clickonremarkandsee()
	{
		clicktoviewremark.click();
	}
	public void clicktoclose()
	
	{
		clickoncrossbtn.click();
	}

	
	public void clicktotrack()
	{
		clickontrack.click();
	}
	public void clickonbackfromordertrackpage()
	{
		backfromtrackpage.click();
	}
	public void clickonbackfromreadyTopickupview()
	{
		backfromreadytopickupview.click();
	}
	public void clickonfilterbtn()
	{
		clickonfilterbutton.click();
	}
	public void clickondomesticcheckbox()
	{
		clickondomesticcheckbox.click();
	}
	public void clickonprepaid()
	{
		clickonprepaidcheckbox.click();
	}
	public void listofdeliverboy()
	{
		listofdileveryboy.click();
	}
	public void selectdeliveryboyfromlist()
	{
		selectdeliveryboy.click();
	}
	public void B2Bcheckbox()
	{
		selectB2Bcheckbox.click();
	}
	public void clickonapplyfilter()
	{
		clickonapplyfilter.click();
	}
	public void clickonfilterbuttonforreset()
	{
		clickonfilterbuttontoreset.click();
	}
	public void clickonresetbutton()
	{
		clickonresetbutton.click();
	}
	public void clickondownloadcsvfile()
	{
		downloadcsvfile.click();
	}
	
	public void ordermovefromreadytopickuptopickdup()
	{
		clickonvieworderinpickupstage.click();
	}
	public void gotopickuppage()
	{
		pickupsatge.click();
	}
	public void clickonvieworderinPickupstage()
	{
		clickonvieworderinpickupstage.click();
	}
	public void trackorderfrompickuppage()
	{
		trackorderinpickuppage.click();
	}
	public void backfromtrackorder()
	{
		backfromtrackinpickupstage.click();
	}
	public void clickonaddremarkinpickup()
	{
		clickonaddremarkinpickup.click();
	}
	public void clickontextboxofremark()
	{
		clickontextboxofremark.click();
	}
	public void writeonremarkbox()
	{
		writeonremarkbox.sendKeys("testing complte in pickupstage");
	}
	public void clickonsavebtn()
	{
		clickonsaveofremark.click();
	}
	public void viewOrderinrecivedAthub()
	{
		vieworderinrecivedAthub.click();
	}
	public void clickonrecivedatHubaction()
	{
		clickonaddremarkinrecivedathubbutton.click();
	}
	public void clickontextboxofremarkateceviedathub()
	{
		clickontextboxofremarkateceviedathub.click();
	}
	public void writeonremarkboxinreceveivedAthub()
	{
		writeonremarkboxinreceveivedAthub.sendKeys("testingdone in recevied at hub stage");
	}
	//public void viewremarkinrecivedathub()
	//{
	//	viewremarkinrecivedathub.click();
	//}
	public void trackorderinrecivedAthubstage()
	{
		trackorderinrecivedAthubpage.click();
	}
	public void backfromtrackinrecivedAthubpage()
	{
		backfromtrackinrecivedAthubpagehhhhhhh.click();
	}
	public void clickonrecievedAthubstage()
	{
		recievedathubstage.click();
	}
	public void viewOrderinrecivedAthubsatage()
	{
		viewOrderinrecivedAthubsatage.click();
	}
	public void clickonaddremarkrecivedathubstage()
	{
		clickonaddremarkrecivedathubstage.click();
	}
	public void clickontextboxOfrecivedathubstage()
	{
		clickontextboxOfrecivedathubstage.click();
	}
	public void writeonremarkboxinrecivedathubstage()
	{
		writeonremarkboxinrecivedathubstage.sendKeys("testing complete in recived at hub stage ");
	}
	public void clickonsaveofremarkinrecivedathubstage()
	{
		clickonsaveofremarkinrecivedathubstage.click();
	}
	public void backtrackfromrecivedathubstage()
	{
		backtrackfromrecivedathubstage.click();
	}
	public void clickbackfromrecivedathubstageh()
	{
		backfromviewofrecivedatvieworder.click();
	}
	public void clickonbookedaction()
	{
		clickonbookedorderinrecivedAthub.click();
	}
	public void clicktoselectdeliverypartner()
	{
		clicktoselectdeliverypartner.click();
	}
	public void vieworderinbookedstage()
	{
		vieworderinbookedstage.click();
	}
	public void clicktovieworderinbookedstage()
	{
		clicktovieworderinbookedstage.click();
	}
	public void clickontrackorderinbookedstage()
	{
		clickontrackorderinbookedstage.click();
	}
	public void clickonbackfromtrackorderinbookedsatge()
	{
		clickonbackfromtrackorderinbookedsatge.click();
	}
	public void clickonaddremarkinoutfordelivrystage()
	{
		clickonaddremarkinoutfordelivrystage.click();
	}
	public void clickonwriteremarkinoutfordeliverystge10()
	{
		clickonwriteremarkinoutfordeliverystge.click();
	}
	public void writeremarkonoutfordeliverysatge11()
	{
		writeremarkonoutfordeliverysatge.sendKeys("testing remark for outfordelivery stage");
	}
	public void clickonsavebuttoninoutfordeliverystage()
	{
		clickonsavebuttoninoutfordeliverystage.click();
	}
	public void clickondeliverdstage()
	{
		clickondeliverdstage.click();
	}
	public void vieworderindeliverdstage()
	{
		vieworderindeliverdstage.click();
	}
	public void clickontrackindeliverdstage()
	{
		clickontrackindeliverdstage.click();
	}
	
	
	
	
	

}
