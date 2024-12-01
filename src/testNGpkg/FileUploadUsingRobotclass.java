package testNGpkg;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FileUploadUsingRobotclass 
{
WebDriver  driver;
@BeforeTest
public void setUP()
{   driver=new ChromeDriver();
}
@Test
public void test() throws AWTException
{
	driver.get("https://www.ilovepdf.com/word_to_pdf");

	driver.findElement(By.xpath("//*[@id=\"pickfiles\"]")).click();
    fileUpload("C:\\Users\\kkswa\\Downloads\\robotfileupload.docx");
}

public void fileUpload(String p) throws AWTException
{
	StringSelection strslctn=new StringSelection(p);//copy the content
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strslctn, null);//set the content
	
	 
	Robot robot=new Robot();
	robot.keyPress(KeyEvent.VK_CONTROL);//paste the content
	robot.keyPress(KeyEvent.VK_C);
	robot.keyRelease(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	//robot.delay(200);
	
	
}
}
