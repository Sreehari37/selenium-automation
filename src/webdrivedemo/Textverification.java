package webdrivedemo;

import org.openqa.selenium.chrome.ChromeDriver;

public class Textverification {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String s=driver.getPageSource();
	if(s.contains("About"))
		{
			System.out.println("pass");
		}
	else
	{
		System.out.println("fail");
	}
	driver.close();
	}

}
