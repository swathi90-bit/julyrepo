package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class TextVerifiction2 {
	static String baseurl="https://www.facebook.com/";

	public static void main(String[] args) {
ChromeDriver driver=new ChromeDriver();
driver.get(baseurl); 
String s=driver.getPageSource();
String text="swathi";
if(s.contains(text))
{
	System.out.println("pass");
}
else
{
	System.out.println("false");
	
}
driver.close();
	}

}
