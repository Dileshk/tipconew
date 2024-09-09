import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.mongodb.util.Util;

import Liberaryfiles.Base_class;
import Liberaryfiles.UtilityClass;
import wan.ban;

public class van extends Base_class{
	
	ban n;
	@BeforeClass
	public void gego() throws IOException
	{
		openbrowser();
		n= new ban(driver);
	}
//	@Test
//	public void lelo() throws InterruptedException
//	{
//		Thread.sleep(4000);
//		n.mustang();
//		Thread.sleep(4000);
//		driver.close();
//	}
//	@Test
//	public void click() throws InterruptedException
//	{
//		Thread.sleep(5000);
//		n.nun();
//	}
	@Test(priority = 1)
	public void mm() throws IOException, InterruptedException
	{
		Thread.sleep(8000);
		n.enteremail(UtilityClass.propertiesfile("cc"));
		
		n.enterpass(UtilityClass.propertiesfile("mm"));
		Thread.sleep(3000);
		//driver.close();
		driver.navigate().refresh();
		
	}
	@Test(priority = 2)
	public void hola() throws IOException, InterruptedException
	{
		
		Thread.sleep(7000);
		n.enteremail(UtilityClass.propertiesfile("nn"));
		n.enterpass(UtilityClass.propertiesfile("ff"));
		
	}
	
	

}
