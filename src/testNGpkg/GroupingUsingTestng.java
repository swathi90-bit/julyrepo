package testNGpkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GroupingUsingTestng 
{
	ChromeDriver driver;
	
	
@BeforeTest(alwaysRun=true)
public void setUp()
{
	driver =new ChromeDriver();
	driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	driver.manage().window().maximize();
	
}


@BeforeMethod(alwaysRun=true)
public void bfremethd()
{
	driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
}


@Test(groups="sanity")
public void logo()
{
	WebElement rediflogo=driver.findElement(By.xpath("//*[@id='wrapper']/table[1]/tbody/tr[1]/td[1]/img"));
	boolean logo=rediflogo.isDisplayed();
	if(logo==true)
	{
		System.out.println("logo is present");
	}
	else
		System.out.println("logo is not present");
}


@Test(groups="regression")
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


@Test(groups={"sanity","regression"})
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


@Test (groups="smoke")
public void radio()
{
	WebElement radio=driver.findElement(By.xpath("//*[contains(@name,'gender')]"));
	
	boolean b=radio.isSelected();
	if(b==true)
{
		System.out.println("button is selected");
	}
	else
	{
		System.out.println("not selected");
}
}


@Test (groups="smoke")
public void dropdownTest()
{
	WebElement day=driver.findElement(By.xpath("//*[contains(@name,'DOB_Day')]"));
	Select ob= new Select(day);
	ob.selectByValue("02");
	WebElement month=driver.findElement(By.xpath("//*[contains(@name,'DOB_Month')]"));
	Select ob1=new Select(month);
	ob1.selectByValue("12");
	WebElement year=driver.findElement(By.xpath("//*[contains(@name,'DOB_Year')]"));
	Select ob2= new Select(year);
	ob2.selectByValue("2024");

}










}
