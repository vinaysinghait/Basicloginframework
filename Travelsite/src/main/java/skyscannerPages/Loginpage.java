package skyscannerPages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilPackage.BaseClass;



public class Loginpage 
{

	WebDriver driver;
//public Loginpage() throws IOException {
//		super();
//		// TODO Auto-generated constructor stub
//	}



//@FindBy (xpath="//*[@id=\\\"get_sign_in\\\"]")
@FindBy (xpath="//*[@id='get_sign_in']")
WebElement Loginbutton;

@FindBy (xpath="//*[@id='roundTrip']")
WebElement roundtripbutton;


public Loginpage(WebDriver driver)
{
    this.driver=driver;
    PageFactory.initElements(driver, this);
//	PageFactory.initElements(driver, Loginpage.class);
}

//"//*[@label=\"login-button\"]")

public void loginbuttonclick() throws InterruptedException
{
	Thread.sleep(2000);
	System.out.println("In POM");
	Loginbutton.click();
	//driver.findElement(By.xpath("//*[@label=\"login-button\"]")).click();
	//*[@id="login-button-nav-item"]/button
	//*[@id="get_sign_in"]
	//*[@id="login-button-nav-item"]/button
	//driver.findElement(By.xpath("//*[@id=\"get_sign_in\"]")).click();  //goibibo
	
}


public void roundtripbuttonclick() throws InterruptedException
{
	Thread.sleep(2000);
	System.out.println("heIn POM");
	//Loginbroundtripbuttonutton.click();
	//driver.findElement(By.xpath("//*[@label=\"login-button\"]")).click();
	//*[@id="login-button-nav-item"]/button
	//*[@id="get_sign_in"]
	//*[@id="login-button-nav-item"]/button
	//driver.findElement(By.xpath("//*[@id=\"get_sign_in\"]")).click();  //goibibo
	
}





}
