package Junit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class google {
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com/webhp?authuser=3");
						
	}
	@Test
	public void googlesearch()
	{
		WebElement searchfield=driver.findElement(By.name("q"));
		searchfield.sendKeys("Goat movie",Keys.ENTER);
		
		
	}
	

}