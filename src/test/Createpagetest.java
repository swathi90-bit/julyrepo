package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import page.Baseclass;
import page.Createpage;

public class Createpagetest extends Baseclass
{
	
	//do not give webdriver driver in test class.instead make base class protected webdriver
@Test
public void testmtd() 
{
	Createpage ob=new Createpage(driver);
	System.out.println("from test class");
	
	ob.clickcreatepage();
	ob.textverification();
	ob.signupmtd();
	
}
}
