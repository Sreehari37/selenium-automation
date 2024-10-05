package Junit;

import java.net.HttpURLConnection;
import java.net.URI;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkdisplay {
	ChromeDriver driver;
	@Before
	public void setUp()
	
	{
		driver =new ChromeDriver();
		driver.get("https://www.google.co.in/");
		
		
	}
	@Test
	public void test()
	
	{
		List<WebElement> li=driver.findElements(By.tagName("a"));
		System.out.println("link="+li.size());
		
		for(WebElement ele:li)
		{
			String link=ele.getAttribute("href");
			verifylink(link);
			//String linktext=ele.getText();
			//System.out.println(link+"----------"+linktext);
			
		}
		
		
	}
private void verifylink(String link) {
	try
	{
		URI ob=new URI(link);
		HttpURLConnection c=(HttpURLConnection)ob.toURL().openConnection();
		if (c.getResponseCode()==200)
		{
			System.out.println("successfull responce code is 200"+link);
		}
		else if (c.getResponseCode()==404)
		{
			System.out.println("broken link response code is 404"+link);
		}
		
	
}
}
