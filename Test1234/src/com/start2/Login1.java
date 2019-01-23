package com.start2;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;

import com.start1.FileData;
import Datas.*;

public class Login1 {
	FileData fs=new FileData();
	Elements es=new Elements();
	public void login(WebDriver driver) throws IOException, InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(es.Username(driver)).sendKeys(fs.PropertiesgetObj("username"));
		driver.findElement(es.Password(driver)).sendKeys(fs.PropertiesgetObj("password"));
		driver.findElement(es.Button(driver)).click();
	}

}
