import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class harbor {
public static void main(String[] args) throws InterruptedException {
	ChromeOptions op = new ChromeOptions();
	op.addArguments("--remote-allow-origins=*");
	ChromeDriver driver= new ChromeDriver(op);
	driver.get("http://restaurant-frontend.s3-website.ap-south-1.amazonaws.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement username = driver.findElement(By.xpath("//input[@name='email_or_phone']"));
	username.sendKeys("basic@yopmail.com");
	WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
	Thread.sleep(4000);
	password.sendKeys("12345678");
	WebElement signinbtn = driver.findElement(By.xpath("//button[text()='Sign In']"));
	signinbtn.click();
}
}
