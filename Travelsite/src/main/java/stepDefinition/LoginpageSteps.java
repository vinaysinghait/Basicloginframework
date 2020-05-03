package stepDefinition;

import java.io.IOException;

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

	@Then("^enter Skyscanner URl$")
	public void enter_Skyscanner_URl() throws Throwable 
	{
	    
	}

	@Then("^User logsin using Email \"([^\"]*)\" and Password \"([^\"]*)\"$")
	public void user_logsin_using_Email_and_Password(String arg1, String arg2) throws Throwable 
	{
		
		//driver.findElement(By.xpath("//*[@id=\"get_sign_in\"]")).click();
		//obj=new Loginpage(getDriver());
		obj=new Loginpage(getDriver());
		obj.loginbuttonclick();
	}	

	@Then("^Login must be successfull$")
	public void login_must_be_successfull() throws Throwable 
	{
	    
	}
	

@Then("^I click Sign in$")
public void i_click_Sign_in() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	obj=new Loginpage(getDriver());
	obj.loginbuttonclick();
}


	
	
	
}
