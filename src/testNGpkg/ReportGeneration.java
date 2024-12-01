package testNGpkg;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class ReportGeneration 
{
WebDriver driver;
String baseurl="http://www.facebook.com";
ExtentSparkReporter reporter;
ExtentTest test;
ExtentReports extent;
@BeforeTest
public void beforetest()
{   //pass the location to create the report
	reporter=new ExtentSparkReporter("./Report/report of the program.html");
	
	reporter.config().setDocumentTitle("automation test report");
	reporter.config().setReportName("functional test");
	reporter.config().setTheme(Theme.DARK);//set the theme
	
	extent=new ExtentReports();//environment details
	extent.attachReporter(reporter);//attach the report to project
	extent.setSystemInfo("hostname", "local host");
	extent.setSystemInfo("tester name","swathi");
	extent.setSystemInfo("browser name","chrome");
	
	driver=new ChromeDriver();
}
@BeforeMethod
public void setUp()
{
	driver.get(baseurl);
		
}
@Test 
public void buttonmtd()
{
test=extent.createTest("fbtitleverification");
String exp="facebook";
String act=driver.getTitle();
Assert.assertEquals(exp,act);

}
@AfterTest
public void tearDown()
{
	extent.flush();
}

@AfterMethod//report generation happens here
//itestresult is interface for report generation in testNG PREVIOUSLY excecuted prgrm status
public void browserclose(ITestResult result)throws IOException
{
	if(result.getStatus()==ITestResult.FAILURE)
	{
		test.log(Status.FAIL, "test case failed"+result.getName());
	}
	else if(result.getStatus()==ITestResult.SKIP)
	{
		test.log(Status.SKIP, "test case skipped"+result.getName());
	}
	if(result.getStatus()==ITestResult.SUCCESS)
	{
		test.log(Status.PASS, "test case failed"+result.getName());
	}
}

	
	
}



