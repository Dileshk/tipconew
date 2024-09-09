import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import Liberaryfiles.Base_class;
import Liberaryfiles.UtilityClass;
import login.login;

public class Testloginpage extends Base_class {
	
	
	
	login  check;
	
	
	@BeforeClass
	public void openbrowser1() throws IOException
	{
		openbrowser();
		check= new login(driver);
		
	}
//	@Test (priority = 2)
//	public void logintoapp() throws IOException, InterruptedException
//	{
//		
//		check.entermail(UtilityClass.propertiesfile("UN"));
//		Thread.sleep(2000);
//		check.entpass(UtilityClass.propertiesfile("Pass"));
//		Thread.sleep(2000);
//		check.loginbtn();
//		
//		Thread.sleep(7000);
//		check.clicklogout();
//		
//	}
//	//@Test (priority = 0)
//	//public void testtrackorder() throws IOException, InterruptedException
//	//{
//		//Thread.sleep(3000);
//		//check.track(UtilityClass.propertiesfile("ID"));
//		//check.submit();
//	//}
//	@Test(priority = 1)
//	public void forgetpass() throws InterruptedException, IOException
//	{
//		
//		check.log2();
//		check.forget();
//		Thread.sleep(2000);
//		check.entmailpopup(UtilityClass.propertiesfile("mail"));
//		check.clicknext();
//		Thread.sleep(2000);
//		driver.navigate().refresh();
//		
//	}
//	@Test (priority = 3)
//		public void testtrackorder() throws IOException, InterruptedException
//		{
//			Thread.sleep(3000);
//			check.track(UtilityClass.propertiesfile("ID"));
//			check.submit();
//
//		
//		}
//	
	@Test
	public void check() throws IOException, InterruptedException
	{
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("hello");
		Thread.sleep(9000);
//		check.mail(UtilityClass.propertiesfile("names"));
	check.pass(UtilityClass.propertiesfile("passd"));
//		check.click();
	}
	//scenario example
	//@test (priority=1)
	//public void login with invalid mail and password
	// @test (priority=2)
	//public void login with valid mail and password
	//@test (priority=3)
	//public void valid mail and invalid password
	
	
	
}
