package Log_SignUP_Page_Locaters;

import java.io.IOException;

import org.openqa.selenium.By;

import Browser_Config.Browser_Launcher;
import Data_Server.DataDriven;

public class Login_Page_Locaters extends Browser_Launcher 
{
	
	
	
	String Bank_IDs = "67674";
	String Banker_Username = "banker";
	String Banker_Password = "jack1234";
	
	
	public void Login_Page() throws IOException
	{
	
		
		driver.findElement(By.xpath("/html/body/table/tbody/tr[1]/td/table/tbody/tr/td[2]/form/table/tbody/tr[2]/td[2]/span/input")).sendKeys(Bank_IDs);
		
		driver.findElement(By.xpath("/html/body/table/tbody/tr[1]/td/table/tbody/tr/td[2]/form/table/tbody/tr[2]/td[4]/span/input")).sendKeys(Banker_Username);
		
		driver.findElement(By.xpath("/html/body/table/tbody/tr[1]/td/table/tbody/tr/td[2]/form/table/tbody/tr[2]/td[6]/span/input")).sendKeys(Banker_Password);

		driver.findElement(By.xpath("//*[@id=\"clicked_when_enter_id\"]")).submit();

	}
	

}
