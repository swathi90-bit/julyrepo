package pkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffReg
{
ChromeDriver driver;
@Before
public void setUp()
{
	driver=new ChromeDriver();
	driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	driver.manage().window().maximize();
}
@Test
public void no_Link()
{
List<WebElement> count=driver.findElements(By.tagName("a"));
int a=count.size();
System.out.println("no of links "+a);
int exp=30;
if(a==exp)
{
	System.out.println("expected no of links and actual links are same");
}
else
{
	System.out.println("not same");
}
}
@Test
public void textVerification()
{
String s=driver.getPageSource();
String s1="Create a Rediffmail account";
if (s.contains(s1))
{
	System.out.println("contains the text");
}
else
{
	System.out.println("not contains");
}
}
}

