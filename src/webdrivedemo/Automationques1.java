package webdrivedemo;

import org.openqa.selenium.chrome.ChromeDriver;


public class Automationques1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//chromedriver
				//edgedriver
				//firefoxdriver
				
				ChromeDriver driver=new ChromeDriver();//open browser
				driver.get("https://www.google.com");//open google
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
				
				driver.close();
				//driver.quit();--to quit browser
				//driver.close();--to close current tab
	}

}