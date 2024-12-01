package testNGpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FileUploadSendkeys 
{
ChromeDriver driver;
@BeforeTest
public void setUp()
{
	driver=new ChromeDriver();
	driver.get("http://www.demo.guru99.com/test/upload"); 
}
@Test
public void test()
{
driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]")).sendKeys("C:\\Users\\kkswa\\OneDrive\\Desktop\\LUMINAR\\BACKUPRESUMES");
driver.findElement(By.xpath("//*[@id=\"terms\"]")).click()	;
driver.findElement(By.xpath("//*[@id=\"submitbutton\"]")).click();
String text=driver.findElement(By.xpath("//*[@id=\"submitbutton\"]")).getText();
if(text.equals("submit"))
{
	System.out.println("passed");
}
else
	{
	System.out.println("failed");
	} 
	
			
	
}


}
