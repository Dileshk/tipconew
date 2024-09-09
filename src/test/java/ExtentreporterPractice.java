import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentreporterPractice {
	ExtentSparkReporter htmlreporter;
	ExtentReports reports;
	ExtentTest test;
	
	@BeforeTest
	
	public void startreport()
	{
		htmlreporter= new ExtentSparkReporter("Extent Reporter Demo.html");
		reports= new ExtentReports();
		reports.attachReporter(htmlreporter);
		
		// add enviornment details 
		reports.setSystemInfo("Machine","testpc1");
		reports.setSystemInfo("OS", "Window");
		reports.setSystemInfo("user", "chirag");
		reports.setSystemInfo("Browser", "chrome");
	
		// add config to change look and feel
		
		htmlreporter.config().setDocumentTitle("Extent report Demo");
		htmlreporter.config().setReportName("test report");
		htmlreporter.config().setTheme(Theme.STANDARD);
		htmlreporter.config().setTimeStampFormat("yy,mm,dd,hh:mm a");
	}
		
         @Test
         
         public void launchbrowser()
         {
        	 
        	 ChromeOptions op= new ChromeOptions();
        	 op.addArguments("--remote-allow-origins=*");
        	 ChromeDriver driver= new ChromeDriver(op);
        	 driver.get("https://www.facebook.com/");
         
         
      
		
		
		
	}

}
