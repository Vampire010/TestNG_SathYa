package Group_Test_Case;

import java.io.IOException;

import org.testng.annotations.Test;

import Test_Runner.Create_Depsit_Accounts_Test;
import Test_Runner.KB_Login_Test;

public class Group_Test_Runner 
{
	
	Create_Depsit_Accounts_Test CDA = new Create_Depsit_Accounts_Test();
	KB_Login_Test kbl = new KB_Login_Test();
	

	@Test(groups = {"Smoke_Test_Case"} ,priority = 3 ,  enabled = false)
	public void Test1() throws IOException
	{
		CDA.open_browser();
		CDA.Create_Deposit_Accounts_Test_Runner();
		CDA.close_browser();
	}
	
	@Test(groups = {"Functional_Test_Case"}, priority = 2 , dependsOnMethods ="Test3")
	public void Test2() throws IOException
	{
		CDA.open_browser();
		CDA.Create_Deposit_Accounts_Test_Runner();
		CDA.close_browser();
	}
	
	@Test(groups = {"Regresssion_Test_Case"} , priority = 1 )
	public void Test3() throws IOException
	{
		kbl.open_browser();
		kbl.Login_Test_Runner();
		kbl.close_browser();
	}
	
	

}
