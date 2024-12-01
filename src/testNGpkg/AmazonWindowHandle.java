package testNGpkg;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonWindowHandle
{
WebDriver driver;
@BeforeTest
public void setUp()
{
	driver =new ChromeDriver();
	driver.get("http://amazon.in");
	driver.manage().window().maximize();
}
@Test
public void testmthd() throws InterruptedException
{
	driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("phone");
	driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
	driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
	String newpage=driver.getWindowHandle();
	System.out.println(newpage+"is the current page");
    //driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
    ArrayList<String> windowdetails=new ArrayList<>(driver.getWindowHandles());
	driver.switchTo().window(windowdetails.get(1));
	Thread.sleep(2000);
    driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();

	
}
}
        