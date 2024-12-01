package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		
String actualtitle=driver.getTitle();	
String expectedtitle="Google";
if(actualtitle.equals(expectedtitle))

{
	System.out.println("same ");
}
else
{
	System.out.println("not same ");
}
	}

}
