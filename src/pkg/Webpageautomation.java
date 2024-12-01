package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webpageautomation
{
	ChromeDriver driver;

	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		
	driver.get("file:///C:/Users/kkswa/OneDrive/Desktop/webpage.html");
	driver.manage().window().maximize();
	}
	@Test
	public void login()
	{
		driver.findElement(By.xpath("/html/body/input[1]")).click();
		Alert a=driver.switchTo().alert();
		String s=a.getText();
		System.out.println("alert is" + s);
		a.accept();

		driver.findElement(By.name("firstname")).sendKeys("swathi");
		driver.findElement(By.name("lastname")).sendKeys("kk");
		driver.findElement(By.xpath("/html/body/input[4]")).click();

		

		
	}
}
