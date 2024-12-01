package pkg;

import java.io.File;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot
{
	ChromeDriver driver;
	@Before

		public void setUp()
		{
		driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		
		}
 @Test 
 public void fbLogin() throws Exception 
 { // PAGE SCREENSHOT 
	 //File s = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
	 //FileHandler.copy(s, new File("Downloads://screenshot1.png"));
		
		//ELEMENT SCREENSHOT
		WebElement button=driver.findElement(By.name("login"));
		File s1=button.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(s1,new File("./Screenshot/buttonscreenshot.png"));
		
		
	}
}
