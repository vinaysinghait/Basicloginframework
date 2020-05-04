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


@FindBy (xpath="(//*[@class=\"sign_in_wrapper\"])[2]")
WebElement Signinbutton;

@FindBy(xpath="//*[@id=\"username\"]")
WebElement emailid;

@FindBy(xpath="//*[@class=\"bui-button__text\"]")
WebElement Nextbutton;

@FindBy(xpath="//*[@id=\"password\"]")
WebElement Passwordfield;


@FindBy(xpath="//*[@type=\"submit\"]")
WebElement Submit;



public Loginpage(WebDriver driver)
{
    this.driver=driver;
    PageFactory.initElements(driver, this);
//	PageFactory.initElements(driver, Loginpage.class);
}


public void Signinbuttonclick() throws InterruptedException
{
	Thread.sleep(2000);
	
	Signinbutton.click();
		
}


public void signinemail(CharSequence email, CharSequence Password)
{
   emailid.sendKeys(email);
   Nextbutton.click();
   Passwordfield.sendKeys(Password);
   Submit.click();
}






}
