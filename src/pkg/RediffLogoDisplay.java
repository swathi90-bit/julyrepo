package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffLogoDisplay 

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
public void logo()
{
	WebElement rediflogo=driver.findElement(By.xpath("//*[@id='wrapper']/table[1]/tbody/tr[1]/td[1]/img"));
	boolean logo=rediflogo.isDisplayed();
	if(logo==true)
	{
		System.out.println("logo is present");
	}
	else
		System.out.println("logo is not present");
}
}
