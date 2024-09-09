import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Liberaryfiles.Base_class;
import Liberaryfiles.UtilityClass;
import tipcologin.Loginpage;


public class TesttipcoLogin extends Base_class {
	
Loginpage log;
@BeforeClass

public void initialise() throws IOException
{
	openbrowser();
	log=new Loginpage(driver);
}
@Test(priority = 1)
public void Verify_to_login_with_invalidmail_and_password() throws IOException, InterruptedException
{
	Thread.sleep(4000);
	log.entermail(UtilityClass.propertiesfile("invalidmail"));
	log.entpass(UtilityClass.propertiesfile("invalidpass"));
	Thread.sleep(3000);
	log.clickbutton();
	Thread.sleep(3000);
	driver.navigate().refresh();
	
}
@Test(priority = 6)
public void verify_to_login_with_valid_mail_and_Password() throws IOException, InterruptedException
{
	Thread.sleep(5000);
	log.entermail(UtilityClass.propertiesfile("validmail"));
	log.entpass(UtilityClass.propertiesfile("validpass"));
	Thread.sleep(3000);
	log.clickbutton();
	Thread.sleep(9000);
	log.clicksbtn();
	Thread.sleep(4000);
	log.clicksuper();
}
@Test(priority = 2)
public void Verify_that_notable_to_Login_with_incorrect_password() throws InterruptedException, IOException
{
	Thread.sleep(3000);
	log.entermail(UtilityClass.propertiesfile("validmail"));
	log.entpass(UtilityClass.propertiesfile("invalidpass"));
	log.clickbutton();
	Thread.sleep(8000);
	driver.navigate().refresh();
	Thread.sleep(3000);;
}
@Test(priority = 3)
public void Verify_that_not_able_to_login_with_unregisterdmail() throws IOException, InterruptedException
{
	Thread.sleep(3000);
	log.entermail(UtilityClass.propertiesfile("unregisterdmail"));
	log.entpass(UtilityClass.propertiesfile("validpass"));
	log.clickbutton();
	Thread.sleep(8000);
	driver.navigate().refresh();
}
@Test(priority = 0)
public void Verify_to_signin_with_blank_mail_and_passwordfield() throws InterruptedException, IOException
{
	Thread.sleep(3000);
	log.clickbutton();
	Thread.sleep(3000);
	driver.navigate().refresh();
	
}
@Test(priority = 4)
public void Verify_to_login_with_validmail_and_blankpass() throws IOException, InterruptedException

{
	Thread.sleep(3000);
	log.entermail(UtilityClass.propertiesfile("validmail"));
	log.clickbutton();
	Thread.sleep(3000);
	driver.navigate().refresh();
}
@Test(priority = 5)
public void verify_to_login_with_blankmail_and_valid_password() throws InterruptedException, IOException
{
	Thread.sleep(3000);
	log.entpass(UtilityClass.propertiesfile("validpass"));
	log.clickbutton();
	Thread.sleep(3000);
	driver.navigate().refresh();
}



	
}
