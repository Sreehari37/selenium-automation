package Junit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertquestion<alert> {

	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver =new ChromeDriver();
		driver.get("file:///C:/Users/SreeLakshmi/OneDrive/Desktop/alert.html");
		
	}
	@Test
	public void Alert()
	{
		driver.findElement(By.xpath("//input[@type='button']")).click();
		org.openqa.selenium.Alert a=driver.switchTo().alert();
		String alerttext=a.getText();
		System.out.println("alerttext"+alerttext);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("sreehari");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("R");
		driver.findElement(By.xpath("//input[@value='submit']")).click();
		
	}
	
	
	
}
