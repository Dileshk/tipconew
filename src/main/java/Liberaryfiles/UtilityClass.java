package Liberaryfiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.internal.selenesedriver.TakeScreenshot;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass {
	
	public static String getdata(int rowindex , int cellindex) throws InvalidFormatException, IOException
	{
		FileInputStream file= new FileInputStream("C:\\Users\\Extern Labs\\eclipse-workspace\\NX0000007\\Testdata\\Book 5.xlsx");
	    Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		String value = sh.getRow(rowindex).getCell(cellindex).getStringCellValue();
		return value;
		
		
	}
	public static void ss1(WebDriver driver,int TCID) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest= new File("C:\\Users\\Extern Labs\\eclipse-workspace\\NX0000007\\FailedTCscreenshot\\shot1"+TCID+".jpg");
        FileHandler.copy(src, dest);
		
	}
	
	public static String propertiesfile(String key) throws IOException
	{
		FileInputStream file= new FileInputStream("C:\\Users\\Extern Labs\\eclipse-workspace\\NX0000007\\credential.properties");
		Properties p= new Properties();
		p.load(file);
		String value = p.getProperty(key);
		return value;
		
	}

}
