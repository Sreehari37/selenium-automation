package Junit;





import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshot {
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("C:\\Users\\SreeLakshmi\\OneDrive\\Desktop");
	}
	@Test
	public void fb() throws IOException
	{
		TakesScreenshot src = ((TakesScreenshot)driver.getScreenshotAs(OutputType.FILE));
		FileHandler.copy((File) src,new File("c://alertscreenshot.png"));
		
		
		
		
	}

}
