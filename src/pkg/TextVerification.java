package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class TextVerification {
	static String baseurl="https://www.google.co.in/";

	public static void main(String[] args) {
ChromeDriver  driver=new ChromeDriver();
driver.get(baseurl);
String s=driver.getPageSource();
String expected="Gmail";
if(s.contains(expected))
{
	System.out.println("true");
}
else
{
	System.out.println("false");
}
driver.close();
	}

}
