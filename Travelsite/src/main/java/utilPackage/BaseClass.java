package utilPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass

{
	
	// 
	private static WebDriver driver;
	public static ChromeOptions options;
	public static Properties prop;
	
	
	 public WebDriver getDriver() 
	 {
		    return driver;
	 }
	
	  
	public BaseClass() throws IOException
	{
		prop=new Properties();
		FileInputStream fis=new FileInputStream("src\\main\\java\\config\\config.properties");
		prop.load(fis);
		
	}
	
	
	public static void initialization() 
	{
		
		
 		String browsername=prop.getProperty("browser");
		
		if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "F:\\Chromedriver 81\\chromedriver.exe");
			driver=new ChromeDriver();
			
		}
		
		else if (browsername.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "F:\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(30 , TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		//driver.quit();
		
		
	}
	
	
	

}
