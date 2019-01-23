package Datas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Elements {
	
    //Path of Login class
	By user=By.xpath("//input[@class='_2zrpKA']");
	By pswd=By.xpath("//input[@class='_2zrpKA _3v41xv']");
	By btn=By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']");
	
	//Path of Search class
	By search1=By.cssSelector("input.LM6RPg ");
	By search2=By.cssSelector("button.vh79eN");
	
	//Path of Selectopt class
	By serachopt1=By.xpath("//div[@class='_3wU53n'][text()='Midea 7 kg Fully Automatic Front Load Washing Machine White']");
	
	//Path of Buynow class
	By viewp1=By.xpath("//button[@class='_2AkmmA _1Q_hL_']");
	By viewp2=By.xpath("//button[@class='_2AkmmA _2Rr3iH']");
	By buy=By.xpath("//button[@class='_2AkmmA _2Npkh4 _2kuvG8 _7UHT_c']");
	
	//Path of Logout class
	By lgout1=By.cssSelector("#container > div > header > div._1tz-RS > div > div._1Wr4v5 > div:nth-child(1) > div > div > svg>path[class='_2GxHSA']");
	By lgout2=By.cssSelector("ul._3Ji-EC li._2sYLhZ:nth-child(9)");
	
	//Login.class
		public By Username(WebDriver driver)
		{
			return user;
		}
		
		public By Password(WebDriver driver)
		{
			return pswd;
		}
		
		public By Button(WebDriver driver)
		{
			return btn;
		}
		
		//Search.class
		public By search11(WebDriver driver)
		{
			return search1;
		}
		
		public By search12(WebDriver driver)
		{
			return search2;
		}
		
		//Selectopt.class
		public By searchopt12(WebDriver driver)
		{
			return serachopt1;
		}
		
		//Buynow.class
		public By viewp11(WebDriver driver)
		{
			return viewp1;
		}
		
		public By viewp12(WebDriver driver)
		{
			return viewp2;
		}
		public By buy12(WebDriver driver)
		{
			return buy;
		}
		
		//Logout.class
		public By lgout11(WebDriver driver)
		{
			return lgout1;
		}
		
		public By lgout12(WebDriver driver)
		{
			return lgout2;
		}
		
		
		
}

