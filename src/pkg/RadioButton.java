package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
	ChromeDriver  driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver ();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
	}
	@Test 
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
}