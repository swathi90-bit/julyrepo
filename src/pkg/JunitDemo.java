package pkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class JunitDemo 
{
ChromeDriver driver;
@Before
public void setUp()
{
driver=new ChromeDriver(); 
driver.get("http://www.google.com");
}
@Test
public void titleVerification()
{
	String act=driver.getTitle();
	String exp=	"google";
	if(act.equals(exp))
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
	}
}
@After
public void tearDown()
{
	driver.close();
}
}