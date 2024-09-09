import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Dashboardpage.Checkallfunctionalityofdashboard;
import Liberaryfiles.Base_class;
import Liberaryfiles.UtilityClass;
import login.login;

public class TestDashboardpagefunctionality extends Base_class {
	
	Checkallfunctionalityofdashboard dash;
	
	@BeforeClass
	public void openbrowser1() throws IOException
	{
		openbrowser();
		dash= new Checkallfunctionalityofdashboard(driver);
		
	}
	@Test(priority = 0)
	public void login() throws IOException, InterruptedException
	{
		Thread.sleep(6000);
		dash.clickloginonhome();
		dash.entermail(UtilityClass.propertiesfile("UN"));
		dash.enterpass(UtilityClass.propertiesfile("Pass"));
		dash.clickloginbtn();
		
	}
	@Test(priority = 1)
	public void trackorderonDashboard() throws InterruptedException, IOException
	{
		Thread.sleep(6000);
		dash.entordernum(UtilityClass.propertiesfile("ordernum"));
		dash.clicktrackbtn();
		Thread.sleep(7000);
		dash.clickbackbtn();
		
	}
	
	@Test(priority = 2)
	public void filterfunctionalityofDashboard() throws InterruptedException
	{
		Thread.sleep(5000);
		dash.clickfilt();
		Thread.sleep(4000);
		dash.clicklast7days();
		dash.clicktoapply();
	}

}
