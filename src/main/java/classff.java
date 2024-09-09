import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class classff {
	public static void main(String[] args) {
		ChromeOptions op= new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		ChromeDriver driver= new ChromeDriver(op);
		driver.get("https://www.canva.com/search?q=flow+diagram");
		
	}

}
