

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.v114.fedcm.model.LoginState;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.model.Report;
import com.aventstack.extentreports.model.ReportStats;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.util.Assert;
import com.relevantcodes.extentreports.LogStatus;

public class Extentreportersample2 {

	ChromeDriver driver;
    ExtentReports extentReports;
    ExtentSparkReporter sparkReporter;
    ExtentTest test;

    @BeforeClass
    public void setUp() throws InterruptedException {
        // Set up WebDriver
        ChromeOptions op = new ChromeOptions();
        op.addArguments("--remote-allow-origins=*");
      driver = new ChromeDriver(op);
        
        
        // Set up ExtentReports and attach reporter
        sparkReporter = new ExtentSparkReporter("C:\\Users\\Extern Labs\\eclipse-workspace\\NX0000007"+"extentreport");
        extentReports = new ExtentReports();
        extentReports.attachReporter(sparkReporter);

      // Create a test in the report
        test = extentReports.createTest("Sample Test");
        Thread.sleep(4000);
      
    }
    @BeforeMethod
    public void man() {
    	driver.get("https://www.facebook.com/");
    }
    
    @Test
    public void openbrowserandurl()
    {
    	
    	test=extentReports.createTest("launch browser and open url");
        org.testng.Assert.assertEquals(12, 13);    
    
    	
    	
    	//  driver.get("https://www.facebook.com/");
       // test.info("Starting test case1");
       // driver.get("facebook.com");
        //test.fail("Navigated to Google");
    	
        
    }
    @Test
    public void testing()
    {
    	test.log(LogStatus.INFO,"Test get started");
    	
    	driver.findElement(By.xpath("//button[text()='Log in']")).click();
    	
    }
    

   // @Test
//    public void testGoogleSearch() {
//        // Start the test
//        test.info("Starting test case");
//
//        // Navigate to Google
//        driver.get("https://www.google.com");
//        test.pass("Navigated to Google");
//
//        // Perform actions and assertions
//        // Example: Search for a term
//        // WebElement searchBox = driver.findElement(By.name("q"));
//        // searchBox.sendKeys("Selenium");
//        // searchBox.submit();
//        // test.pass("Performed Google search");
//
//        // Add screenshots or logs if necessary
//        // test.addScreenCaptureFromPath("path/to/screenshot.png");
//
//        // More test steps...
    

    @AfterClass
    public void tearDown() throws InterruptedException {
        // Close the browser
    	Thread.sleep(40000);
        driver.quit();
        extentReports.flush();

     

}
}
