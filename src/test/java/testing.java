import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Kon.Kon;
import Liberaryfiles.Base_class;

public class testing extends Base_class{
	
	
	Kon mon;
	@BeforeClass
	public void openthebrow() throws IOException
	{
		openbrowser();
		mon=new Kon(driver);
	}
	@Test
	public void clicker() throws InterruptedException
	{
		Thread.sleep(6000);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("hellodsfsdfdsf");
		Thread.sleep(6000);
		mon.btn();
	}

}
