package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Createpage extends Baseclass
{
WebDriver driver;


@FindBy(xpath="/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[2]/a")
WebElement createapageclick;
@FindBy(xpath="//*[@id=\"headerInnerContainer\"]/div[1]")
WebElement text;
@FindBy(xpath="//*[@id=\"blueBarDOMInspector\"]/div/div[2]/div/div/span/a")
WebElement signup;

public Createpage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver,this);

	System.out.println("from page class");
	
}
public void clickcreatepage()
{
	createapageclick.click();
}

public void textverification()
{
	String s=driver.getPageSource();
	String expected="Create a Page";
	if(s.contains(expected))
	{
		System.out.println("true");
	}
	else
	{
		System.out.println("false");
	}	

}
public void signupmtd()
{
	signup.click();
}


	
	
	
	
	
	
	
	
	
}
