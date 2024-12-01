package pkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearch
{
ChromeDriver driver;
@Before
public void setUp()
{
	driver =new ChromeDriver();
	driver.get("http://amazon.in");
	driver.manage().window().maximize();
}
@Test
public void amazonSearch()
{
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mobiles");//search mobile
	driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();//click search button
	driver.findElement(By.xpath("//div[@id='nav-xshop']/a[3]")).click();//click on sell link
	driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();//click on signin
	driver.navigate().back();
	driver.findElement(By.xpath("//span[@id='nav-cart-count']")).click();//click on  cart
}
@After
public void tearDown()
{
	driver.quit();
}
}
