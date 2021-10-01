package Data_Server;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Log_SignUP_Page_Locaters.Login_Page_Locaters;

public class DDT_Login_Test_runner 
{
	
	String Browser_Types = "chrome";
	String Test_Url = "http://mykidsbank.org/";
	
	Data_Driven_Login  Login_Page = new Data_Driven_Login();
	
	
	@BeforeMethod
	public void open_browser()
	{
		Login_Page.Browser(Browser_Types, Test_Url);
		
	}
	
	
	@Test
	public void Login_Test_Runner() throws IOException
	{
		Login_Page.Login_Page();
	}
	
	@AfterMethod
	public void close_browser()
	{
		Login_Page.driver.quit();
	}

}
