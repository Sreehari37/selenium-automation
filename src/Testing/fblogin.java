package Testing;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class fblogin {
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/home.php");
	}
@Test
public void fblogin()
{
	driver.findElement(By.name("email")).sendKeys("sree@gmail.com");
	driver.findElement(By.name("pass")).sendKeys("abcd");
	driver.findElement(By.name("login")).click();
	String expurl="https://www.facebook.com/login.php/";
	String actualurl=driver.getCurrentUrl();
	if(expurl.equals(actualurl))
	{
		System.out.println("login successfull");
	}
	else
	{
		System.out.println("login unsuccessfull");
	}
}
}
