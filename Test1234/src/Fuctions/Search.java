package Fuctions;

import org.openqa.selenium.WebDriver;
import Datas.Elements;
import com.start1.*;
public class Search {
	FileData fd=new FileData();
	Elements es=new Elements();
public void search(WebDriver driver) throws InterruptedException, Throwable
{
	
	driver.findElement(es.search11(driver)).sendKeys(fd.PropertiesgetObj("search1"));
	Thread.sleep(2000);
	driver.findElement(es.search12(driver)).click();
	Thread.sleep(2000);
}
}
