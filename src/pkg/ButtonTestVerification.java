package pkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonTestVerification 
{
	ChromeDriver  driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver ();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
	}
	@Test 
	public void buttonmtd()
	{
		String s=driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[7]/td[3]/input[1]")).getAttribute("value");
		//String s1="Check availability";
		
		
		
		if(s.equals("Check availability"))
		{
			System.out.println("same");
		}
		else
		{
			System.out.println("fail");
		}
	}
		@After
		public void tearDown()
		{
		driver.close();	
		}
	}

