package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLabXpath 
{
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		 driver=new ChromeDriver();
		 driver.get("http://saucedemo.com");
		 driver.manage().window().maximize();
		 
	}
@Test
public void login()
{
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("standard_user");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("secret_sauce");
	driver.findElement(By.xpath("//input[@id='login-button']")).click();
	driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']")).click();
	driver.findElement(By.xpath("//div[@id='shopping_cart_container']/a[1]")).click();
	driver.findElement(By.xpath("//button[@id='checkout']")).click();
	driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("swathi");
	driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("kk");
	driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("123456");
	driver.findElement(By.xpath("//input[@id='continue']")).click();
	driver.findElement(By.xpath("//button[@name='finish']")).click();
	driver.navigate().back();

	
}
}
