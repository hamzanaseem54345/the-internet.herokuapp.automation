package com.lm.qa.pages;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.lm.qa.base.TestBase;

public abstract class DriverClass {
	
	
		private  WebDriver driver ;
		public static Properties prop;
		public  WebDriver getDriver()
		{
			//System.setProperty("webdriver.chrome.driver","D:/Drivers-Selenium/chromedriver.exe");
			//driver= new ChromeDriver();
		    return driver;
		}
		/*public void open(String url)
		{
			getDriver().get(prop.getProperty("url"));
		}
		public  void close()
		{
		    getDriver().close();
		}*/
		public void setDriver(WebDriver driver) {
			this.driver = driver;
		}
		}

