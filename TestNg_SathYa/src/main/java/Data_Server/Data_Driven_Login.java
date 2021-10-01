package Data_Server;

import java.io.IOException;

import org.openqa.selenium.By;

import Browser_Config.Browser_Launcher;

public class Data_Driven_Login extends Browser_Launcher
{

	DataDriven ddt = new DataDriven();

	
	
	public void Login_Page() throws IOException
	{
		String Bank_IDs = ddt.getdata("sname", 2, 0);
		String Banker_Username = ddt.getdata("sname", 2, 1);
		String Banker_Password = ddt.getdata("sname", 2, 2);
		
		driver.findElement(By.xpath("/html/body/table/tbody/tr[1]/td/table/tbody/tr/td[2]/form/table/tbody/tr[2]/td[2]/span/input")).sendKeys(Bank_IDs);
		
		driver.findElement(By.xpath("/html/body/table/tbody/tr[1]/td/table/tbody/tr/td[2]/form/table/tbody/tr[2]/td[4]/span/input")).sendKeys(Banker_Username);
		
		driver.findElement(By.xpath("/html/body/table/tbody/tr[1]/td/table/tbody/tr/td[2]/form/table/tbody/tr[2]/td[6]/span/input")).sendKeys(Banker_Password);

		driver.findElement(By.xpath("//*[@id=\"clicked_when_enter_id\"]")).submit();

	}

}
