package stepDefinition;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import skyscannerPages.Loginpage;
import utilPackage.BaseClass;

public class LoginpageSteps extends BaseClass
{
	
//	Loginpage obj=new Loginpage(getDriver());
	Loginpage obj;
    

	public LoginpageSteps() throws IOException 
	{
		super();
		// TODO Auto-generated constructor stub
	}

	@Given("^open Chrome browser$")
	public void open_Chrome_browser() throws Throwable 
	{
		BaseClass.initialization();
	}

	@Then("^enter bookingsite URl$")
	public void enter_bookingsite_URl() throws Throwable 
	{
	    
	}

	@Then("^User logsin using Email \"([^\"]*)\" and Password \"([^\"]*)\"$")
	public void user_logsin_using_Email_and_Password(String arg1, String arg2) throws Throwable 
	{
		
		obj.signinemail(prop.getProperty("email"), prop.getProperty("Password"));
		
	}	

	@Then("^Login must be successfull$")
	public void login_must_be_successfull() throws Throwable 
	{
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    //driver.close();
		
		System.out.println("Login is sucessfully passed");
	}
	

@Then("^I click Sign in$")
public void i_click_Sign_in() throws Throwable
{
    
	obj=new Loginpage(driver);
	obj.Signinbuttonclick();
}


//invalid credential login error message
@Then("^error message should be displayed$")
public void error_message_should_be_displayed() throws Throwable 
{
    
}



	
	
	
}
