package testNGpkg;

import java.awt.Desktop.Action;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RightclickDoubleclick
{
	private static final String Actions = null;
	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
	}
	@Test
	public void test()
	{
		
		WebElement rightclickme=driver.findElement(By.xpath("/html/body/span"));
		Actions act=new Actions(driver);
		act.contextClick(rightclickme);
		WebElement edit=driver.findElement(By.xpath("/html/body/ul/li[1]/span"));

		act.click(edit);
		WebElement d=driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		act.doubleClick(d);
		act.perform();
		Alert a=driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
				
	}
}
