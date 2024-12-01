package test;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import page.FbLogin;

public class FbloginTest
{
WebDriver driver;
@BeforeTest
public void setUp()
{
	driver=new ChromeDriver();
	driver.get("http://www.facebook.com");
	
}
@Test
	public void testlogin()
	{
	FbLogin ob=new FbLogin(driver);
	ob.setvalue("abc@gmail.com","asasd");
	ob.login();
	}

}	
	
	
	
	
	
	

