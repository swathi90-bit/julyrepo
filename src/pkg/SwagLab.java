package pkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLab
{
ChromeDriver driver;
@Before
public void setUp()
{
	driver=new ChromeDriver ();
	driver.get("https://www.saucedemo.com/");
	driver.manage().window().maximize();
};
@Test
public void swagLogin()
{
	driver.findElement(By.id("user-name")).sendKeys("standard_user");
	driver.findElement(By.id("password")).sendKeys("secret_sauce");
	driver.findElement(By.id("login-button")).click();
	driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();//add to cart
	driver.findElement(By.xpath("//div[@id='shopping_cart_container']/a[1]/span[1]")).click();//cart
	driver.findElement(By.id("checkout")).click();//chk out
	driver.findElement(By.id("first-name")).sendKeys("swathi");//frst name
	driver.findElement(By.id("last-name")).sendKeys("legenesh");//last name
	driver.findElement(By.id("postal-code")).sendKeys("673316");
	driver.findElement(By.id("continue")).click();
	driver.findElement(By.id("finish")).click();
	
}
//@After
//public void tearDown()
//{
	//driver.quit();
//}

}
