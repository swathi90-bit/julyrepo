package testNGpkg;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DataDrivenusingexcel 
{
WebDriver driver;
@BeforeTest
public void before_test()
{
	driver=new ChromeDriver();
	driver.get("https://keralaproperty.in/member/myhome/");
}
@Test
public void test() throws IOException, InterruptedException
{
	FileInputStream f=new FileInputStream("C:\\Users\\kkswa\\Downloads\\datadriven testing.xlsx");
	XSSFWorkbook wb=new XSSFWorkbook(f);
	XSSFSheet sh=wb.getSheet("sheet1");
	int row=sh.getLastRowNum();
	System.out.println("no of row = "+row);
	for(int i=1;i<=row;i++)
	{
		String email=sh.getRow(i).getCell(0).getStringCellValue();
		String password=sh.getRow(i).getCell(1).getStringCellValue();
		System.out.println(email);
		System.out.println(password);
		driver.findElement(By.xpath("//*[@id=\"ulogin\"]")).sendKeys(email);
		driver.findElement(By.xpath("//*[@id=\"upass\"]")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id=\"sub_logbtn\"]")).click();
		Thread.sleep(2000);
		driver.navigate().refresh();
	}
	
}
}
