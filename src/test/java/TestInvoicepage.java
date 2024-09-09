import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Invoices.Invoices;
import Liberaryfiles.Base_class;
import Liberaryfiles.UtilityClass;
import SettingTabFromadminside.settings;

public class TestInvoicepage extends Base_class{
	
	Invoices  in;
	@BeforeClass
	public void openbrowser() throws IOException
	{
		openbrowser();
		in= new Invoices(driver);
	}

	
//	@Test(priority = 0)
//	public void login() throws IOException, InterruptedException
//	{
//		
//		in.clickonloginonhomepage();
//		in.entermail(UtilityClass.propertiesfile("UN"));
//		Thread.sleep(2000);
//		in.enterpassword(UtilityClass.propertiesfile("Pass"));
//		Thread.sleep(2000);
//		in.clickonloginbtn();
//	
//	}
//	@Test(priority = 1)
//	public void GotoInvoicetab() throws InterruptedException
//	{
//		Thread.sleep(5000);
//		in.clickoninvoicesoninvoicestab();
//		Thread.sleep(3000);
//		in.clickonfilter();
//		Thread.sleep(3000);
//		in.selectcheckboxesFor7days();
//		Thread.sleep(3000);
//		in.clicktoapplyfilter();
//		Thread.sleep(3000);
//		in.againclickonapplyfilter();
//		Thread.sleep(2000);
//		in.resetfilter();
//		Thread.sleep(3000);
//		in.clickoninvoice();
//		Thread.sleep(3000);
//		in.clicktodownloadinvoices();
//	}
	@Test
	public void check() throws IOException, InterruptedException
	{
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("hello");
		Thread.sleep(9000);
//		check.mail(UtilityClass.propertiesfile("names"));


}
}
