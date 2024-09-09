import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class tipco {
	public static void main(String[] args) {
		
		
		ChromeOptions op=new ChromeOptions();
		ChromeDriver driver=new ChromeDriver(op);
		driver.get("http://tipco-engineering.s3-website.ap-south-1.amazonaws.com/");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("superadmin@gmail.com");
	}

}
