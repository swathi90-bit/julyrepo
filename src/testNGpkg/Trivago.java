package testNGpkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Trivago 
{
	WebDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.booking.com/");
		driver.manage().window().maximize();
				
	}
	@Test
	public void test() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id=\"indexsearch\"]/div[2]/div/form/div/div[2]/div/div/button[1]/span")).click();
		Thread.sleep(2000);
		//driver.navigate().refresh();
		//driver.navigate().refresh();
		//driver.manage().wait(300);
		datepicker_method1("november 2024","23");
		datepicker_method2("november 2024","25");
		
	}

	private void datepicker_method1(String exp_month,String exp_date)
	{
		while(true)
		{
			String month=driver.findElement(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/div/div[1]/h3")).getText();
	        System.out.println("current month is "+month);
	        if(month.equals(exp_month))
	        {
	        	break;
	        }
	        else
	        {
	        	driver.findElement(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/button/span/span/svg")).click();
	        	        
	        }

List<WebElement> date=driver.findElements(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/div/div[1]/table/tbody/tr/td/span"));
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
		private void datepicker_method2(String exp_month,String exp_date)
		{
			while(true)
			{
				String month=driver.findElement(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/div/div[1]/h3")).getText();
		        System.out.println("current month is "+month);
		        if(month.equals(exp_month))
		        {
		        	break;
		        }
		        else
		        {
		        	driver.findElement(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/button/span/span/svg")).click();
		        	        
		        }

	List<WebElement> date=driver.findElements(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/div/div[1]/table/tbody/tr/td/span"));
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
	    	
