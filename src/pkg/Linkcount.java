package pkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkcount
{
ChromeDriver driver;
@Before
public void setUp()
{
	driver=new ChromeDriver();
	driver.get("http://www.facebook.com");
	driver.manage().window().maximize();
}
@Test
public void fblogin()
{
	List<WebElement> li=driver.findElements(By.tagName("a"));
	int  link_count=li.size();
	System.out.println("total no of links "+li.size());
	
	for(WebElement link:li)
	{
	 String links=link.getAttribute("href");
	 System.out.println(links);
	 String link_text=link.getText();
	 System.out.println(link_text);
	}
	int  exp_count=50;
	if( exp_count==link_count)
	{
		System.out.println("LINK COUNT IS AS EXPECTED");
	}
	else
	{
		System.out.println("LINK COUNT IS NOT AS EXPECTED");
	}
	
}
}
