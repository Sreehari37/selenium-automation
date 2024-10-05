package testNg;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testNgdemo {
	
	@BeforeTest
	public void setUp()
	{
		System.out.println("beforetest");
	}
@BeforeMethod
public void urlloading()
{
	System.out.println("beforemethod");
}
@Test
public void test1()
{
	System.out.println("test1");
}
@Test
public void test2()
{
	System.out.println("test2");
}
@Test
public void test3()
{
	System.out.println("test3");
}
@Test
public void test4()
{
	System.out.println("test4");
}
@AfterMethod
public void aftrmethd()
{
	System.out.println("aftermethod");
}
@AfterTest
public void teardown()
{
	System.out.println("aftertest");
}


}
