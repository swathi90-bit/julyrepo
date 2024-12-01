package pkg;

import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;

import org.junit.Test;

public class Responsecode 
{
String link="http://www.google.com";
@Test
public void responsecode() throws Exception
{
	URI ob=new URI(link);
	HttpURLConnection con=(HttpURLConnection)ob.toURL().openConnection();
	int code=con.getResponseCode();
	System.out.println("responsecode "+code);
	
}
}
