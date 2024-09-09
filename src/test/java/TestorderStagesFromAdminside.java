import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Liberaryfiles.Base_class;
import Liberaryfiles.UtilityClass;
import OrderPage.Orderstagesfromadminside;
import action.Click;
import action.Select;

public class TestorderStagesFromAdminside extends Base_class {
	
	Orderstagesfromadminside stages;
	
	
	@BeforeClass
	public void loginfromadmin() throws IOException
	{
		openbrowser();
		stages = new Orderstagesfromadminside(driver);
	}
	@Test(priority = 1)
	public void Adminenter() throws IOException, InterruptedException
	{
		Thread.sleep(3000);
		stages.clickonloginbtn();
		stages.entermail(UtilityClass.propertiesfile("UN"));
		Thread.sleep(4000);
		stages.entpass(UtilityClass.propertiesfile("Pass"));
		stages.loginbtn();
		Thread.sleep(5000);
	}
	@Test(priority = 2)
	public void Assingetodeliveryboy() throws InterruptedException, IOException
	{
		Thread.sleep(8000);
		stages.clickonorderbtn();
		Thread.sleep(4000);
		stages.clickondeliveryboylist();
		Thread.sleep(2000);
		//stages.pickupddeliveryboyname();
		WebElement ss = driver.findElement(By.xpath("//select[@class='form-select']"));
	
	    org.openqa.selenium.support.ui.Select obj= new org.openqa.selenium.support.ui.Select(ss);
	    Thread.sleep(2000);
	    obj.selectByValue("4,sravani@gmail.com,sravani");
	    Thread.sleep(2000);
	    stages.clickonconfirm();
	    Thread.sleep(2000);
	    stages.gotoreadytopickupstage();
	    Thread.sleep(3000);
	}
	    @Test(priority = 3)
	    public void readytopickupstage() throws InterruptedException
	    {
	   stages.clickonordernumandview();
	   Thread.sleep(3000);
	   // stages.addremarkfororder();
	   // Thread.sleep(4000);
	   // stages.clickonremarktextbox();
	   // Thread.sleep(3000);
	   // stages.writeremark();
	   // Thread.sleep(4000);
	   // stages.clickonsave();
	  //  Thread.sleep(2000);
	   // stages.clickonremarkandsee();
	  //  Thread.sleep(2000);
	   // stages.clicktoclose();
	    Thread.sleep(3000);
	    
	    stages.clicktotrack();
	    Thread.sleep(3000);
	    stages.clickonbackfromordertrackpage();
	    Thread.sleep(3000);
	  WebElement action = driver.findElement(By.xpath("//button[text()='Action']"));
	 WebElement invoice = driver.findElement(By.xpath("//li[text()='Download Invoice']"));
	 WebElement label = driver.findElement(By.xpath("//li[text()='Download Label']"));
	   Actions act= new Actions(driver);
	   Thread.sleep(3000);
	    act.moveToElement(action).click().perform();
	    Thread.sleep(4000);
	    act.moveToElement(invoice).click().perform();
	    Thread.sleep(4000);
	    act.moveToElement(action).click().perform();
	    Thread.sleep(4000);
	    act.moveToElement(label).click().perform();
		Thread.sleep(5000);
		stages.clickonbackfromreadyTopickupview();
		Thread.sleep(5000);
		stages.clickonfilterbtn();
		 Thread.sleep(2000);
		stages.clickondomesticcheckbox();
		 Thread.sleep(2000);
		stages.clickonprepaid();
		 Thread.sleep(2000);
		stages.listofdeliverboy();
		 Thread.sleep(2000);
		stages.selectdeliveryboyfromlist();
		 Thread.sleep(2000);
		stages.B2Bcheckbox();
		 Thread.sleep(2000);
		stages.clickonapplyfilter();
		 Thread.sleep(4000);
		 stages.clickonfilterbuttonforreset();
		 Thread.sleep(3000);
		 stages.clickonresetbutton();
		 //stages.clickondownloadcsvfile();
		// Thread.sleep(3000);
		// stages.ordermovefromreadytopickuptopickdup();
		// Thread.sleep(3000);
		// stages.gotopickuppage();
		// Thread.sleep(3000);
		//? stages.clickonvieworderinPickupstage();
		//
		// stages.backfromtrackorder();
		// Thread.sleep(3000);
		// stages.clickonaddremarkinpickup();
		// Thread.sleep(3000);
		// stages.clickontextboxofremark();
		// Thread.sleep(2000);
		// stages.writeonremarkbox();
		// Thread.sleep(3000);
		// stages.clickonsavebtn();
		// Thread.sleep(5000);
		// driver.findElement(By.xpath("//button[@class='btn back-btn']")).click();
		//Thread.sleep(2000);
		// stages.clickonfilterbtn();
		// Thread.sleep(2000);
		//stages.clickondomesticcheckbox();
		// Thread.sleep(2000);
		//stages.clickonprepaid();
		// Thread.sleep(2000);
		//stages.listofdeliverboy();
		// Thread.sleep(2000);
		//stages.selectdeliveryboyfromlist();
		// Thread.sleep(2000);
		//stages.B2Bcheckbox();
		// Thread.sleep(2000);
		//stages.clickonapplyfilter();
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("//button[text()='Recieved At Hub']")).click();
		
		//driver.findElement(By.xpath("(//div[@class='action-btngroup'])[2]")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//button[@id='pickup-tab']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"readyforpickup-tab-pane\"]/table/tr[2]/td[1]/b")).click();
		Thread.sleep(4000);
		stages.clickonaddremarkinpickup();
		 Thread.sleep(3000);
		 stages.clickontextboxofremark();
		 Thread.sleep(2000);
		 stages.writeonremarkbox();
		 Thread.sleep(3000);
		 stages.clickonsavebtn();
		 Thread.sleep(5000);
		stages.trackorderfrompickuppage();
		Thread.sleep(4000);
		 stages.backfromtrackorder();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[3]/div[1]/div/button")).click();
		 stages.clickonfilterbtn();
			 Thread.sleep(2000);
			stages.clickondomesticcheckbox();
			 Thread.sleep(2000);
			stages.clickonprepaid();
			 Thread.sleep(2000);
			stages.listofdeliverboy();
			 Thread.sleep(2000);
			stages.selectdeliveryboyfromlist();
			 Thread.sleep(2000);
			stages.B2Bcheckbox();
			 Thread.sleep(2000);
			stages.clickonapplyfilter();
			Thread.sleep(3000);
			stages.clickonfilterbtn();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@value='Reset']")).click();
		 
		// #//*[@id="pickup-tab-pane"]/table/tr[2]/td[1]/b
		// #//*[@id="pickup-tab-pane"]/table/tr[3]/td[1]/b
			Thread.sleep(5000);
			stages.clickonrecievedAthubstage();
			Thread.sleep(3000);
			 // WebElement scroll = driver.findElement(By.xpath("//th[text()=' Order Id ']"));
			 //  JavascriptExecutor js = (JavascriptExecutor)driver;
			 // js.executeScript("window.scrollBy(250,0)", "");
		    stages.viewOrderinrecivedAthubsatage(); 
			Thread.sleep(5000);
			stages.clickonaddremarkrecivedathubstage();
			Thread.sleep(3000);
			stages.clickontextboxOfrecivedathubstage();
			Thread.sleep(3000);
			stages.writeonremarkboxinrecivedathubstage();
			Thread.sleep(3000);
			stages.clickonsaveofremarkinrecivedathubstage();
			
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[text()='Track']")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//button[text()='Back']")).click();
		     Thread.sleep(4000);
		   WebElement backrec = driver.findElement(By.xpath("//button[@type='button']"));
		   //  stages.clickbackfromrecivedathubstageh();
		   Actions bb= new Actions(driver);
		    Thread.sleep(6000);
		    bb.moveToElement(backrec).click().build().perform();
		    ////////////////same xpaths
		    Thread.sleep(3000);
		    stages.clickonbookedaction();
		    stages.clicktoselectdeliverypartner();
		    Thread.sleep(3000);
		  WebElement delpar = driver.findElement(By.xpath("(//div[@class=' css-19bb58m'])[2]"));
		    Actions list= new Actions(driver);
		    Thread.sleep(3000);
		    list.moveToElement(delpar).click().build().perform();
		    Thread.sleep(3000);
		    list.sendKeys("demo").perform();
		    Thread.sleep(2000);
		    list.sendKeys(Keys.ENTER).perform();
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//input[@placeholder='AWB No.']")).sendKeys("123456789");
		   WebElement date = driver.findElement(By.xpath("//input[@type='date']"));
		   date.click();
		   
		   date.sendKeys("27");
		   
		   date.sendKeys("12");
		   
		   date.sendKeys("2023");
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//button[text()='Save']")).click();
		   Thread.sleep(10000);
		  // stages.vieworderinbookedstage();
		 //  Thread.sleep(5000);
		   stages.clicktovieworderinbookedstage();
		   Thread.sleep(3000);    //?
		   stages.clickontrackorderinbookedstage();
		   Thread.sleep(3000);
		   stages.clickonbackfromtrackorderinbookedsatge();
		 WebElement moveonaction = driver.findElement(By.xpath("//button[text()='Action']"));
		 Thread.sleep(4000);
		   Actions editorder= new Actions(driver);
		  
		   editorder.moveToElement(moveonaction).perform();
		   driver.findElement(By.xpath("//li[text()='Edit Order']")).click();
		   
		   Thread.sleep(6000);
		 //  driver.findElement(By.xpath("//input[@class='form-control ']")).clear();
		  // Thread.sleep(3000);
		   driver.findElement(By.xpath("//input[@class='form-control ']")).sendKeys("00");
		   Thread.sleep(4000);
		WebElement update = driver.findElement(By.xpath("//button[text()='Update']"));
	    Actions orderupdate= new Actions(driver);
	    orderupdate.moveToElement(update).click().perform();
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("//button[text()='Back']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//button[text()='In-Transit'])[2]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//button[@id='transit-tab']")).click();
	    Thread.sleep(4000);
		   driver.findElement(By.xpath("//*[@id=\"transit-tab-pane\"]/table/tr[2]/td[1]/b")).click();
		   Thread.sleep(3000);
		   driver.findElement(By.xpath("//button[text()='Track']")).click();
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//button[text()='Back']")).click();
		 Thread.sleep(3000);
		WebElement actio = driver.findElement(By.xpath("//button[text()='Action']"));
		 Actions inransit=new Actions(driver);
		 inransit.moveToElement(actio).click().perform();
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//li[text()='Download Invoice']")).click();
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//li[text()='Download Label']")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//button[text()='Back']")).click();
		 Thread.sleep(5000);
		 
		 driver.findElement(By.xpath("(//img[@alt='img'])[6]")).click();
		 Thread.sleep(3000);
		WebElement calender = driver.findElement(By.xpath("//input[@type='date']"));
		calender.click();
		calender.sendKeys("27");
		calender.sendKeys("11");
		calender.sendKeys("2023");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Enter Location']")).sendKeys("mumbai");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//textarea[@placeholder='Add the Remark']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//textarea[@placeholder='Add the Remark']")).sendKeys("order in intransit state");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Confirm']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[text()='Out For Delivery']")).click();
		 Thread.sleep(4000);
		 driver.findElement(By.xpath("//button[text()='Out For Delivery']")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//button[@id='outfordelivery-tab']")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//*[@id=\"outfordelivery-tab-pane\"]/table/tr[2]/td[1]/b")).click();
		 Thread.sleep(3000);
		 stages.clickonaddremarkinoutfordelivrystage();
		 Thread.sleep(3000);
		 stages.clickonwriteremarkinoutfordeliverystge10();
		 Thread.sleep(3000);
		 stages.writeremarkonoutfordeliverysatge11();
		 Thread.sleep(3000);
		 stages.clickonsavebuttoninoutfordeliverystage();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//button[text()='Track']")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//button[text()='Back']")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//button[text()='Back']")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//select[@type='button']")).click();
		 Thread.sleep(3000);
		// driver.findElement(By.xpath("(//img[@alt='img'])[13]")).click();
		// Thread.sleep(3000);
		// driver.findElement(By.xpath("//option[@value='DELIVERED']")).click();
		 driver.findElement(By.xpath("(//img[@alt='img'])[6]")).click();
		 Thread.sleep(3000);
		WebElement calender11 = driver.findElement(By.xpath("//input[@type='date']"));
		calender11.click();
		calender11.sendKeys("27");
		calender11.sendKeys("11");
		calender11.sendKeys("2023");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Enter Location']")).sendKeys("nagpur");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//textarea[@placeholder='Add the Remark']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//textarea[@placeholder='Add the Remark']")).sendKeys("order in outfordelivery state");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Confirm']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//select[@type='button']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//option[@value='DELIVERED']")).click();
		Thread.sleep(5000);
		stages.clickondeliverdstage();
		Thread.sleep(3000);
		stages.vieworderindeliverdstage();
		Thread.sleep(4000);
		stages.clickontrackindeliverdstage();
		Thread.sleep(3000);
	driver.findElement(By.xpath("//button[text()='Back']")).click();
	Thread.sleep(3000);
	//driver.findElement(By.xpath("//button[text()='Back']")).click();
		
	driver.findElement(By.xpath("//button[text()='Add Remark']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//textarea[@placeholder='Write Here....']")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//textarea[@placeholder='Write Here....']")).sendKeys("order in deliverd stage");
	Thread.sleep(4000);
	driver.findElement(By.xpath("//button[text()='Save']")).click();
	Thread.sleep(3000);
	WebElement deliverd = driver.findElement(By.xpath("//button[text()='Action']"));
     Actions delstage= new Actions(driver);
     delstage.moveToElement(deliverd).click().perform();
     Thread.sleep(3000);
     driver.findElement(By.xpath("//li[text()='Download Invoice']")).click();
     Thread.sleep(3000);
     driver.findElement(By.xpath("//li[text()='Download Label']")).click();
     Thread.sleep(4000);
     driver.findElement(By.xpath("//li[text()='Call Buyer']")).click();
     Thread.sleep(3000);
     driver.findElement(By.xpath("//button[@class='close-btn']")).click();
     Thread.sleep(3000);
     driver.findElement(By.xpath("//button[text()='Back']")).click();
     Thread.sleep(3000);
     
   //  driver.findElement(By.xpath("//button[@id='returns-tab']")).click();     //rto stage button (use by move )
   //  driver.findElement(By.xpath("//*[@id=\"returns-tab-pane\"]/table/tr[2]/td[1]/b")).click();  //view order in rto stage    
   //  driver.findElement(By.xpath("//button[text()='Track']")).click();             //click on track
   //  driver.findElement(By.xpath("//button[text()='Back']")).click();  click on back from trac order in rto stage
   //  driver.findElement(By.xpath("//button[text()='Back']")).click();  click back from rto stage order view 
   //  WebElement value = driver.findElement(By.xpath("//button[text()='Action']"));
   //  Actions rto= new Actions(driver);
   //   rto.moveToElement(value).click().perform();                                      //click on action and perform 
     
     
     
		
	}
	

}
