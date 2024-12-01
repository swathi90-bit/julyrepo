package testNGpkg;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DatePicker1 {
	WebDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		
	}
	@Test
	public void datepicker()
	{
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
driver.findElement(By.xpath("//*[@id=\"datepicker1\"]")).click();
datepicker_method("december 2024","26");

	}
	private void datepicker_method(String exp_month,String exp_date)
	{
		while(true)
		{
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

			String month=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[2]")).getText();
	        System.out.println("current month is "+month);
	        if(month.equals(exp_month))
	        {
	        	break;
	        }
	        else
	        {
	        	driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span")).click();
	        	        
	        }

List<WebElement> date=driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr/td/a"));
	        for(WebElement d:date)
	        {
	        	String date_text=d.getText();
	        	if(date_text.equals(exp_date))
	        	{
	        		d.click();
		        	break;
	        	}
	        	
	        }
		}
	}
	
	

}
