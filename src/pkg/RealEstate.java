package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RealEstate
{
ChromeDriver driver;
@Before
public void setUp()
{
driver=new ChromeDriver();
driver.get("https://www.facebook.com");

}
@Test
public void login()
{
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("kkswathi@gmail.com");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("12345");
	driver.findElement(By.xpath("//input[@name='login']")).click();
}
}
