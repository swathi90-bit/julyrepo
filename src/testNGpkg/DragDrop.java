package testNGpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DragDrop {
	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
	}
	@Test
	public void test()
	{
		
		Actions act=new Actions(driver);
		WebElement bank=driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
		WebElement acnt=driver.findElement(By.xpath("/html/body/section/div/div/main/div/div/div/div/div/div/table/tbody/tr/td[1]/table/tbody/tr/td[1]/div/div/ol/li"));
        act.dragAndDrop(bank, acnt).perform();
        
		WebElement money=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement amnt=driver.findElement(By.xpath("/html/body/section/div/div/main/div/div/div/div/div/div/table/tbody/tr/td[1]/table/tbody/tr/td[2]/div/div/ol/li"));
		act.dragAndDrop(money, amnt).perform();
      
		WebElement equity=driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
		WebElement creditacnt=driver.findElement(By.xpath("/html/body/section/div/div/main/div/div/div/div/div/div/table/tbody/tr/td[2]/table/tbody/tr/td[1]/div/div/ol/li"));
		act.dragAndDrop(equity, creditacnt).perform();
		
		WebElement cash=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement amnt2=driver.findElement(By.xpath("//*[@id=\"amt8\"]/li"));
		act.dragAndDrop(cash,amnt2).clickAndHold().perform();


		

		
		
	}
	
	

}
