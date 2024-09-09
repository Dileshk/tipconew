import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Liberaryfiles.Base_class;
import Liberaryfiles.UtilityClass;
import OrderPage.CheckallfunctionalityofOrderPage;


public class Testcaseforcreateorder  extends Base_class{
	
	CheckallfunctionalityofOrderPage order;
	
	@BeforeClass
	public void openbrowser1() throws IOException
	{
		openbrowser();
		order= new CheckallfunctionalityofOrderPage(driver);
		
	}
	@Test(priority = 0)
	public void login() throws IOException, InterruptedException
	{
		Thread.sleep(9000);
		order.logclickbtn();
		order.entermail(UtilityClass.propertiesfile("UN"));
		order.enterpass(UtilityClass.propertiesfile("Pass"));
		Thread.sleep(5000);
		order.clickloginbtn();
		Thread.sleep(5000);
	}
	@Test(priority = 1)
	public void createorderandDeliverd() throws IOException, InterruptedException
	{
		Thread.sleep(9000);
		order.clickonorderbtn();
		Thread.sleep(5000);
		order.clickoncreateorder();
		Thread.sleep(4000);
		order.enterB2Bcompanyname(UtilityClass.propertiesfile("b2bcompanyname"));
		Thread.sleep(4000);
		order.selectcompanyname();
		order.enternameofb2b(UtilityClass.propertiesfile("b2bname"));
		order.entphonenumOfb2b(UtilityClass.propertiesfile("phonenumofb2b"));
		order.enterpincodeOfB2B(UtilityClass.propertiesfile("pinofb2b"));
		Thread.sleep(3000);
		order.enteraddressofb2b(UtilityClass.propertiesfile("adressofb2b"));
		//order.entercitynameOfb2b(UtilityClass.propertiesfile("cityofb2b"));
		//order.enterstateOfb2b(UtilityClass.propertiesfile("stateofb2b"));
		order.enternameofrecivier(UtilityClass.propertiesfile("nameofrec"));
		order.enternumberOfreciver(UtilityClass.propertiesfile("numofrec"));
		order.enterpincodOfreciver(UtilityClass.propertiesfile("pinofrec"));
		order.enteraddressOfreciver(UtilityClass.propertiesfile("addressofrec"));
		//order.entercitynameOfreciver(UtilityClass.propertiesfile("cityofrec"));
		//order.enterstateofrec(UtilityClass.propertiesfile("stateofrec"));
		Thread.sleep(4000);
		order.clickonordertype();
		Thread.sleep(2000);
		order.selectprepaid();
		Thread.sleep(3000);
		order.clicktonext();
		order.enterweight(UtilityClass.propertiesfile("wt"));
		order.enterlength(UtilityClass.propertiesfile("L"));
		order.enterbreadth(UtilityClass.propertiesfile("B"));
		order.enterheight(UtilityClass.propertiesfile("H"));
		order.clickondeliverytype();
		order.clickonsamedaydelivery();
		  WebElement date = driver.findElement(By.xpath("//input[@type='date']"));
		   date.click();
		   date.sendKeys("15");
		   date.sendKeys("12");
		   date.sendKeys("2023");
		   order.selectpkgtype();
		   order.selectenvelop();
		   order.enterproductprice(UtilityClass.propertiesfile("productprice"));
		   Thread.sleep(3000);
		   order.producttype();
		   Thread.sleep(2000);
		   order.selectproduct();
		   Thread.sleep(3000);
		   order.entquantity(UtilityClass.propertiesfile("quantity"));
		   order.Addtag(UtilityClass.propertiesfile("ordertag")); 
		   Thread.sleep(2000);
		   order.clicknextpageofwt();
		   Thread.sleep(2000);
		   order.clickonproceedtopay();
		   Thread.sleep(2000);
		   order.clickonwalletbalance();
		   Thread.sleep(3000);
		   order.clickoncontinue();
		   Thread.sleep(3000);
		   driver.findElement(By.xpath("//a[@class=' active active']")).click();
		   
		 
		  
		   
		   
	}
	

}
