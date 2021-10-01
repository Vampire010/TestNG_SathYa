package Group_Test_Case;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Log_SignUP_Page_Locaters.Login_Page_Locaters;


public class MultiBrowser_Test_Runner 
{
	String URL = "http://mykidsbank.org";
	
	Login_Page_Locaters Lp = new Login_Page_Locaters();
	
	
	@Parameters("browser_Type")
	@BeforeMethod
	public  void open_Browser(String browser_Type) throws InterruptedException
	{			 
		Lp.Browser(browser_Type, URL);
	}
	
	@Test
	public  void Login_Page_Tests() throws IOException 
	{
		Lp.Login_Page();
		
	}
	
	@AfterMethod
	public  void close_browser()
	{
		 Lp.driver.quit();		
	}

}
