package testNGpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FbParameterisation {
ChromeDriver driver;
@BeforeTest(alwaysRun=true)
public void setUp()
{
	driver=new ChromeDriver();
	driver.get("http://www.facebook.com");
		
}
@Parameters({"username","pass"})
@Test
public void test(String username,String password)
{
	 driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
	 driver.findElement(By.id("pass")).sendKeys("abc@d1213");
	 driver.findElement(By.name("submit")).click();
}



	
	
	
}
