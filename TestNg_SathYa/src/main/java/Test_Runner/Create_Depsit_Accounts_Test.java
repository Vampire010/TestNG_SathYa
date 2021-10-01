package Test_Runner;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Create_Dpst_Acnt.Create_Deposit_Accounts;

public class Create_Depsit_Accounts_Test 
{
	String Browser_Types = "chrome";
	String Test_url ="http://mykidsbank.org/";
	
	Create_Deposit_Accounts CDA = new Create_Deposit_Accounts();
	

	@BeforeMethod
	public void open_browser() throws IOException
	{
		CDA.Browser(Browser_Types, Test_url);
		CDA.Login_Page();
		
	}
	
	@Test
	public void Create_Deposit_Accounts_Test_Runner()
	{
		CDA.Create_New_Deposit_Account();
	}
	
	
	
	
	@AfterMethod
	public void close_browser()
	{
		CDA.driver.quit();
	}
	
	

}
