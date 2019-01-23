package Datas;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browsers {
	public WebDriver driver;
	
public void brows(String Value) throws Throwable
{

	
	if(Value.equals("ie"))
	{
		System.setProperty("webdriver.ie.driver", "C:\\Users\\deepa.vadivel\\Downloads\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");
		driver=new InternetExplorerDriver();
	}
	else if(Value.equalsIgnoreCase("chrome"))
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\deepa.vadivel\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	}
	else if(Value.equalsIgnoreCase("firefox"))
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\deepa.vadivel\\Downloads\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		driver=new FirefoxDriver();
	}
}

}
