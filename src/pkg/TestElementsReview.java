package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestElementsReview {
	ChromeDriver driver;
	@Before

		public void setUp()
		{
		driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		}
	@Test
	public void fblogin()
	{
		 driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		 driver.findElement(By.id("pass")).sendKeys("abc@d1213");
		 driver.findElement(By.name("submit")).click();
		 Actions act=new Actions(driver);
		
	}


}
