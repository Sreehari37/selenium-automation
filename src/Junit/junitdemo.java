package Junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class junitdemo {
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}
	@Test
	public void titleverification()
	{
		String actualtitle=driver.getTitle();
		String exptitle="Google";
		if(actualtitle.equals(exptitle))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
	@Test
	public void testverification()
	{
		String a=driver.getCastIssueMessage();
		if(a.contains("hello"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
		@After
		public void end()
		{
			driver.close();
		}
		
				
	

}
