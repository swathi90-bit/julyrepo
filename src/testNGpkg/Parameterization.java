package testNGpkg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization {
    @Parameters
	@Test
    public void test(String s)
	{
		System.out.println(s);
	}
	

}
