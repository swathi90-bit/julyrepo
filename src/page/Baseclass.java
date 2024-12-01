package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Baseclass
{
protected WebDriver driver;
@BeforeTest
public void setUp()
{
driver=new ChromeDriver();
driver.get("http://www.facebook.com");

}

}
