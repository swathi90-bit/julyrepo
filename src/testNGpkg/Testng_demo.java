dpackage testNGpkg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testng_demo {
	@BeforeTest
	public void setup()
	{
		System.out.println("before test ,browser open ");
	}
@BeforeMethod
public void methd()
{
	System.out.println("url is loading");
}
@Test(priority=1,enabled =false)
public void test1()
{
	System.out.println("test 1 output");
}
@Test(priority=3,enabled=false)
public void test2()
{
	System.out.println("test 2 output");
}
@Test(priority=2,invocationCount=4)
public void test3()
{
	System.out.println("test 3 output");
}
@Test(priority=4)
public void test4()
{
	System.out.println("test 3 output");
}
@AfterMethod
public void aftrmethod()
{
	System.out.println("output of after method");
}
@AfterTest
public void aftertestmethod()
{
	System.out.println("output of after test method");
}

}
