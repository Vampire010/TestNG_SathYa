package Test_Runner;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Log_SignUP_Page_Locaters.Login_Page_Locaters;

public class KB_Login_Test 
{
	
	String Browser_Types = "chrome";
	String Test_Url = "http://mykidsbank.org/";
	
	Login_Page_Locaters  Login_Page = new Login_Page_Locaters();
	
	
	@BeforeMethod
	public void open_browser()
	{
		Login_Page.Browser(Browser_Types, Test_Url);
		
	}
	
	
	@Test
	public void Login_Test_Runner()
	{
		Login_Page.Login_Page();
	}
	
	@AfterMethod
	public void close_browser()
	{
		Login_Page.driver.quit();
	}
	

}
