package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch 
{
	ChromeDriver driver;
@Before
public void setUp()
{
	driver=new ChromeDriver();
	driver.get("http://www.google.com");
	driver.manage().window().maximize();
	
}
@Test
public void search()
{
	WebElement searchfield=driver.findElement(By.name("q"));
	searchfield.sendKeys("books",Keys.ENTER);
}
}
