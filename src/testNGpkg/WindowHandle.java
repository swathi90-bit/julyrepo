package testNGpkg;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WindowHandle
{
	WebDriver driver;
	
@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
	driver.get("http://www.google.com");
	driver.manage().window().maximize();
	
}
@Test
public void testmthd()
{
	driver.switchTo().newWindow(WindowType.TAB);
	driver.get("http://www.facebook.com");
	driver.switchTo().newWindow(WindowType.TAB);
	driver.get("http://www.ebay.com");
	ArrayList<String> windowdetails=new ArrayList<>(driver.getWindowHandles());
	driver.switchTo().window(windowdetails.get(1));
}
}
