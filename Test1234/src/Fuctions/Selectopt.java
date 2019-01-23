package Fuctions;

import org.openqa.selenium.WebDriver;
import Datas.Elements;

public class Selectopt {
	Elements es=new Elements();
	public void selectopt(WebDriver driver) throws InterruptedException
	{
		
		driver.findElement(es.searchopt12(driver)).click();
		Thread.sleep(2000);
		
		
	}	
}
