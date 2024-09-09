import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Liberaryfiles.Base_class;
import Liberaryfiles.UtilityClass;
import SupportPage.Supportpage;

public class SupportPagetesting extends Base_class{
	Supportpage support;
	@BeforeClass
	public void openbrowser1() throws IOException, InterruptedException
	{
		openbrowser();
		support= new Supportpage(driver);
		Thread.sleep(3000);
	}
	@Test(priority = 0)
	public void login() throws IOException, InterruptedException
	{
		Thread.sleep(6000);
		support.clickonloginbtnonhomepage();;
		support.entermail(UtilityClass.propertiesfile("UN"));
		support.enterpass(UtilityClass.propertiesfile("Pass"));
		support.clicktosignin();
	
	}
	@Test(priority = 1)
	public void supportpage() throws InterruptedException
	{
		Thread.sleep(13000);
		support.clickonsupporttab();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[text()='Accounting']")).click();
		
	}

}
