package com.start2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import Datas.Elements;
public class Logout1 {
Elements es=new Elements();
public void logout(WebDriver driver) throws InterruptedException
{
	System.out.println("hello");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	Actions ac=new Actions(driver);
	WebElement td=driver.findElement(es.lgout11(driver));
	
	ac.moveToElement(td).build().perform();
	Thread.sleep(2000);
	driver.findElement(es.lgout12(driver)).click();

	
}
}
