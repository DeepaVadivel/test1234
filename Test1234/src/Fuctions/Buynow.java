package Fuctions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import Datas.Elements;
public class Buynow {
	Elements es=new Elements();
	public void buynow(WebDriver driver) throws InterruptedException
	{
		
		Thread.sleep(2000);
		Actions as=new Actions(driver);
		WebElement tg=driver.findElement(es.viewp11(driver));
		as.moveToElement(tg).click().build().perform();
		Thread.sleep(2000);
		driver.findElement(es.viewp12(driver)).click();
		Thread.sleep(2000);
		WebElement ts=driver.findElement(es.buy12(driver));
		as.moveToElement(ts).click().build().perform();
		Thread.sleep(3000);
	}
}
