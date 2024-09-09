import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.internal.selenesedriver.SendKeys;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Liberaryfiles.Base_class;
import Liberaryfiles.UtilityClass;
import OrderPage.CheckallfunctionalityofOrderPage;
import SettingTabFromadminside.settings;

public class SettingsTabFromAdminSide extends Base_class{
	settings set;
	@BeforeClass
	public void openbrowser1() throws IOException
	{
		openbrowser();
		set= new settings(driver);
		
	}
	@Test(priority = 0)
	public void login() throws IOException, InterruptedException
	{
		Thread.sleep(9000);
		set.logclick();
		set.entmail(UtilityClass.propertiesfile("UN"));
		set.entpass(UtilityClass.propertiesfile("Pass"));
		set.loginbtn();
		Thread.sleep(9000);
	}
		@Test(priority = 1)
		public void testsetting() throws InterruptedException
		{
			
		Thread.sleep(8000);
		set.clickonsettingtab();
		Thread.sleep(3000);
		set.clickonempolyeetab();
		Thread.sleep(3000);
		set.addemployeetab();
		Thread.sleep(2000);
		set.enternameofemployee();
		Thread.sleep(2000);
		set.enterphonenumberofemployee();
		Thread.sleep(2000);
		set.entermailofemployee();
		Thread.sleep(2000);
		set.enterpassword();
		Thread.sleep(2000);
		set.enterandconformpassword();
		Thread.sleep(2000);
		WebElement fromdate = driver.findElement(By.xpath("//input[@placeholder='From date']"));
		fromdate.click();
		Thread.sleep(2000);
		
		fromdate.sendKeys("30");
		fromdate.sendKeys("10");
		fromdate.sendKeys("2023");
		Thread.sleep(5000);
		WebElement todate = driver.findElement(By.xpath("//input[@placeholder='To date']"));
		todate.click();
		todate.sendKeys("11");
		todate.sendKeys("11");
		todate.sendKeys("2023");
		set.clickoncategorie();
		Thread.sleep(4000);
		set.selectemployeeincategorie();
		Thread.sleep(2000);
		set.clickonpermission();
		Thread.sleep(2000);
		set.clicksavebuttonofemployee();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Back']")).click();
		Thread.sleep(3000);
	driver.findElement(By.xpath("//h3[text()='User Profile']")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//button[text()='Back']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//h3[text()='Setting']")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//button[@class='backbtn']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//h3[text()='Categories']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[text()='+ Add Category ']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@placeholder='Category Name']")).sendKeys("testcategorie");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//button[@class='btn save-btn']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[text()=' Back ']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//h3[text()='Delivery Boy']")).click();
	Thread.sleep(3000);
	//driver.findElement(By.xpath("//button[text()='+ Add Delivery Boy']"));
	//Thread.sleep(3000);
	//driver.findElement(By.xpath("//input[@placeholder='Enter Name']")).sendKeys("testdemo");
	//Thread.sleep(3000);
	//driver.findElement(By.xpath("//input[@class='form-control ']")).sendKeys("1122334455");
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("lmn@yopmail.com");
	//Thread.sleep(3000);
	//driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Demo@123");
//	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[text()='Back']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//h3[text()='Add Delivery Partner']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[text()='+ Add Delivery Partner']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@placeholder='Enter Partner Name']")).sendKeys("Test1122");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@placeholder='Enter POC']")).sendKeys("85747488458FF");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[text()='Save']")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//button[text()='Back']")).click();
	
		
	

	
		}
	
	}

