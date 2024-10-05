package Junit;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rishiherbal {
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://rishiherbalindia.linker.store/");
		
	}
	@Test
	public void test()
	{
		String actual=driver.getTitle();
		String expected="Rishi Herbal India";
		if(actual.endsWith(expected))
		{
			System.out.println("same as expected title");
		}
		else
		{
			System.out.println("incorrect expected title");
		}
	}
	@Test
	public void link()
	{
	List<WebElement> li=driver.findElements(By.tagName("a"));
	System.out.println("link="+li.size());
	if(li.size()==100)
	{
		System.out.println("pass");//same as expected
	}
	else
	{
		System.out.println("fail");// not expected as same
	}
	}
	@Test
	public void food()
	{
		String s=driver.getPageSource();
		String text="food";
		if(s.contains(text))
		{
			System.out.println("text is present");
			
		}
		else
		{
			System.out.println("text is not present");
		}
		
		
	}
	@Test
	public void health()
	{
		driver.findElement(By.xpath("//a[@class='ls-nav-link']")).click();	}

}
