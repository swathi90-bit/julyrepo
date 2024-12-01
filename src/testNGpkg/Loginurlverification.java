package testNGpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Loginurlverification 
{
	
	
	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://keralaproperty.in/member/myhome/"); 
	}
	@Test
	public void test() throws InterruptedException
	{
driver.findElement(By.xpath("//*[@id=\"ulogin\"]")).sendKeys("kkswathi6@gmail.com");
driver.findElement(By.xpath("//*[@id=\"upass\"]")).sendKeys("asdf1234");
driver.findElement(By.xpath("//*[@id=\"sub_logbtn\"]")).click();
Thread.sleep(3000);
String current_url=driver.getCurrentUrl();
	String exp_url="https://keralaproperty.in/member/myhome/";
	System.out.println(current_url);
	System.out.println(exp_url);
	if(exp_url.equals(current_url))
	{
		System.out.println("url are same");
	}
	else
	{
		System.out.println("url are not same");
	}
	}
}
