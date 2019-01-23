package com.start1;

import java.util.ArrayList;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import Fuctions.*;
import com.start2.*;
import Datas.*;
public class Base1 extends Browsers {

FileData fs=new FileData();
Search st=PageFactory.initElements(driver, Search.class);
Selectopt st1=PageFactory.initElements(driver, Selectopt.class);
Buynow st2=PageFactory.initElements(driver, Buynow.class);
Login1 g=PageFactory.initElements(driver, Login1.class);
Logout1 lg=PageFactory.initElements(driver, Logout1.class);

@Test
@Parameters({"browser"})
public void configM(String browser) throws Throwable
{
	System.out.println(browser);
	brows(browser);
	Thread.sleep(2000);
	System.out.println(fs.PropertiesgetObj("url"));
	Thread.sleep(2000);

		driver.get(fs.PropertiesgetObj("url"));
		driver.manage().window().maximize();
		Thread.sleep(2000);
		g.login(driver);
		Thread.sleep(2000);
		st.search(driver);
		Thread.sleep(2000);
		String oldtab=driver.getWindowHandle();
		st1.selectopt(driver);
		ArrayList<String> newtab=new ArrayList<String>(driver.getWindowHandles());

		for (final String handle : newtab)
		{
		    driver.switchTo().window(handle);
		}
		Thread.sleep(2000);
		st2.buynow(driver);
		Thread.sleep(2000);
		driver.close();
		
		driver.switchTo().window(oldtab);
		lg.logout(driver);
		driver.close();
	}
	
}



